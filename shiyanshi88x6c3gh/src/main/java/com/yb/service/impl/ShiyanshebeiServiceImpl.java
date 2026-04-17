package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanshebeiDao;
import com.yb.entity.ShiyanshebeiEntity;
import com.yb.service.ShiyanshebeiService;
import com.yb.entity.vo.ShiyanshebeiVO;
import com.yb.entity.view.ShiyanshebeiView;

@Service("shiyanshebeiService")
public class ShiyanshebeiServiceImpl extends ServiceImpl<ShiyanshebeiDao, ShiyanshebeiEntity> implements ShiyanshebeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshebeiEntity> page = baseMapper.selectPage(new Query<ShiyanshebeiEntity>(params).getPage(),new QueryWrapper<ShiyanshebeiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanshebeiEntity> wrapper) {
        Page<ShiyanshebeiEntity> page = baseMapper.selectPage(new Query<ShiyanshebeiEntity>(params).getPage(),wrapper);
        Page<ShiyanshebeiView> pageVo = (Page<ShiyanshebeiView>)page.convert(ShiyanshebeiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanshebeiVO> selectListVO(QueryWrapper<ShiyanshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshebeiVO selectVO(QueryWrapper<ShiyanshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshebeiView> selectListView(QueryWrapper<ShiyanshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshebeiView selectView(QueryWrapper<ShiyanshebeiEntity> wrapper) {
        ShiyanshebeiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanshebeiView(entity);
        } else {
            return null;
        }
	}


}
