package com.yb.dao;

import com.yb.entity.ShiyanzhidaoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanzhidaoVO;
import com.yb.entity.view.ShiyanzhidaoView;


/**
 * 实验指导
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public interface ShiyanzhidaoDao extends BaseMapper<ShiyanzhidaoEntity> {
	
	List<ShiyanzhidaoVO> selectListVO(@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);
	
	ShiyanzhidaoVO selectVO(@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);
	
	List<ShiyanzhidaoView> selectListView(@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);

	List<ShiyanzhidaoView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);

	
	ShiyanzhidaoView selectView(@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);
	

}
