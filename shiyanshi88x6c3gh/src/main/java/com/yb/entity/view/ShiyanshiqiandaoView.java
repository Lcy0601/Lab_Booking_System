package com.yb.entity.view;

import com.yb.entity.ShiyanshiqiandaoEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.yb.utils.EncryptUtil;
 

/**
 * 实验室签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@TableName("shiyanshiqiandao")
public class ShiyanshiqiandaoView  extends ShiyanshiqiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanshiqiandaoView(){
	}
 
 	public ShiyanshiqiandaoView(ShiyanshiqiandaoEntity shiyanshiqiandaoEntity){
 	try {
			BeanUtils.copyProperties(shiyanshiqiandaoEntity,this);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
