package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShebeifenleiDao;
import com.yb.entity.ShebeifenleiEntity;
import com.yb.service.ShebeifenleiService;
import com.yb.entity.vo.ShebeifenleiVO;
import com.yb.entity.view.ShebeifenleiView;

@Service("shebeifenleiService")
public class ShebeifenleiServiceImpl extends ServiceImpl<ShebeifenleiDao, ShebeifenleiEntity> implements ShebeifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeifenleiEntity> page = baseMapper.selectPage(new Query<ShebeifenleiEntity>(params).getPage(),new QueryWrapper<ShebeifenleiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShebeifenleiEntity> wrapper) {
        Page<ShebeifenleiEntity> page = baseMapper.selectPage(new Query<ShebeifenleiEntity>(params).getPage(),wrapper);
        Page<ShebeifenleiView> pageVo = (Page<ShebeifenleiView>)page.convert(ShebeifenleiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShebeifenleiVO> selectListVO(QueryWrapper<ShebeifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeifenleiVO selectVO(QueryWrapper<ShebeifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeifenleiView> selectListView(QueryWrapper<ShebeifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeifenleiView selectView(QueryWrapper<ShebeifenleiEntity> wrapper) {
        ShebeifenleiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShebeifenleiView(entity);
        } else {
            return null;
        }
	}


}
