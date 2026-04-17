package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.QuxiaoshiyanshiyuyueDao;
import com.yb.entity.QuxiaoshiyanshiyuyueEntity;
import com.yb.service.QuxiaoshiyanshiyuyueService;
import com.yb.entity.vo.QuxiaoshiyanshiyuyueVO;
import com.yb.entity.view.QuxiaoshiyanshiyuyueView;

@Service("quxiaoshiyanshiyuyueService")
public class QuxiaoshiyanshiyuyueServiceImpl extends ServiceImpl<QuxiaoshiyanshiyuyueDao, QuxiaoshiyanshiyuyueEntity> implements QuxiaoshiyanshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoshiyanshiyuyueEntity> page = baseMapper.selectPage(new Query<QuxiaoshiyanshiyuyueEntity>(params).getPage(),new QueryWrapper<QuxiaoshiyanshiyuyueEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper) {
        Page<QuxiaoshiyanshiyuyueEntity> page = baseMapper.selectPage(new Query<QuxiaoshiyanshiyuyueEntity>(params).getPage(),wrapper);
        Page<QuxiaoshiyanshiyuyueView> pageVo = (Page<QuxiaoshiyanshiyuyueView>)page.convert(QuxiaoshiyanshiyuyueView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<QuxiaoshiyanshiyuyueVO> selectListVO(QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoshiyanshiyuyueVO selectVO(QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoshiyanshiyuyueView> selectListView(QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoshiyanshiyuyueView selectView(QueryWrapper<QuxiaoshiyanshiyuyueEntity> wrapper) {
        QuxiaoshiyanshiyuyueEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new QuxiaoshiyanshiyuyueView(entity);
        } else {
            return null;
        }
	}


}
