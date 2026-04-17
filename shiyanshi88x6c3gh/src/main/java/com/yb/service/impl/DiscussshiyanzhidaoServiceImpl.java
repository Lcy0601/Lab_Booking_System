package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.DiscussshiyanzhidaoDao;
import com.yb.entity.DiscussshiyanzhidaoEntity;
import com.yb.service.DiscussshiyanzhidaoService;
import com.yb.entity.vo.DiscussshiyanzhidaoVO;
import com.yb.entity.view.DiscussshiyanzhidaoView;

@Service("discussshiyanzhidaoService")
public class DiscussshiyanzhidaoServiceImpl extends ServiceImpl<DiscussshiyanzhidaoDao, DiscussshiyanzhidaoEntity> implements DiscussshiyanzhidaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiyanzhidaoEntity> page = baseMapper.selectPage(new Query<DiscussshiyanzhidaoEntity>(params).getPage(),new QueryWrapper<DiscussshiyanzhidaoEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<DiscussshiyanzhidaoEntity> wrapper) {
        Page<DiscussshiyanzhidaoEntity> page = baseMapper.selectPage(new Query<DiscussshiyanzhidaoEntity>(params).getPage(),wrapper);
        Page<DiscussshiyanzhidaoView> pageVo = (Page<DiscussshiyanzhidaoView>)page.convert(DiscussshiyanzhidaoView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<DiscussshiyanzhidaoVO> selectListVO(QueryWrapper<DiscussshiyanzhidaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiyanzhidaoVO selectVO(QueryWrapper<DiscussshiyanzhidaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiyanzhidaoView> selectListView(QueryWrapper<DiscussshiyanzhidaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiyanzhidaoView selectView(QueryWrapper<DiscussshiyanzhidaoEntity> wrapper) {
        DiscussshiyanzhidaoEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new DiscussshiyanzhidaoView(entity);
        } else {
            return null;
        }
	}


}
