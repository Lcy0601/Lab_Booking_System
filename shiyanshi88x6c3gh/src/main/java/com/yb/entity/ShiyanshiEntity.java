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
 * 实验室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@TableName("shiyanshi")
@Data
public class ShiyanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {
		
	}
	
	public ShiyanshiEntity(T t) {
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
	 * 图片
	 */
	private String tupian;
	
	/**
	 * 实验室位置
	 */
	private String shiyanshiweizhi;
	
	/**
	 * 仪器配置
	 */
	private String yiqipeizhi;
	
	/**
	 * 容量
	 */
	private String rongliang;
	
	/**
	 * 可预约次数
	 */
	private Integer reduciblenum;
	
	/**
	 * 开放时间
	 */
	private String kaifangshijian;
	
	/**
	 * 预约规则
	 */
	private String yuyueguize;
	
	/**
	 * 环境介绍
	 */
	private String huanjingjieshao;
	
	/**
	 * 评论数
	 */
	private Integer discussnum;
	
	/**
	 * 评分
	 */
	private Double totalscore;
	
	/**
	 * 收藏数
	 */
	private Integer storeupnum;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
