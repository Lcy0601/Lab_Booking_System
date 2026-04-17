package com.yb.dao;

import com.yb.entity.YinhuanchuliEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.YinhuanchuliVO;
import com.yb.entity.view.YinhuanchuliView;


/**
 * 隐患处理
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface YinhuanchuliDao extends BaseMapper<YinhuanchuliEntity> {
	
	List<YinhuanchuliVO> selectListVO(@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);
	
	YinhuanchuliVO selectVO(@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);
	
	List<YinhuanchuliView> selectListView(@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);

	List<YinhuanchuliView> selectListView(Page page,@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);

	
	YinhuanchuliView selectView(@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);
	

}
