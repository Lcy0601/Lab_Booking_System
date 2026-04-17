package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.DiscussshiyanshiDao;
import com.yb.entity.DiscussshiyanshiEntity;
import com.yb.service.DiscussshiyanshiService;
import com.yb.entity.vo.DiscussshiyanshiVO;
import com.yb.entity.view.DiscussshiyanshiView;

@Service("discussshiyanshiService")
public class DiscussshiyanshiServiceImpl extends ServiceImpl<DiscussshiyanshiDao, DiscussshiyanshiEntity> implements DiscussshiyanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiyanshiEntity> page = baseMapper.selectPage(new Query<DiscussshiyanshiEntity>(params).getPage(),new QueryWrapper<DiscussshiyanshiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<DiscussshiyanshiEntity> wrapper) {
        Page<DiscussshiyanshiEntity> page = baseMapper.selectPage(new Query<DiscussshiyanshiEntity>(params).getPage(),wrapper);
        Page<DiscussshiyanshiView> pageVo = (Page<DiscussshiyanshiView>)page.convert(DiscussshiyanshiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<DiscussshiyanshiVO> selectListVO(QueryWrapper<DiscussshiyanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiyanshiVO selectVO(QueryWrapper<DiscussshiyanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiyanshiView> selectListView(QueryWrapper<DiscussshiyanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiyanshiView selectView(QueryWrapper<DiscussshiyanshiEntity> wrapper) {
        DiscussshiyanshiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new DiscussshiyanshiView(entity);
        } else {
            return null;
        }
	}


}
