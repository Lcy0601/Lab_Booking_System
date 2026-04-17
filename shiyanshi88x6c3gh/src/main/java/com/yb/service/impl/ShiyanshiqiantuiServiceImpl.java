package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanshiqiantuiDao;
import com.yb.entity.ShiyanshiqiantuiEntity;
import com.yb.service.ShiyanshiqiantuiService;
import com.yb.entity.vo.ShiyanshiqiantuiVO;
import com.yb.entity.view.ShiyanshiqiantuiView;

@Service("shiyanshiqiantuiService")
public class ShiyanshiqiantuiServiceImpl extends ServiceImpl<ShiyanshiqiantuiDao, ShiyanshiqiantuiEntity> implements ShiyanshiqiantuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshiqiantuiEntity> page = baseMapper.selectPage(new Query<ShiyanshiqiantuiEntity>(params).getPage(),new QueryWrapper<ShiyanshiqiantuiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanshiqiantuiEntity> wrapper) {
        Page<ShiyanshiqiantuiEntity> page = baseMapper.selectPage(new Query<ShiyanshiqiantuiEntity>(params).getPage(),wrapper);
        Page<ShiyanshiqiantuiView> pageVo = (Page<ShiyanshiqiantuiView>)page.convert(ShiyanshiqiantuiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanshiqiantuiVO> selectListVO(QueryWrapper<ShiyanshiqiantuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshiqiantuiVO selectVO(QueryWrapper<ShiyanshiqiantuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshiqiantuiView> selectListView(QueryWrapper<ShiyanshiqiantuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshiqiantuiView selectView(QueryWrapper<ShiyanshiqiantuiEntity> wrapper) {
        ShiyanshiqiantuiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanshiqiantuiView(entity);
        } else {
            return null;
        }
	}


}
