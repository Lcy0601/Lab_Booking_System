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
 * 设备分类
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@TableName("shebeifenlei")
@Data
public class ShebeifenleiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeifenleiEntity() {
		
	}
	
	public ShebeifenleiEntity(T t) {
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
	 * 设备分类
	 */
	private String shebeifenlei;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
