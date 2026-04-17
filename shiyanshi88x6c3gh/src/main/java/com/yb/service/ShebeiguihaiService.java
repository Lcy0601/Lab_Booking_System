package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShebeiguihaiEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShebeiguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShebeiguihaiView;


/**
 * 设备归还
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeiguihaiService extends IService<ShebeiguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiguihaiVO> selectListVO(QueryWrapper<ShebeiguihaiEntity> wrapper);
   	
   	ShebeiguihaiVO selectVO(@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);
   	
   	List<ShebeiguihaiView> selectListView(QueryWrapper<ShebeiguihaiEntity> wrapper);
   	
   	ShebeiguihaiView selectView(@Param("ew") QueryWrapper<ShebeiguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShebeiguihaiEntity> wrapper);

   	

}

