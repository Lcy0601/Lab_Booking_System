package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShebeiyuyueDao;
import com.yb.entity.ShebeiyuyueEntity;
import com.yb.service.ShebeiyuyueService;
import com.yb.entity.vo.ShebeiyuyueVO;
import com.yb.entity.view.ShebeiyuyueView;

@Service("shebeiyuyueService")
public class ShebeiyuyueServiceImpl extends ServiceImpl<ShebeiyuyueDao, ShebeiyuyueEntity> implements ShebeiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiyuyueEntity> page = baseMapper.selectPage(new Query<ShebeiyuyueEntity>(params).getPage(),new QueryWrapper<ShebeiyuyueEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShebeiyuyueEntity> wrapper) {
        Page<ShebeiyuyueEntity> page = baseMapper.selectPage(new Query<ShebeiyuyueEntity>(params).getPage(),wrapper);
        Page<ShebeiyuyueView> pageVo = (Page<ShebeiyuyueView>)page.convert(ShebeiyuyueView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShebeiyuyueVO> selectListVO(QueryWrapper<ShebeiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiyuyueVO selectVO(QueryWrapper<ShebeiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiyuyueView> selectListView(QueryWrapper<ShebeiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiyuyueView selectView(QueryWrapper<ShebeiyuyueEntity> wrapper) {
        ShebeiyuyueEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShebeiyuyueView(entity);
        } else {
            return null;
        }
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, QueryWrapper<ShebeiyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, QueryWrapper<ShebeiyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, QueryWrapper<ShebeiyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
