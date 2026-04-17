package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.YuanxiDao;
import com.yb.entity.YuanxiEntity;
import com.yb.service.YuanxiService;
import com.yb.entity.vo.YuanxiVO;
import com.yb.entity.view.YuanxiView;

@Service("yuanxiService")
public class YuanxiServiceImpl extends ServiceImpl<YuanxiDao, YuanxiEntity> implements YuanxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiEntity> page = baseMapper.selectPage(new Query<YuanxiEntity>(params).getPage(),new QueryWrapper<YuanxiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<YuanxiEntity> wrapper) {
        Page<YuanxiEntity> page = baseMapper.selectPage(new Query<YuanxiEntity>(params).getPage(),wrapper);
        Page<YuanxiView> pageVo = (Page<YuanxiView>)page.convert(YuanxiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<YuanxiVO> selectListVO(QueryWrapper<YuanxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiVO selectVO(QueryWrapper<YuanxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiView> selectListView(QueryWrapper<YuanxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiView selectView(QueryWrapper<YuanxiEntity> wrapper) {
        YuanxiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new YuanxiView(entity);
        } else {
            return null;
        }
	}


}
