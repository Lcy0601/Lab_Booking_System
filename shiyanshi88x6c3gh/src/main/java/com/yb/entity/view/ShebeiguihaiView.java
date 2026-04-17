package com.yb.entity.view;

import com.yb.entity.ShebeiguihaiEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.yb.utils.EncryptUtil;
 

/**
 * 设备归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@TableName("shebeiguihai")
public class ShebeiguihaiView  extends ShebeiguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeiguihaiView(){
	}
 
 	public ShebeiguihaiView(ShebeiguihaiEntity shebeiguihaiEntity){
 	try {
			BeanUtils.copyProperties(shebeiguihaiEntity,this);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
