package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShebeiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShebeiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShebeiyuyueView;


/**
 * 设备预约
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeiyuyueService extends IService<ShebeiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiyuyueVO> selectListVO(QueryWrapper<ShebeiyuyueEntity> wrapper);
   	
   	ShebeiyuyueVO selectVO(@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);
   	
   	List<ShebeiyuyueView> selectListView(QueryWrapper<ShebeiyuyueEntity> wrapper);
   	
   	ShebeiyuyueView selectView(@Param("ew") QueryWrapper<ShebeiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShebeiyuyueEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,QueryWrapper<ShebeiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,QueryWrapper<ShebeiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,QueryWrapper<ShebeiyuyueEntity> wrapper);



}

