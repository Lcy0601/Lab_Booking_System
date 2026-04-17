package com.yb.dao;

import com.yb.entity.QuxiaoshiyanshiyuyueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Param;
import com.yb.entity.vo.QuxiaoshiyanshiyuyueVO;
import com.yb.entity.view.QuxiaoshiyanshiyuyueView;


/**
 * 取消实验室预约
 * 
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface QuxiaoshiyanshiyuyueDao extends BaseMapper<QuxiaoshiyanshiyuyueEntity> {
	
	List<QuxiaoshiyanshiyuyueVO> selectListVO(@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
	
	QuxiaoshiyanshiyuyueVO selectVO(@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
	
	List<QuxiaoshiyanshiyuyueView> selectListView(@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);

	List<QuxiaoshiyanshiyuyueView> selectListView(Page page,@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);

	
	QuxiaoshiyanshiyuyueView selectView(@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
	

}
