package com.yb.dao;

import com.yb.entity.WeihujiluEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.WeihujiluVO;
import com.yb.entity.view.WeihujiluView;


/**
 * 维护记录
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface WeihujiluDao extends BaseMapper<WeihujiluEntity> {
	
	List<WeihujiluVO> selectListVO(@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);
	
	WeihujiluVO selectVO(@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);
	
	List<WeihujiluView> selectListView(@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);

	List<WeihujiluView> selectListView(Page page,@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);

	
	WeihujiluView selectView(@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);
	

}
