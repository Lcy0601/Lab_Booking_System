package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.AnquanyinhuanEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.AnquanyinhuanVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.AnquanyinhuanView;


/**
 * 安全隐患
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface AnquanyinhuanService extends IService<AnquanyinhuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnquanyinhuanVO> selectListVO(QueryWrapper<AnquanyinhuanEntity> wrapper);
   	
   	AnquanyinhuanVO selectVO(@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);
   	
   	List<AnquanyinhuanView> selectListView(QueryWrapper<AnquanyinhuanEntity> wrapper);
   	
   	AnquanyinhuanView selectView(@Param("ew") QueryWrapper<AnquanyinhuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<AnquanyinhuanEntity> wrapper);

   	

}

