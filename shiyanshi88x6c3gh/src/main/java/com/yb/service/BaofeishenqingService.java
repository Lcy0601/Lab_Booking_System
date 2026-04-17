package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.BaofeishenqingEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.BaofeishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.BaofeishenqingView;


/**
 * 报废申请
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface BaofeishenqingService extends IService<BaofeishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaofeishenqingVO> selectListVO(QueryWrapper<BaofeishenqingEntity> wrapper);
   	
   	BaofeishenqingVO selectVO(@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);
   	
   	List<BaofeishenqingView> selectListView(QueryWrapper<BaofeishenqingEntity> wrapper);
   	
   	BaofeishenqingView selectView(@Param("ew") QueryWrapper<BaofeishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<BaofeishenqingEntity> wrapper);

   	

}

