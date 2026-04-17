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
 * 隐患处理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@TableName("yinhuanchuli")
@Data
public class YinhuanchuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinhuanchuliEntity() {
		
	}
	
	public YinhuanchuliEntity(T t) {
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
	 * 预约编号
	 */
	private String yuyuebianhao;
	
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
	 * 学生学号
	 */
	private String xueshengxuehao;
	
	/**
	 * 学生姓名
	 */
	private String xueshengxingming;
	
	/**
	 * 手机号
	 */
	private String shoujihao;
	
	/**
	 * 用途
	 */
	private String yongtu;
	
	/**
	 * 预约日期
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
	private Date appointmentdate;
	
	/**
	 * 时间段
	 */
	private String timeperiod;
	
	/**
	 * 上报时间
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date shangbaoshijian;
	
	/**
	 * 安全隐患
	 */
	private String anquanyinhuan;
	
	/**
	 * 实拍照片
	 */
	private String shipaizhaopian;
	
	/**
	 * 处理时间
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date chulishijian;
	
	/**
	 * 隐患处理
	 */
	private String yinhuanchuli;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
