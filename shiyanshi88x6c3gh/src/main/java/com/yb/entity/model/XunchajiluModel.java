package com.yb.entity.model;

import com.yb.entity.XunchajiluEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 巡查记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public class XunchajiluModel  implements Serializable {
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
	 * 实验室位置
	 */
	
	private String shiyanshiweizhi;
		
	/**
	 * 仪器配置
	 */
	
	private String yiqipeizhi;
		
	/**
	 * 现场照片
	 */
	
	private String xianchangzhaopian;
		
	/**
	 * 巡查项目
	 */
	
	private String xunchaxiangmu;
		
	/**
	 * 巡查时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xunchashijian;
		
	/**
	 * 巡查记录
	 */
	
	private String xunchajilu;
				
	
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
	 * 设置：现场照片
	 */
	 
	public void setXianchangzhaopian(String xianchangzhaopian) {
		this.xianchangzhaopian = xianchangzhaopian;
	}
	
	/**
	 * 获取：现场照片
	 */
	public String getXianchangzhaopian() {
		return xianchangzhaopian;
	}
				
	
	/**
	 * 设置：巡查项目
	 */
	 
	public void setXunchaxiangmu(String xunchaxiangmu) {
		this.xunchaxiangmu = xunchaxiangmu;
	}
	
	/**
	 * 获取：巡查项目
	 */
	public String getXunchaxiangmu() {
		return xunchaxiangmu;
	}
				
	
	/**
	 * 设置：巡查时间
	 */
	 
	public void setXunchashijian(Date xunchashijian) {
		this.xunchashijian = xunchashijian;
	}
	
	/**
	 * 获取：巡查时间
	 */
	public Date getXunchashijian() {
		return xunchashijian;
	}
				
	
	/**
	 * 设置：巡查记录
	 */
	 
	public void setXunchajilu(String xunchajilu) {
		this.xunchajilu = xunchajilu;
	}
	
	/**
	 * 获取：巡查记录
	 */
	public String getXunchajilu() {
		return xunchajilu;
	}
			
}
