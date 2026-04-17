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
 * 教师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:05
 */
@TableName("jiaoshi")
@Data
public class JiaoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {
		
	}
	
	public JiaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(t,this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 主键id
	 */
    @TableId
	private Long id;
	/**
	 * 教师账号
	 */
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
	private String jiaoshixingming;
	
	/**
	 * 密码
	 */
	private String mima;
	
	/**
	 * 性别
	 */
	private String xingbie;
	
	/**
	 * 联系电话
	 */
	private String lianxidianhua;
	
	/**
	 * 头像
	 */
	private String touxiang;
	
	/**
	 * 院系
	 */
	private String yuanxi;
	
	/**
	 * 专业方向
	 */
	private String zhuanyefangxiang;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
