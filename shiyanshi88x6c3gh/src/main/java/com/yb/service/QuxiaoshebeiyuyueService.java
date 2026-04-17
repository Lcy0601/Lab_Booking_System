package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.QuxiaoshebeiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.QuxiaoshebeiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.QuxiaoshebeiyuyueView;


/**
 * 取消设备预约
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface QuxiaoshebeiyuyueService extends IService<QuxiaoshebeiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoshebeiyuyueVO> selectListVO(QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
   	
   	QuxiaoshebeiyuyueVO selectVO(@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
   	
   	List<QuxiaoshebeiyuyueView> selectListView(QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
   	
   	QuxiaoshebeiyuyueView selectView(@Param("ew") QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper);

   	

}

