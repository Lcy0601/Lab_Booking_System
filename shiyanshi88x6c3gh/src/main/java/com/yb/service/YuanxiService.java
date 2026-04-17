package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.YuanxiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.YuanxiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.YuanxiView;


/**
 * 院系
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:05
 */
public interface YuanxiService extends IService<YuanxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiVO> selectListVO(QueryWrapper<YuanxiEntity> wrapper);
   	
   	YuanxiVO selectVO(@Param("ew") QueryWrapper<YuanxiEntity> wrapper);
   	
   	List<YuanxiView> selectListView(QueryWrapper<YuanxiEntity> wrapper);
   	
   	YuanxiView selectView(@Param("ew") QueryWrapper<YuanxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<YuanxiEntity> wrapper);

   	

}

