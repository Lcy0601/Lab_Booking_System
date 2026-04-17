package com.yb.entity.vo;

import com.yb.entity.ShiyanshebeiEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验设备
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public class ShiyanshebeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 存放地点
	 */
	
	private String cunfangdidian;
		
	/**
	 * 型号
	 */
	
	private String xinghao;
		
	/**
	 * 适合实验
	 */
	
	private String shiheshiyan;
		
	/**
	 * 使用说明
	 */
	
	private String shiyongshuoming;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 上下架
	 */
	
	private Integer onshelves;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：设备分类
	 */
	 
	public void setShebeifenlei(String shebeifenlei) {
		this.shebeifenlei = shebeifenlei;
	}
	
	/**
	 * 获取：设备分类
	 */
	public String getShebeifenlei() {
		return shebeifenlei;
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
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：存放地点
	 */
	 
	public void setCunfangdidian(String cunfangdidian) {
		this.cunfangdidian = cunfangdidian;
	}
	
	/**
	 * 获取：存放地点
	 */
	public String getCunfangdidian() {
		return cunfangdidian;
	}
				
	
	/**
	 * 设置：型号
	 */
	 
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
				
	
	/**
	 * 设置：适合实验
	 */
	 
	public void setShiheshiyan(String shiheshiyan) {
		this.shiheshiyan = shiheshiyan;
	}
	
	/**
	 * 获取：适合实验
	 */
	public String getShiheshiyan() {
		return shiheshiyan;
	}
				
	
	/**
	 * 设置：使用说明
	 */
	 
	public void setShiyongshuoming(String shiyongshuoming) {
		this.shiyongshuoming = shiyongshuoming;
	}
	
	/**
	 * 获取：使用说明
	 */
	public String getShiyongshuoming() {
		return shiyongshuoming;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：上下架
	 */
	 
	public void setOnshelves(Integer onshelves) {
		this.onshelves = onshelves;
	}
	
	/**
	 * 获取：上下架
	 */
	public Integer getOnshelves() {
		return onshelves;
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
