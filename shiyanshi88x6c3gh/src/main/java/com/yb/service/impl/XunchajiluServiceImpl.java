package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.XunchajiluDao;
import com.yb.entity.XunchajiluEntity;
import com.yb.service.XunchajiluService;
import com.yb.entity.vo.XunchajiluVO;
import com.yb.entity.view.XunchajiluView;

@Service("xunchajiluService")
public class XunchajiluServiceImpl extends ServiceImpl<XunchajiluDao, XunchajiluEntity> implements XunchajiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XunchajiluEntity> page = baseMapper.selectPage(new Query<XunchajiluEntity>(params).getPage(),new QueryWrapper<XunchajiluEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<XunchajiluEntity> wrapper) {
        Page<XunchajiluEntity> page = baseMapper.selectPage(new Query<XunchajiluEntity>(params).getPage(),wrapper);
        Page<XunchajiluView> pageVo = (Page<XunchajiluView>)page.convert(XunchajiluView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<XunchajiluVO> selectListVO(QueryWrapper<XunchajiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XunchajiluVO selectVO(QueryWrapper<XunchajiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XunchajiluView> selectListView(QueryWrapper<XunchajiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XunchajiluView selectView(QueryWrapper<XunchajiluEntity> wrapper) {
        XunchajiluEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new XunchajiluView(entity);
        } else {
            return null;
        }
	}


}
