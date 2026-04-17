package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanshipingjiaEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanshipingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanshipingjiaView;


/**
 * 实验室评价
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshipingjiaService extends IService<ShiyanshipingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshipingjiaVO> selectListVO(QueryWrapper<ShiyanshipingjiaEntity> wrapper);
   	
   	ShiyanshipingjiaVO selectVO(@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);
   	
   	List<ShiyanshipingjiaView> selectListView(QueryWrapper<ShiyanshipingjiaEntity> wrapper);
   	
   	ShiyanshipingjiaView selectView(@Param("ew") QueryWrapper<ShiyanshipingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanshipingjiaEntity> wrapper);

   	

}

