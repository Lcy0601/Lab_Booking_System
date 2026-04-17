package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShiyanshipingjiaDao;
import com.yb.entity.ShiyanshipingjiaEntity;
import com.yb.service.ShiyanshipingjiaService;
import com.yb.entity.vo.ShiyanshipingjiaVO;
import com.yb.entity.view.ShiyanshipingjiaView;

@Service("shiyanshipingjiaService")
public class ShiyanshipingjiaServiceImpl extends ServiceImpl<ShiyanshipingjiaDao, ShiyanshipingjiaEntity> implements ShiyanshipingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshipingjiaEntity> page = baseMapper.selectPage(new Query<ShiyanshipingjiaEntity>(params).getPage(),new QueryWrapper<ShiyanshipingjiaEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShiyanshipingjiaEntity> wrapper) {
        Page<ShiyanshipingjiaEntity> page = baseMapper.selectPage(new Query<ShiyanshipingjiaEntity>(params).getPage(),wrapper);
        Page<ShiyanshipingjiaView> pageVo = (Page<ShiyanshipingjiaView>)page.convert(ShiyanshipingjiaView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShiyanshipingjiaVO> selectListVO(QueryWrapper<ShiyanshipingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshipingjiaVO selectVO(QueryWrapper<ShiyanshipingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshipingjiaView> selectListView(QueryWrapper<ShiyanshipingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshipingjiaView selectView(QueryWrapper<ShiyanshipingjiaEntity> wrapper) {
        ShiyanshipingjiaEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShiyanshipingjiaView(entity);
        } else {
            return null;
        }
	}


}
