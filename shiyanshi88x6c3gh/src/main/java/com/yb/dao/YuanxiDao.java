package com.yb.dao;

import com.yb.entity.YuanxiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.YuanxiVO;
import com.yb.entity.view.YuanxiView;


/**
 * 院系
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:05
 */
public interface YuanxiDao extends BaseMapper<YuanxiEntity> {
	
	List<YuanxiVO> selectListVO(@Param("ew") QueryWrapper<YuanxiEntity> wrapper);
	
	YuanxiVO selectVO(@Param("ew") QueryWrapper<YuanxiEntity> wrapper);
	
	List<YuanxiView> selectListView(@Param("ew") QueryWrapper<YuanxiEntity> wrapper);

	List<YuanxiView> selectListView(Page page,@Param("ew") QueryWrapper<YuanxiEntity> wrapper);

	
	YuanxiView selectView(@Param("ew") QueryWrapper<YuanxiEntity> wrapper);
	

}
