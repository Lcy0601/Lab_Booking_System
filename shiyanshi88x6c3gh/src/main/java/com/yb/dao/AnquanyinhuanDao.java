package com.yb.dao;

import com.yb.entity.AnquanyinhuanEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.AnquanyinhuanVO;
import com.yb.entity.view.AnquanyinhuanView;


/**
 * 安全隐患
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface AnquanyinhuanDao extends BaseMapper<AnquanyinhuanEntity> {
	
	List<AnquanyinhuanVO> selectListVO(@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);
	
	AnquanyinhuanVO selectVO(@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);
	
	List<AnquanyinhuanView> selectListView(@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);

	List<AnquanyinhuanView> selectListView(Page page,@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);

	
	AnquanyinhuanView selectView(@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);
	

}
