package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanshiqiantuiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanshiqiantuiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanshiqiantuiView;


/**
 * 实验室签退
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiqiantuiService extends IService<ShiyanshiqiantuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiqiantuiVO> selectListVO(QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
   	
   	ShiyanshiqiantuiVO selectVO(@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
   	
   	List<ShiyanshiqiantuiView> selectListView(QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
   	
   	ShiyanshiqiantuiView selectView(@Param("ew") QueryWrapper<ShiyanshiqiantuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanshiqiantuiEntity> wrapper);

   	

}

