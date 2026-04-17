package com.yb.dao;

import com.yb.entity.ZhishileixingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ZhishileixingVO;
import com.yb.entity.view.ZhishileixingView;


/**
 * 知识类型
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public interface ZhishileixingDao extends BaseMapper<ZhishileixingEntity> {
	
	List<ZhishileixingVO> selectListVO(@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);
	
	ZhishileixingVO selectVO(@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);
	
	List<ZhishileixingView> selectListView(@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);

	List<ZhishileixingView> selectListView(Page page,@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);

	
	ZhishileixingView selectView(@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);
	

}
