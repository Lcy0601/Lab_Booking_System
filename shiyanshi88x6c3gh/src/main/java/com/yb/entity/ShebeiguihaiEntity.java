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
 * 设备归还
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@TableName("shebeiguihai")
@Data
public class ShebeiguihaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeiguihaiEntity() {
		
	}
	
	public ShebeiguihaiEntity(T t) {
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
	 * 归还数量
	 */
	private Integer shuliang;
	
	/**
	 * 封面
	 */
	private String fengmian;
	
	/**
	 * 型号
	 */
	private String xinghao;
	
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
	 * 归还时间
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date guihaishijian;
	
	/**
	 * 是否审核
	 */
	private String sfsh;
	
	/**
	 * 审核回复
	 */
	private String shhf;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
