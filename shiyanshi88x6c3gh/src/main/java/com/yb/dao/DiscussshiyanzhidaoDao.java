package com.yb.dao;

import com.yb.entity.DiscussshiyanzhidaoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.DiscussshiyanzhidaoVO;
import com.yb.entity.view.DiscussshiyanzhidaoView;


/**
 * 实验指导评论
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:09
 */
public interface DiscussshiyanzhidaoDao extends BaseMapper<DiscussshiyanzhidaoEntity> {
	
	List<DiscussshiyanzhidaoVO> selectListVO(@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
	
	DiscussshiyanzhidaoVO selectVO(@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
	
	List<DiscussshiyanzhidaoView> selectListView(@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);

	List<DiscussshiyanzhidaoView> selectListView(Page page,@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);

	
	DiscussshiyanzhidaoView selectView(@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
	

}
