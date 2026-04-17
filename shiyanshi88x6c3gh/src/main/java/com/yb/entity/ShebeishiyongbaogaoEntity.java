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
 * 设备使用报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@TableName("shebeishiyongbaogao")
@Data
public class ShebeishiyongbaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeishiyongbaogaoEntity() {
		
	}
	
	public ShebeishiyongbaogaoEntity(T t) {
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
	 * 封面
	 */
	private String fengmian;
	
	/**
	 * 型号
	 */
	private String xinghao;
	
	/**
	 * 上报时间
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date shangbaoshijian;
	
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
	 * 使用情况
	 */
	private String shiyongqingkuang;
	
	/**
	 * 耗损反馈
	 */
	private String haosunfankui;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
