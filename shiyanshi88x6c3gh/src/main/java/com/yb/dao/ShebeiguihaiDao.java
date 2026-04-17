package com.yb.dao;

import com.yb.entity.ShebeiguihaiEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShebeiguihaiVO;
import com.yb.entity.view.ShebeiguihaiView;


/**
 * 设备归还
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeiguihaiDao extends BaseMapper<ShebeiguihaiEntity> {
	
	List<ShebeiguihaiVO> selectListVO(@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);
	
	ShebeiguihaiVO selectVO(@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);
	
	List<ShebeiguihaiView> selectListView(@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);

	List<ShebeiguihaiView> selectListView(Page page,@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);

	
	ShebeiguihaiView selectView(@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);
	

}
