package com.yb.dao;

import com.yb.entity.ShebeifenleiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShebeifenleiVO;
import com.yb.entity.view.ShebeifenleiView;


/**
 * 设备分类
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeifenleiDao extends BaseMapper<ShebeifenleiEntity> {
	
	List<ShebeifenleiVO> selectListVO(@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);
	
	ShebeifenleiVO selectVO(@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);
	
	List<ShebeifenleiView> selectListView(@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);

	List<ShebeifenleiView> selectListView(Page page,@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);

	
	ShebeifenleiView selectView(@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);
	

}
