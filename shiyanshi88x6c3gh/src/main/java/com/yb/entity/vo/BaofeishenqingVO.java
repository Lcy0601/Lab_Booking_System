package com.yb.entity.vo;

import com.yb.entity.BaofeishenqingEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 报废申请
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public class BaofeishenqingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
				
	
	/**
	 * 设置：设备编号
	 */
	 
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
				
	
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
	 * 设置：报废数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：报废数量
	 */
	public Integer getShuliang() {
		return shuliang;
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
	 * 设置：报废时间
	 */
	 
	public void setBaofeishijian(Date baofeishijian) {
		this.baofeishijian = baofeishijian;
	}
	
	/**
	 * 获取：报废时间
	 */
	public Date getBaofeishijian() {
		return baofeishijian;
	}
				
	
	/**
	 * 设置：报废说明
	 */
	 
	public void setBaofeishuoming(String baofeishuoming) {
		this.baofeishuoming = baofeishuoming;
	}
	
	/**
	 * 获取：报废说明
	 */
	public String getBaofeishuoming() {
		return baofeishuoming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
