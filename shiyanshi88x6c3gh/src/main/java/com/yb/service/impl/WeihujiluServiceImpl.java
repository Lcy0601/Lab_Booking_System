package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.WeihujiluDao;
import com.yb.entity.WeihujiluEntity;
import com.yb.service.WeihujiluService;
import com.yb.entity.vo.WeihujiluVO;
import com.yb.entity.view.WeihujiluView;

@Service("weihujiluService")
public class WeihujiluServiceImpl extends ServiceImpl<WeihujiluDao, WeihujiluEntity> implements WeihujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeihujiluEntity> page = baseMapper.selectPage(new Query<WeihujiluEntity>(params).getPage(),new QueryWrapper<WeihujiluEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<WeihujiluEntity> wrapper) {
        Page<WeihujiluEntity> page = baseMapper.selectPage(new Query<WeihujiluEntity>(params).getPage(),wrapper);
        Page<WeihujiluView> pageVo = (Page<WeihujiluView>)page.convert(WeihujiluView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<WeihujiluVO> selectListVO(QueryWrapper<WeihujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeihujiluVO selectVO(QueryWrapper<WeihujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeihujiluView> selectListView(QueryWrapper<WeihujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeihujiluView selectView(QueryWrapper<WeihujiluEntity> wrapper) {
        WeihujiluEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new WeihujiluView(entity);
        } else {
            return null;
        }
	}


}
