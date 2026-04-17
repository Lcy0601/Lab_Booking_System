package com.yb.dao;

import com.yb.entity.ShiyanshebeiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanshebeiVO;
import com.yb.entity.view.ShiyanshebeiView;


/**
 * 实验设备
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShiyanshebeiDao extends BaseMapper<ShiyanshebeiEntity> {
	
	List<ShiyanshebeiVO> selectListVO(@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);
	
	ShiyanshebeiVO selectVO(@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);
	
	List<ShiyanshebeiView> selectListView(@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);

	List<ShiyanshebeiView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);

	
	ShiyanshebeiView selectView(@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);
	

}
