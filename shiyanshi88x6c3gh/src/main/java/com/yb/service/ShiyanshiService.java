package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanshiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanshiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanshiView;


/**
 * 实验室
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiService extends IService<ShiyanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiVO> selectListVO(QueryWrapper<ShiyanshiEntity> wrapper);
   	
   	ShiyanshiVO selectVO(@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);
   	
   	List<ShiyanshiView> selectListView(QueryWrapper<ShiyanshiEntity> wrapper);
   	
   	ShiyanshiView selectView(@Param("ew") QueryWrapper<ShiyanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanshiEntity> wrapper);

   	

}

