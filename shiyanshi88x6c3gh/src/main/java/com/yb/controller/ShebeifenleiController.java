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
import com.yb.entity.ShebeifenleiEntity;
import com.yb.entity.view.ShebeifenleiView;

import com.yb.service.ShebeifenleiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备分类
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/shebeifenlei")
public class ShebeifenleiController {
    @Autowired
    private ShebeifenleiService shebeifenleiService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeifenleiEntity shebeifenlei,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShebeifenleiEntity> ew = new QueryWrapper<ShebeifenleiEntity>();


        //查询结果
		PageUtils page = shebeifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeifenlei), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ShebeifenleiEntity shebeifenlei,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShebeifenleiEntity> ew = new QueryWrapper<ShebeifenleiEntity>();

        //查询结果
		PageUtils page = shebeifenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeifenlei), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeifenleiEntity shebeifenlei){
       	QueryWrapper<ShebeifenleiEntity> ew = new QueryWrapper<ShebeifenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeifenlei, "shebeifenlei"));
        return R.ok().put("data", shebeifenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeifenleiEntity shebeifenlei){
        QueryWrapper< ShebeifenleiEntity> ew = new QueryWrapper< ShebeifenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeifenlei, "shebeifenlei"));
		ShebeifenleiView shebeifenleiView =  shebeifenleiService.selectView(ew);
		return R.ok("查询设备分类成功").put("data", shebeifenleiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeifenleiEntity shebeifenlei = shebeifenleiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shebeifenlei,deSens);
        return R.ok().put("data", shebeifenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeifenleiEntity shebeifenlei = shebeifenleiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shebeifenlei,deSens);
        return R.ok().put("data", shebeifenlei);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增设备分类")
    public R save(@RequestBody ShebeifenleiEntity shebeifenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(shebeifenleiService.count(new QueryWrapper<ShebeifenleiEntity>().eq("shebeifenlei", shebeifenlei.getShebeifenlei()))>0) {
            return R.error("设备分类已存在");
        }
        //ValidatorUtils.validateEntity(shebeifenlei);
        shebeifenleiService.save(shebeifenlei);
        return R.ok().put("data",shebeifenlei.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增设备分类")
    @RequestMapping("/add")
    public R add(@RequestBody ShebeifenleiEntity shebeifenlei, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(shebeifenleiService.count(new QueryWrapper<ShebeifenleiEntity>().eq("shebeifenlei", shebeifenlei.getShebeifenlei()))>0) {
            return R.error("设备分类已存在");
        }
        //ValidatorUtils.validateEntity(shebeifenlei);
        shebeifenleiService.save(shebeifenlei);
        return R.ok().put("data",shebeifenlei.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改设备分类")
    public R update(@RequestBody ShebeifenleiEntity shebeifenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeifenlei);
        //验证字段唯一性，否则返回错误信息
        if(shebeifenleiService.count(new QueryWrapper<ShebeifenleiEntity>().ne("id", shebeifenlei.getId()).eq("shebeifenlei", shebeifenlei.getShebeifenlei()))>0) {
            return R.error("设备分类已存在");
        }
        //全部更新
        shebeifenleiService.updateById(shebeifenlei);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除设备分类")
    public R delete(@RequestBody Long[] ids){
        shebeifenleiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
