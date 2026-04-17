package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ZhishileixingDao;
import com.yb.entity.ZhishileixingEntity;
import com.yb.service.ZhishileixingService;
import com.yb.entity.vo.ZhishileixingVO;
import com.yb.entity.view.ZhishileixingView;

@Service("zhishileixingService")
public class ZhishileixingServiceImpl extends ServiceImpl<ZhishileixingDao, ZhishileixingEntity> implements ZhishileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishileixingEntity> page = baseMapper.selectPage(new Query<ZhishileixingEntity>(params).getPage(),new QueryWrapper<ZhishileixingEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ZhishileixingEntity> wrapper) {
        Page<ZhishileixingEntity> page = baseMapper.selectPage(new Query<ZhishileixingEntity>(params).getPage(),wrapper);
        Page<ZhishileixingView> pageVo = (Page<ZhishileixingView>)page.convert(ZhishileixingView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ZhishileixingVO> selectListVO(QueryWrapper<ZhishileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishileixingVO selectVO(QueryWrapper<ZhishileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishileixingView> selectListView(QueryWrapper<ZhishileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishileixingView selectView(QueryWrapper<ZhishileixingEntity> wrapper) {
        ZhishileixingEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ZhishileixingView(entity);
        } else {
            return null;
        }
	}


}
