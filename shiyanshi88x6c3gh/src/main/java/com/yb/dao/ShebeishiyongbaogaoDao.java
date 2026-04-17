package com.yb.dao;

import com.yb.entity.ShebeishiyongbaogaoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.ShebeishiyongbaogaoVO;
import com.yb.entity.view.ShebeishiyongbaogaoView;


/**
 * 设备使用报告
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeishiyongbaogaoDao extends BaseMapper<ShebeishiyongbaogaoEntity> {
	
	List<ShebeishiyongbaogaoVO> selectListVO(@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
	
	ShebeishiyongbaogaoVO selectVO(@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
	
	List<ShebeishiyongbaogaoView> selectListView(@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);

	List<ShebeishiyongbaogaoView> selectListView(Page page,@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);

	
	ShebeishiyongbaogaoView selectView(@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
	

}
