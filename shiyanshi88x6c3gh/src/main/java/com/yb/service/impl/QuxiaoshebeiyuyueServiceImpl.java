package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.QuxiaoshebeiyuyueDao;
import com.yb.entity.QuxiaoshebeiyuyueEntity;
import com.yb.service.QuxiaoshebeiyuyueService;
import com.yb.entity.vo.QuxiaoshebeiyuyueVO;
import com.yb.entity.view.QuxiaoshebeiyuyueView;

@Service("quxiaoshebeiyuyueService")
public class QuxiaoshebeiyuyueServiceImpl extends ServiceImpl<QuxiaoshebeiyuyueDao, QuxiaoshebeiyuyueEntity> implements QuxiaoshebeiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoshebeiyuyueEntity> page = baseMapper.selectPage(new Query<QuxiaoshebeiyuyueEntity>(params).getPage(),new QueryWrapper<QuxiaoshebeiyuyueEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper) {
        Page<QuxiaoshebeiyuyueEntity> page = baseMapper.selectPage(new Query<QuxiaoshebeiyuyueEntity>(params).getPage(),wrapper);
        Page<QuxiaoshebeiyuyueView> pageVo = (Page<QuxiaoshebeiyuyueView>)page.convert(QuxiaoshebeiyuyueView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<QuxiaoshebeiyuyueVO> selectListVO(QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoshebeiyuyueVO selectVO(QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoshebeiyuyueView> selectListView(QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoshebeiyuyueView selectView(QueryWrapper<QuxiaoshebeiyuyueEntity> wrapper) {
        QuxiaoshebeiyuyueEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new QuxiaoshebeiyuyueView(entity);
        } else {
            return null;
        }
	}


}
