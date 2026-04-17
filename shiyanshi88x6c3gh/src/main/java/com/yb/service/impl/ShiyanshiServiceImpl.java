package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanshiDao;
import com.yb.entity.ShiyanshiEntity;
import com.yb.service.ShiyanshiService;
import com.yb.entity.vo.ShiyanshiVO;
import com.yb.entity.view.ShiyanshiView;

@Service("shiyanshiService")
public class ShiyanshiServiceImpl extends ServiceImpl<ShiyanshiDao, ShiyanshiEntity> implements ShiyanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshiEntity> page = baseMapper.selectPage(new Query<ShiyanshiEntity>(params).getPage(),new QueryWrapper<ShiyanshiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanshiEntity> wrapper) {
        Page<ShiyanshiEntity> page = baseMapper.selectPage(new Query<ShiyanshiEntity>(params).getPage(),wrapper);
        Page<ShiyanshiView> pageVo = (Page<ShiyanshiView>)page.convert(ShiyanshiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanshiVO> selectListVO(QueryWrapper<ShiyanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshiVO selectVO(QueryWrapper<ShiyanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshiView> selectListView(QueryWrapper<ShiyanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshiView selectView(QueryWrapper<ShiyanshiEntity> wrapper) {
        ShiyanshiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanshiView(entity);
        } else {
            return null;
        }
	}


}
