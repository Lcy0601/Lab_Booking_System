package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.QuxiaoshiyanshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.QuxiaoshiyanshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.QuxiaoshiyanshiyuyueView;


/**
 * 取消实验室预约
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
public interface QuxiaoshiyanshiyuyueService extends IService<QuxiaoshiyanshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoshiyanshiyuyueVO> selectListVO(QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
   	
   	QuxiaoshiyanshiyuyueVO selectVO(@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
   	
   	List<QuxiaoshiyanshiyuyueView> selectListView(QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
   	
   	QuxiaoshiyanshiyuyueView selectView(@Param("ew") QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper);

   	

}

