package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanzhidaoEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanzhidaoVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanzhidaoView;


/**
 * 实验指导
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public interface ShiyanzhidaoService extends IService<ShiyanzhidaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanzhidaoVO> selectListVO(QueryWrapper<ShiyanzhidaoEntity> wrapper);
   	
   	ShiyanzhidaoVO selectVO(@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);
   	
   	List<ShiyanzhidaoView> selectListView(QueryWrapper<ShiyanzhidaoEntity> wrapper);
   	
   	ShiyanzhidaoView selectView(@Param("ew") QueryWrapper<ShiyanzhidaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanzhidaoEntity> wrapper);

   	

}

