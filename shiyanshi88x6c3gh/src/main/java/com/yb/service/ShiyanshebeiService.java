package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanshebeiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanshebeiView;


/**
 * 实验设备
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShiyanshebeiService extends IService<ShiyanshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshebeiVO> selectListVO(QueryWrapper<ShiyanshebeiEntity> wrapper);
   	
   	ShiyanshebeiVO selectVO(@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);
   	
   	List<ShiyanshebeiView> selectListView(QueryWrapper<ShiyanshebeiEntity> wrapper);
   	
   	ShiyanshebeiView selectView(@Param("ew") QueryWrapper<ShiyanshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanshebeiEntity> wrapper);

   	

}

