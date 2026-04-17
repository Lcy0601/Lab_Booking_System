package com.yb.dao;

import com.yb.entity.ShiyanshipingjiaEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanshipingjiaVO;
import com.yb.entity.view.ShiyanshipingjiaView;


/**
 * 实验室评价
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshipingjiaDao extends BaseMapper<ShiyanshipingjiaEntity> {
	
	List<ShiyanshipingjiaVO> selectListVO(@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);
	
	ShiyanshipingjiaVO selectVO(@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);
	
	List<ShiyanshipingjiaView> selectListView(@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);

	List<ShiyanshipingjiaView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);

	
	ShiyanshipingjiaView selectView(@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);
	

}
