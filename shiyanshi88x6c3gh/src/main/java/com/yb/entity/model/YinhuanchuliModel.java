package com.yb.entity.model;

import com.yb.entity.YinhuanchuliEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 隐患处理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public class YinhuanchuliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
				
	
	/**
	 * 设置：编号
	 */
	 
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
				
	
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
	 * 设置：学生学号
	 */
	 
	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}
	
	/**
	 * 获取：学生学号
	 */
	public String getXueshengxuehao() {
		return xueshengxuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：用途
	 */
	 
	public void setYongtu(String yongtu) {
		this.yongtu = yongtu;
	}
	
	/**
	 * 获取：用途
	 */
	public String getYongtu() {
		return yongtu;
	}
				
	
	/**
	 * 设置：预约日期
	 */
	 
	public void setAppointmentdate(Date appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	
	/**
	 * 获取：预约日期
	 */
	public Date getAppointmentdate() {
		return appointmentdate;
	}
				
	
	/**
	 * 设置：时间段
	 */
	 
	public void setTimeperiod(String timeperiod) {
		this.timeperiod = timeperiod;
	}
	
	/**
	 * 获取：时间段
	 */
	public String getTimeperiod() {
		return timeperiod;
	}
				
	
	/**
	 * 设置：上报时间
	 */
	 
	public void setShangbaoshijian(Date shangbaoshijian) {
		this.shangbaoshijian = shangbaoshijian;
	}
	
	/**
	 * 获取：上报时间
	 */
	public Date getShangbaoshijian() {
		return shangbaoshijian;
	}
				
	
	/**
	 * 设置：安全隐患
	 */
	 
	public void setAnquanyinhuan(String anquanyinhuan) {
		this.anquanyinhuan = anquanyinhuan;
	}
	
	/**
	 * 获取：安全隐患
	 */
	public String getAnquanyinhuan() {
		return anquanyinhuan;
	}
				
	
	/**
	 * 设置：实拍照片
	 */
	 
	public void setShipaizhaopian(String shipaizhaopian) {
		this.shipaizhaopian = shipaizhaopian;
	}
	
	/**
	 * 获取：实拍照片
	 */
	public String getShipaizhaopian() {
		return shipaizhaopian;
	}
				
	
	/**
	 * 设置：处理时间
	 */
	 
	public void setChulishijian(Date chulishijian) {
		this.chulishijian = chulishijian;
	}
	
	/**
	 * 获取：处理时间
	 */
	public Date getChulishijian() {
		return chulishijian;
	}
				
	
	/**
	 * 设置：隐患处理
	 */
	 
	public void setYinhuanchuli(String yinhuanchuli) {
		this.yinhuanchuli = yinhuanchuli;
	}
	
	/**
	 * 获取：隐患处理
	 */
	public String getYinhuanchuli() {
		return yinhuanchuli;
	}
			
}
