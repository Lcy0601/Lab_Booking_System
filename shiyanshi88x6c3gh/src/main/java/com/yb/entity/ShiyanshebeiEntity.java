package com.yb.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.*;
import org.springframework.beans.BeanUtils;
import com.baomidou.mybatisplus.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 实验设备
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@TableName("shiyanshebei")
@Data
public class ShiyanshebeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanshebeiEntity() {
		
	}
	
	public ShiyanshebeiEntity(T t) {
		try {
			BeanUtils.copyProperties(t,this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 设备编号
	 */
	private String shebeibianhao;
	
	/**
	 * 设备名称
	 */
	private String shebeimingcheng;
	
	/**
	 * 设备分类
	 */
	private String shebeifenlei;
	
	/**
	 * 院系
	 */
	private String yuanxi;
	
	/**
	 * 数量
	 */
	private Integer shuliang;
	
	/**
	 * 封面
	 */
	private String fengmian;
	
	/**
	 * 存放地点
	 */
	private String cunfangdidian;
	
	/**
	 * 型号
	 */
	private String xinghao;
	
	/**
	 * 适合实验
	 */
	private String shiheshiyan;
	
	/**
	 * 使用说明
	 */
	private String shiyongshuoming;
	
	/**
	 * 简介
	 */
	private String jianjie;
	
	/**
	 * 上下架
	 */
	private Integer onshelves;
	
	/**
	 * 收藏数
	 */
	private Integer storeupnum;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
