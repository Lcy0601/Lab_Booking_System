package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.DiscussshiyanshiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.DiscussshiyanshiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.DiscussshiyanshiView;


/**
 * 实验室评论
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:09
 */
public interface DiscussshiyanshiService extends IService<DiscussshiyanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiyanshiVO> selectListVO(QueryWrapper<DiscussshiyanshiEntity> wrapper);
   	
   	DiscussshiyanshiVO selectVO(@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);
   	
   	List<DiscussshiyanshiView> selectListView(QueryWrapper<DiscussshiyanshiEntity> wrapper);
   	
   	DiscussshiyanshiView selectView(@Param("ew") QueryWrapper<DiscussshiyanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<DiscussshiyanshiEntity> wrapper);

   	

}

