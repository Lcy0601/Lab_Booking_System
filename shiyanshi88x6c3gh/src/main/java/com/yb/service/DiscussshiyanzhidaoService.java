package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.DiscussshiyanzhidaoEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.DiscussshiyanzhidaoVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.DiscussshiyanzhidaoView;


/**
 * 实验指导评论
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:09
 */
public interface DiscussshiyanzhidaoService extends IService<DiscussshiyanzhidaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiyanzhidaoVO> selectListVO(QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
   	
   	DiscussshiyanzhidaoVO selectVO(@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
   	
   	List<DiscussshiyanzhidaoView> selectListView(QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
   	
   	DiscussshiyanzhidaoView selectView(@Param("ew") QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<DiscussshiyanzhidaoEntity> wrapper);

   	

}

