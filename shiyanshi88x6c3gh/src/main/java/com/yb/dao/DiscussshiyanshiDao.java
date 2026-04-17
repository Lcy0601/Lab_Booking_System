package com.yb.dao;

import com.yb.entity.DiscussshiyanshiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.DiscussshiyanshiVO;
import com.yb.entity.view.DiscussshiyanshiView;


/**
 * 实验室评论
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:09
 */
public interface DiscussshiyanshiDao extends BaseMapper<DiscussshiyanshiEntity> {
	
	List<DiscussshiyanshiVO> selectListVO(@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);
	
	DiscussshiyanshiVO selectVO(@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);
	
	List<DiscussshiyanshiView> selectListView(@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);

	List<DiscussshiyanshiView> selectListView(Page page,@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);

	
	DiscussshiyanshiView selectView(@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);
	

}
