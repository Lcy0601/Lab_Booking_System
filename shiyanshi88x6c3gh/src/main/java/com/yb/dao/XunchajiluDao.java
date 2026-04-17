package com.yb.dao;

import com.yb.entity.XunchajiluEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.XunchajiluVO;
import com.yb.entity.view.XunchajiluView;


/**
 * 巡查记录
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public interface XunchajiluDao extends BaseMapper<XunchajiluEntity> {
	
	List<XunchajiluVO> selectListVO(@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);
	
	XunchajiluVO selectVO(@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);
	
	List<XunchajiluView> selectListView(@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);

	List<XunchajiluView> selectListView(Page page,@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);

	
	XunchajiluView selectView(@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);
	

}
