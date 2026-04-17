package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanshiqiandaoDao;
import com.yb.entity.ShiyanshiqiandaoEntity;
import com.yb.service.ShiyanshiqiandaoService;
import com.yb.entity.vo.ShiyanshiqiandaoVO;
import com.yb.entity.view.ShiyanshiqiandaoView;

@Service("shiyanshiqiandaoService")
public class ShiyanshiqiandaoServiceImpl extends ServiceImpl<ShiyanshiqiandaoDao, ShiyanshiqiandaoEntity> implements ShiyanshiqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshiqiandaoEntity> page = baseMapper.selectPage(new Query<ShiyanshiqiandaoEntity>(params).getPage(),new QueryWrapper<ShiyanshiqiandaoEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanshiqiandaoEntity> wrapper) {
        Page<ShiyanshiqiandaoEntity> page = baseMapper.selectPage(new Query<ShiyanshiqiandaoEntity>(params).getPage(),wrapper);
        Page<ShiyanshiqiandaoView> pageVo = (Page<ShiyanshiqiandaoView>)page.convert(ShiyanshiqiandaoView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanshiqiandaoVO> selectListVO(QueryWrapper<ShiyanshiqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshiqiandaoVO selectVO(QueryWrapper<ShiyanshiqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshiqiandaoView> selectListView(QueryWrapper<ShiyanshiqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshiqiandaoView selectView(QueryWrapper<ShiyanshiqiandaoEntity> wrapper) {
        ShiyanshiqiandaoEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanshiqiandaoView(entity);
        } else {
            return null;
        }
	}


}
