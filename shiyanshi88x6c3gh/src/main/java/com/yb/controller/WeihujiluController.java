package com.yb.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import com.yb.utils.*;
import com.yb.service.*;
import com.yb.entity.*;
import com.yb.entity.view.*;
import java.util.stream.Collectors;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.yb.annotation.IgnoreAuth;
import com.yb.annotation.SysLog;
import com.yb.entity.WeihujiluEntity;
import com.yb.entity.view.WeihujiluView;

import com.yb.service.WeihujiluService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 维护记录
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/weihujilu")
public class WeihujiluController {
    @Autowired
    private WeihujiluService weihujiluService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeihujiluEntity weihujilu,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<WeihujiluEntity> ew = new QueryWrapper<WeihujiluEntity>();


        //查询结果
		PageUtils page = weihujiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weihujilu), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeihujiluEntity weihujilu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date weihushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date weihushijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<WeihujiluEntity> ew = new QueryWrapper<WeihujiluEntity>();
        if(weihushijianstart!=null) ew.ge("weihushijian", weihushijianstart);
        if(weihushijianend!=null) ew.le("weihushijian", weihushijianend);

        //查询结果
		PageUtils page = weihujiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weihujilu), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeihujiluEntity weihujilu){
       	QueryWrapper<WeihujiluEntity> ew = new QueryWrapper<WeihujiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weihujilu, "weihujilu"));
        return R.ok().put("data", weihujiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeihujiluEntity weihujilu){
        QueryWrapper< WeihujiluEntity> ew = new QueryWrapper< WeihujiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weihujilu, "weihujilu"));
		WeihujiluView weihujiluView =  weihujiluService.selectView(ew);
		return R.ok("查询维护记录成功").put("data", weihujiluView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeihujiluEntity weihujilu = weihujiluService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(weihujilu,deSens);
        return R.ok().put("data", weihujilu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeihujiluEntity weihujilu = weihujiluService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(weihujilu,deSens);
        return R.ok().put("data", weihujilu);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增维护记录")
    public R save(@RequestBody WeihujiluEntity weihujilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weihujilu);
        weihujiluService.save(weihujilu);
        return R.ok().put("data",weihujilu.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增维护记录")
    @RequestMapping("/add")
    public R add(@RequestBody WeihujiluEntity weihujilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weihujilu);
        weihujiluService.save(weihujilu);
        return R.ok().put("data",weihujilu.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改维护记录")
    public R update(@RequestBody WeihujiluEntity weihujilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weihujilu);
        //全部更新
        weihujiluService.updateById(weihujilu);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除维护记录")
    public R delete(@RequestBody Long[] ids){
        weihujiluService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
