package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanshiyuyueView;


/**
 * 实验室预约
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiyuyueService extends IService<ShiyanshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiyuyueVO> selectListVO(QueryWrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	ShiyanshiyuyueVO selectVO(@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	List<ShiyanshiyuyueView> selectListView(QueryWrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	ShiyanshiyuyueView selectView(@Param("ew") QueryWrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanshiyuyueEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,QueryWrapper<ShiyanshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,QueryWrapper<ShiyanshiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,QueryWrapper<ShiyanshiyuyueEntity> wrapper);



}

