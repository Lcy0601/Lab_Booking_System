package com.yb.dao;

import com.yb.entity.BaofeishenqingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.BaofeishenqingVO;
import com.yb.entity.view.BaofeishenqingView;


/**
 * 报废申请
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface BaofeishenqingDao extends BaseMapper<BaofeishenqingEntity> {
	
	List<BaofeishenqingVO> selectListVO(@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);
	
	BaofeishenqingVO selectVO(@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);
	
	List<BaofeishenqingView> selectListView(@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);

	List<BaofeishenqingView> selectListView(Page page,@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);

	
	BaofeishenqingView selectView(@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);
	

}
