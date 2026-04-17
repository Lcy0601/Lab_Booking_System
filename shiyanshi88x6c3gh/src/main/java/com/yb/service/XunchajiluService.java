package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.XunchajiluEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.XunchajiluVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.XunchajiluView;


/**
 * 巡查记录
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public interface XunchajiluService extends IService<XunchajiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XunchajiluVO> selectListVO(QueryWrapper<XunchajiluEntity> wrapper);
   	
   	XunchajiluVO selectVO(@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);
   	
   	List<XunchajiluView> selectListView(QueryWrapper<XunchajiluEntity> wrapper);
   	
   	XunchajiluView selectView(@Param("ew") QueryWrapper<XunchajiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<XunchajiluEntity> wrapper);

   	

}

