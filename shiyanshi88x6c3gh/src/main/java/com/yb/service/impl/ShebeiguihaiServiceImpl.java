package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShebeiguihaiDao;
import com.yb.entity.ShebeiguihaiEntity;
import com.yb.service.ShebeiguihaiService;
import com.yb.entity.vo.ShebeiguihaiVO;
import com.yb.entity.view.ShebeiguihaiView;

@Service("shebeiguihaiService")
public class ShebeiguihaiServiceImpl extends ServiceImpl<ShebeiguihaiDao, ShebeiguihaiEntity> implements ShebeiguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiguihaiEntity> page = baseMapper.selectPage(new Query<ShebeiguihaiEntity>(params).getPage(),new QueryWrapper<ShebeiguihaiEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShebeiguihaiEntity> wrapper) {
        Page<ShebeiguihaiEntity> page = baseMapper.selectPage(new Query<ShebeiguihaiEntity>(params).getPage(),wrapper);
        Page<ShebeiguihaiView> pageVo = (Page<ShebeiguihaiView>)page.convert(ShebeiguihaiView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShebeiguihaiVO> selectListVO(QueryWrapper<ShebeiguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiguihaiVO selectVO(QueryWrapper<ShebeiguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiguihaiView> selectListView(QueryWrapper<ShebeiguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiguihaiView selectView(QueryWrapper<ShebeiguihaiEntity> wrapper) {
        ShebeiguihaiEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShebeiguihaiView(entity);
        } else {
            return null;
        }
	}


}
