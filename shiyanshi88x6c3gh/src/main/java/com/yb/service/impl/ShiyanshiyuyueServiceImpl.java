package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanshiyuyueDao;
import com.yb.entity.ShiyanshiyuyueEntity;
import com.yb.service.ShiyanshiyuyueService;
import com.yb.entity.vo.ShiyanshiyuyueVO;
import com.yb.entity.view.ShiyanshiyuyueView;

@Service("shiyanshiyuyueService")
public class ShiyanshiyuyueServiceImpl extends ServiceImpl<ShiyanshiyuyueDao, ShiyanshiyuyueEntity> implements ShiyanshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshiyuyueEntity> page = baseMapper.selectPage(new Query<ShiyanshiyuyueEntity>(params).getPage(),new QueryWrapper<ShiyanshiyuyueEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
        Page<ShiyanshiyuyueEntity> page = baseMapper.selectPage(new Query<ShiyanshiyuyueEntity>(params).getPage(),wrapper);
        Page<ShiyanshiyuyueView> pageVo = (Page<ShiyanshiyuyueView>)page.convert(ShiyanshiyuyueView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanshiyuyueVO> selectListVO(QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshiyuyueVO selectVO(QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshiyuyueView> selectListView(QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshiyuyueView selectView(QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
        ShiyanshiyuyueEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanshiyuyueView(entity);
        } else {
            return null;
        }
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, QueryWrapper<ShiyanshiyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
