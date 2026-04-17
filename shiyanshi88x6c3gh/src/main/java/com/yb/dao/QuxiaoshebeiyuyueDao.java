package com.yb.dao;

import com.yb.entity.QuxiaoshebeiyuyueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.QuxiaoshebeiyuyueVO;
import com.yb.entity.view.QuxiaoshebeiyuyueView;


/**
 * 取消设备预约
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface QuxiaoshebeiyuyueDao extends BaseMapper<QuxiaoshebeiyuyueEntity> {
	
	List<QuxiaoshebeiyuyueVO> selectListVO(@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
	
	QuxiaoshebeiyuyueVO selectVO(@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
	
	List<QuxiaoshebeiyuyueView> selectListView(@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);

	List<QuxiaoshebeiyuyueView> selectListView(Page page,@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);

	
	QuxiaoshebeiyuyueView selectView(@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
	

}
