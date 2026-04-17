package com.yb.dao;

import com.yb.entity.ShiyanshiqiandaoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShiyanshiqiandaoVO;
import com.yb.entity.view.ShiyanshiqiandaoView;


/**
 * 实验室签到
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiqiandaoDao extends BaseMapper<ShiyanshiqiandaoEntity> {
	
	List<ShiyanshiqiandaoVO> selectListVO(@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
	
	ShiyanshiqiandaoVO selectVO(@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
	
	List<ShiyanshiqiandaoView> selectListView(@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);

	List<ShiyanshiqiandaoView> selectListView(Page page,@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);

	
	ShiyanshiqiandaoView selectView(@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
	

}
