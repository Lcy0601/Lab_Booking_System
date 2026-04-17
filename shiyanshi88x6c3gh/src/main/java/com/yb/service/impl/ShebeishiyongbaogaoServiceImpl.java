package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.ShebeishiyongbaogaoDao;
import com.yb.entity.ShebeishiyongbaogaoEntity;
import com.yb.service.ShebeishiyongbaogaoService;
import com.yb.entity.vo.ShebeishiyongbaogaoVO;
import com.yb.entity.view.ShebeishiyongbaogaoView;

@Service("shebeishiyongbaogaoService")
public class ShebeishiyongbaogaoServiceImpl extends ServiceImpl<ShebeishiyongbaogaoDao, ShebeishiyongbaogaoEntity> implements ShebeishiyongbaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeishiyongbaogaoEntity> page = baseMapper.selectPage(new Query<ShebeishiyongbaogaoEntity>(params).getPage(),new QueryWrapper<ShebeishiyongbaogaoEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<ShebeishiyongbaogaoEntity> wrapper) {
        Page<ShebeishiyongbaogaoEntity> page = baseMapper.selectPage(new Query<ShebeishiyongbaogaoEntity>(params).getPage(),wrapper);
        Page<ShebeishiyongbaogaoView> pageVo = (Page<ShebeishiyongbaogaoView>)page.convert(ShebeishiyongbaogaoView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<ShebeishiyongbaogaoVO> selectListVO(QueryWrapper<ShebeishiyongbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeishiyongbaogaoVO selectVO(QueryWrapper<ShebeishiyongbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeishiyongbaogaoView> selectListView(QueryWrapper<ShebeishiyongbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeishiyongbaogaoView selectView(QueryWrapper<ShebeishiyongbaogaoEntity> wrapper) {
        ShebeishiyongbaogaoEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new ShebeishiyongbaogaoView(entity);
        } else {
            return null;
        }
	}


}
