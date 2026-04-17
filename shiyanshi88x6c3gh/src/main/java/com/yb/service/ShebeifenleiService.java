package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShebeifenleiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShebeifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShebeifenleiView;


/**
 * 设备分类
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeifenleiService extends IService<ShebeifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeifenleiVO> selectListVO(QueryWrapper<ShebeifenleiEntity> wrapper);
   	
   	ShebeifenleiVO selectVO(@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);
   	
   	List<ShebeifenleiView> selectListView(QueryWrapper<ShebeifenleiEntity> wrapper);
   	
   	ShebeifenleiView selectView(@Param("ew") QueryWrapper<ShebeifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShebeifenleiEntity> wrapper);

   	

}

