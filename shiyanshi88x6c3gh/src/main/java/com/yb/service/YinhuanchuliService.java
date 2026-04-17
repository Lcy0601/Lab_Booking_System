package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.YinhuanchuliEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.YinhuanchuliVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.YinhuanchuliView;


/**
 * 隐患处理
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface YinhuanchuliService extends IService<YinhuanchuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinhuanchuliVO> selectListVO(QueryWrapper<YinhuanchuliEntity> wrapper);
   	
   	YinhuanchuliVO selectVO(@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);
   	
   	List<YinhuanchuliView> selectListView(QueryWrapper<YinhuanchuliEntity> wrapper);
   	
   	YinhuanchuliView selectView(@Param("ew") QueryWrapper<YinhuanchuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<YinhuanchuliEntity> wrapper);

   	

}

