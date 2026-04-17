package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShiyanshiqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShiyanshiqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShiyanshiqiandaoView;


/**
 * 实验室签到
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface ShiyanshiqiandaoService extends IService<ShiyanshiqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiqiandaoVO> selectListVO(QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
   	
   	ShiyanshiqiandaoVO selectVO(@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
   	
   	List<ShiyanshiqiandaoView> selectListView(QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
   	
   	ShiyanshiqiandaoView selectView(@Param("ew") QueryWrapper<ShiyanshiqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShiyanshiqiandaoEntity> wrapper);

   	

}

