package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.BaofeishenqingDao;
import com.yb.entity.BaofeishenqingEntity;
import com.yb.service.BaofeishenqingService;
import com.yb.entity.vo.BaofeishenqingVO;
import com.yb.entity.view.BaofeishenqingView;

@Service("baofeishenqingService")
public class BaofeishenqingServiceImpl extends ServiceImpl<BaofeishenqingDao, BaofeishenqingEntity> implements BaofeishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaofeishenqingEntity> page = baseMapper.selectPage(new Query<BaofeishenqingEntity>(params).getPage(),new QueryWrapper<BaofeishenqingEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<BaofeishenqingEntity> wrapper) {
        Page<BaofeishenqingEntity> page = baseMapper.selectPage(new Query<BaofeishenqingEntity>(params).getPage(),wrapper);
        Page<BaofeishenqingView> pageVo = (Page<BaofeishenqingView>)page.convert(BaofeishenqingView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<BaofeishenqingVO> selectListVO(QueryWrapper<BaofeishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaofeishenqingVO selectVO(QueryWrapper<BaofeishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaofeishenqingView> selectListView(QueryWrapper<BaofeishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaofeishenqingView selectView(QueryWrapper<BaofeishenqingEntity> wrapper) {
        BaofeishenqingEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new BaofeishenqingView(entity);
        } else {
            return null;
        }
	}


}
