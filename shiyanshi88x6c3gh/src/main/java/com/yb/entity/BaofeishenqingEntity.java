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
 * 报废申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@TableName("baofeishenqing")
@Data
public class BaofeishenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaofeishenqingEntity() {
		
	}
	
	public BaofeishenqingEntity(T t) {
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
	 * 报废编号
	 */
	private String baofeibianhao;
	
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
	 * 报废数量
	 */
	private Integer shuliang;
	
	/**
	 * 型号
	 */
	private String xinghao;
	
	/**
	 * 封面
	 */
	private String fengmian;
	
	/**
	 * 报废时间
	 */
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date baofeishijian;
	
	/**
	 * 报废说明
	 */
	private String baofeishuoming;
	
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
