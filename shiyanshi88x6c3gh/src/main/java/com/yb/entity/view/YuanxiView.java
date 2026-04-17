package com.yb.entity.view;

import com.yb.entity.YuanxiEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.yb.utils.EncryptUtil;
 

/**
 * 院系
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:05
 */
@TableName("yuanxi")
public class YuanxiView  extends YuanxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiView(){
	}
 
 	public YuanxiView(YuanxiEntity yuanxiEntity){
 	try {
			BeanUtils.copyProperties(yuanxiEntity,this);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
