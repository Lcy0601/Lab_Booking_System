package com.yb.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yb.utils.PageUtils;
import com.yb.utils.Query;


import com.yb.dao.AnquanyinhuanDao;
import com.yb.entity.AnquanyinhuanEntity;
import com.yb.service.AnquanyinhuanService;
import com.yb.entity.vo.AnquanyinhuanVO;
import com.yb.entity.view.AnquanyinhuanView;

@Service("anquanyinhuanService")
public class AnquanyinhuanServiceImpl extends ServiceImpl<AnquanyinhuanDao, AnquanyinhuanEntity> implements AnquanyinhuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnquanyinhuanEntity> page = baseMapper.selectPage(new Query<AnquanyinhuanEntity>(params).getPage(),new QueryWrapper<AnquanyinhuanEntity>());
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, QueryWrapper<AnquanyinhuanEntity> wrapper) {
        Page<AnquanyinhuanEntity> page = baseMapper.selectPage(new Query<AnquanyinhuanEntity>(params).getPage(),wrapper);
        Page<AnquanyinhuanView> pageVo = (Page<AnquanyinhuanView>)page.convert(AnquanyinhuanView::new);
        return new PageUtils(pageVo);
 	}

    
    @Override
	public List<AnquanyinhuanVO> selectListVO(QueryWrapper<AnquanyinhuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnquanyinhuanVO selectVO(QueryWrapper<AnquanyinhuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnquanyinhuanView> selectListView(QueryWrapper<AnquanyinhuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnquanyinhuanView selectView(QueryWrapper<AnquanyinhuanEntity> wrapper) {
        AnquanyinhuanEntity entity = baseMapper.selectOne(wrapper);
        if (null != entity) {
            return new AnquanyinhuanView(entity);
        } else {
            return null;
        }
	}


}
