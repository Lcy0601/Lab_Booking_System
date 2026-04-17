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
 * 实验指导
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
@TableName("shiyanzhidao")
@Data
public class ShiyanzhidaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanzhidaoEntity() {
		
	}
	
	public ShiyanzhidaoEntity(T t) {
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
	 * 知识标题
	 */
	private String zhishibiaoti;
	
	/**
	 * 知识类型
	 */
	private String zhishileixing;
	
	/**
	 * 封面
	 */
	private String fengmian;
	
	/**
	 * 知识点要求
	 */
	private String zhishidianyaoqiu;
	
	/**
	 * 注意事项
	 */
	private String zhuyishixiang;
	
	/**
	 * 详情
	 */
	private String xiangqing;
	
	/**
	 * 教师账号
	 */
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
	private String jiaoshixingming;
	
	/**
	 * 操作视频
	 */
	private String caozuoshipin;
	
	/**
	 * 赞
	 */
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
	private Integer crazilynum;
	
	/**
	 * 点击次数
	 */
	private Integer clicknum;
	
	/**
	 * 评论数
	 */
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
	private Integer storeupnum;
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

}
