package com.yb.dao;

import com.yb.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanshiVO;
import com.yb.entity.view.ShiyanshiView;


/**
 * 实验室
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiDao extends BaseMapper<ShiyanshiEntity> {
	
	List<ShiyanshiVO> selectListVO(@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);
	
	ShiyanshiVO selectVO(@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);
	
	List<ShiyanshiView> selectListView(@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);

	List<ShiyanshiView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);

	
	ShiyanshiView selectView(@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);
	

}
