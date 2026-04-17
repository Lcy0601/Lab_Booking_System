package com.yb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yb.utils.PageUtils;
import com.yb.entity.ShebeishiyongbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.yb.entity.vo.ShebeishiyongbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.yb.entity.view.ShebeishiyongbaogaoView;


/**
 * 设备使用报告
 *
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
public interface ShebeishiyongbaogaoService extends IService<ShebeishiyongbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeishiyongbaogaoVO> selectListVO(QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
   	
   	ShebeishiyongbaogaoVO selectVO(@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
   	
   	List<ShebeishiyongbaogaoView> selectListView(QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
   	
   	ShebeishiyongbaogaoView selectView(@Param("ew") QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,QueryWrapper<ShebeishiyongbaogaoEntity> wrapper);

   	

}

