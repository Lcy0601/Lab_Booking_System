package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ZhishileixingEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ZhishileixingVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ZhishileixingView;


/**
 * 知识类型
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
public interface ZhishileixingService extends IService<ZhishileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishileixingVO> selectListVO(QueryWrapper<ZhishileixingEntity> wrapper);
   	
   	ZhishileixingVO selectVO(@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);
   	
   	List<ZhishileixingView> selectListView(QueryWrapper<ZhishileixingEntity> wrapper);
   	
   	ZhishileixingView selectView(@Param("ew") QueryWrapper<ZhishileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ZhishileixingEntity> wrapper);

   	

}

