package com.yb.dao;

import com.yb.entity.ShiyanshiyuyueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanshiyuyueVO;
import com.yb.entity.view.ShiyanshiyuyueView;


/**
 * 实验室预约
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiyuyueDao extends BaseMapper<ShiyanshiyuyueEntity> {
	
	List<ShiyanshiyuyueVO> selectListVO(@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);
	
	ShiyanshiyuyueVO selectVO(@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);
	
	List<ShiyanshiyuyueView> selectListView(@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);

	List<ShiyanshiyuyueView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);

	
	ShiyanshiyuyueView selectView(@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);



}
