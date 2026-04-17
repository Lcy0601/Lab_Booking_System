package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.YinhuanchuliDao;
import com.yb.entity.YinhuanchuliEntity;
import com.yb.service.YinhuanchuliService;
import com.yb.entity.vo.YinhuanchuliVO;
import com.yb.entity.view.YinhuanchuliView;

@Service("yinhuanchuliService")
public class YinhuanchuliServiceImpl extends ServiceImpl<YinhuanchuliDao, YinhuanchuliEntity> implements YinhuanchuliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinhuanchuliEntity> page = baseMapper.selectPage(new Query<YinhuanchuliEntity>(params).getPage(),new QueryWrapper<YinhuanchuliEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<YinhuanchuliEntity> wrapper) {
        Page<YinhuanchuliEntity> page = baseMapper.selectPage(new Query<YinhuanchuliEntity>(params).getPage(),wrapper);
        Page<YinhuanchuliView> pageVo = (Page<YinhuanchuliView>)page.convert(YinhuanchuliView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<YinhuanchuliVO> selectListVO(QueryWrapper<YinhuanchuliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinhuanchuliVO selectVO(QueryWrapper<YinhuanchuliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinhuanchuliView> selectListView(QueryWrapper<YinhuanchuliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinhuanchuliView selectView(QueryWrapper<YinhuanchuliEntity> wrapper) {
        YinhuanchuliEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new YinhuanchuliView(entity);
        } else {
            return null;
        }
	}


}
