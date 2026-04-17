package com.yb.entity.vo;

import com.yb.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验室
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public class ShiyanshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
				
	
	/**
	 * 设置：实验室名称
	 */
	 
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
				
	
	/**
	 * 设置：实验室类型
	 */
	 
	public void setShiyanshileixing(String shiyanshileixing) {
		this.shiyanshileixing = shiyanshileixing;
	}
	
	/**
	 * 获取：实验室类型
	 */
	public String getShiyanshileixing() {
		return shiyanshileixing;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：实验室位置
	 */
	 
	public void setShiyanshiweizhi(String shiyanshiweizhi) {
		this.shiyanshiweizhi = shiyanshiweizhi;
	}
	
	/**
	 * 获取：实验室位置
	 */
	public String getShiyanshiweizhi() {
		return shiyanshiweizhi;
	}
				
	
	/**
	 * 设置：仪器配置
	 */
	 
	public void setYiqipeizhi(String yiqipeizhi) {
		this.yiqipeizhi = yiqipeizhi;
	}
	
	/**
	 * 获取：仪器配置
	 */
	public String getYiqipeizhi() {
		return yiqipeizhi;
	}
				
	
	/**
	 * 设置：容量
	 */
	 
	public void setRongliang(String rongliang) {
		this.rongliang = rongliang;
	}
	
	/**
	 * 获取：容量
	 */
	public String getRongliang() {
		return rongliang;
	}
				
	
	/**
	 * 设置：可预约次数
	 */
	 
	public void setReduciblenum(Integer reduciblenum) {
		this.reduciblenum = reduciblenum;
	}
	
	/**
	 * 获取：可预约次数
	 */
	public Integer getReduciblenum() {
		return reduciblenum;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：预约规则
	 */
	 
	public void setYuyueguize(String yuyueguize) {
		this.yuyueguize = yuyueguize;
	}
	
	/**
	 * 获取：预约规则
	 */
	public String getYuyueguize() {
		return yuyueguize;
	}
				
	
	/**
	 * 设置：环境介绍
	 */
	 
	public void setHuanjingjieshao(String huanjingjieshao) {
		this.huanjingjieshao = huanjingjieshao;
	}
	
	/**
	 * 获取：环境介绍
	 */
	public String getHuanjingjieshao() {
		return huanjingjieshao;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setTotalscore(Double totalscore) {
		this.totalscore = totalscore;
	}
	
	/**
	 * 获取：评分
	 */
	public Double getTotalscore() {
		return totalscore;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
