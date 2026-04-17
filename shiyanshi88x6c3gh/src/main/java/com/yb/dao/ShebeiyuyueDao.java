package com.yb.dao;

import com.yb.entity.ShebeiyuyueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShebeiyuyueVO;
import com.yb.entity.view.ShebeiyuyueView;


/**
 * 设备预约
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeiyuyueDao extends BaseMapper<ShebeiyuyueEntity> {
	
	List<ShebeiyuyueVO> selectListVO(@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);
	
	ShebeiyuyueVO selectVO(@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);
	
	List<ShebeiyuyueView> selectListView(@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);

	List<ShebeiyuyueView> selectListView(Page page,@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);

	
	ShebeiyuyueView selectView(@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);



}
