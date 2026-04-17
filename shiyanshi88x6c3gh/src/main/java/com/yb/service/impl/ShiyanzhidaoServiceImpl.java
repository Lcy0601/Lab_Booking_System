package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanzhidaoDao;
import com.yb.entity.ShiyanzhidaoEntity;
import com.yb.service.ShiyanzhidaoService;
import com.yb.entity.vo.ShiyanzhidaoVO;
import com.yb.entity.view.ShiyanzhidaoView;

@Service("shiyanzhidaoService")
public class ShiyanzhidaoServiceImpl extends ServiceImpl<ShiyanzhidaoDao, ShiyanzhidaoEntity> implements ShiyanzhidaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanzhidaoEntity> page = baseMapper.selectPage(new Query<ShiyanzhidaoEntity>(params).getPage(),new QueryWrapper<ShiyanzhidaoEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanzhidaoEntity> wrapper) {
        Page<ShiyanzhidaoEntity> page = baseMapper.selectPage(new Query<ShiyanzhidaoEntity>(params).getPage(),wrapper);
        Page<ShiyanzhidaoView> pageVo = (Page<ShiyanzhidaoView>)page.convert(ShiyanzhidaoView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanzhidaoVO> selectListVO(QueryWrapper<ShiyanzhidaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanzhidaoVO selectVO(QueryWrapper<ShiyanzhidaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanzhidaoView> selectListView(QueryWrapper<ShiyanzhidaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanzhidaoView selectView(QueryWrapper<ShiyanzhidaoEntity> wrapper) {
        ShiyanzhidaoEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanzhidaoView(entity);
        } else {
            return null;
        }
	}


}
