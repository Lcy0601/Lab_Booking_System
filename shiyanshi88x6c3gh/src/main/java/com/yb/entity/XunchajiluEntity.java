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
 * 巡查记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
@TableName("xunchajilu")
@Data
public class XunchajiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XunchajiluEntity() {
		
	}
	
	public XunchajiluEntity(T t) {
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
	 * 编号
	 */
	private String bianhao;
	
	/**
	 * 实验室名称
	 */
	private String shiyanshimingcheng;
	
	/**
	 * 实验室类型
	 */
	private String shiyanshileixing;
	
	/**
	 * 院系
	 */
	private String yuanxi;
	
	/**
	 * 实验室位置
	 */
	private String shiyanshiweizhi;
	
	/**
	 * 仪器配置
	 */
	private String yiqipeizhi;
	
	/**
	 * 现场照片
	 */
	private String xianchangzhaopian;
	
	/**
	 * 巡查项目
	 */
	private String xunchaxiangmu;
	
	/**
	 * 巡查时间
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date xunchashijian;
	
	/**
	 * 巡查记录
	 */
	private String xunchajilu;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
