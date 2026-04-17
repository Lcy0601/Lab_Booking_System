package com.yb.dao;

import com.yb.entity.ShiyanshiqiantuiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanshiqiantuiVO;
import com.yb.entity.view.ShiyanshiqiantuiView;


/**
 * 实验室签退
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiqiantuiDao extends BaseMapper<ShiyanshiqiantuiEntity> {
	
	List<ShiyanshiqiantuiVO> selectListVO(@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
	
	ShiyanshiqiantuiVO selectVO(@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
	
	List<ShiyanshiqiantuiView> selectListView(@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);

	List<ShiyanshiqiantuiView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);

	
	ShiyanshiqiantuiView selectView(@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
	

}
