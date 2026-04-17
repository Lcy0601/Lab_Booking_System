package com.yb.entity.view;

import com.yb.entity.AnquanyinhuanEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.yb.utils.EncryptUtil;
 

/**
 * 安全隐患
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@TableName("anquanyinhuan")
public class AnquanyinhuanView  extends AnquanyinhuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AnquanyinhuanView(){
	}
 
 	public AnquanyinhuanView(AnquanyinhuanEntity anquanyinhuanEntity){
 	try {
			BeanUtils.copyProperties(anquanyinhuanEntity,this);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
