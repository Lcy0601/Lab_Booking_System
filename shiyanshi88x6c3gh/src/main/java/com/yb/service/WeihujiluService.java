package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.WeihujiluEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.WeihujiluVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.WeihujiluView;


/**
 * 维护记录
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface WeihujiluService extends IService<WeihujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeihujiluVO> selectListVO(QueryWrapper<WeihujiluEntity> wrapper);
   	
   	WeihujiluVO selectVO(@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);
   	
   	List<WeihujiluView> selectListView(QueryWrapper<WeihujiluEntity> wrapper);
   	
   	WeihujiluView selectView(@Param("ew") QueryWrapper<WeihujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<WeihujiluEntity> wrapper);

   	

}

