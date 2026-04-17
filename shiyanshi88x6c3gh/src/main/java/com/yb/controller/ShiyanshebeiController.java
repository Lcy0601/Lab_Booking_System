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
import com.yb.entity.ShiyanshebeiEntity;
import com.yb.entity.view.ShiyanshebeiView;

import com.yb.service.ShiyanshebeiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;
import com.yb.service.StoreupService;
import com.yb.entity.StoreupEntity;

/**
 * 实验设备
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/shiyanshebei")
public class ShiyanshebeiController {
    @Autowired
    private ShiyanshebeiService shiyanshebeiService;

    @Autowired
    private StoreupService storeupService;









    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshebeiEntity shiyanshebei,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshebeiEntity> ew = new QueryWrapper<ShiyanshebeiEntity>();


        //查询结果
		PageUtils page = shiyanshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshebei), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ShiyanshebeiEntity shiyanshebei,
                @RequestParam(required = false) Double shuliangstart,
                @RequestParam(required = false) Double shuliangend,
                @RequestParam(required = false) Double onshelvesstart,
                @RequestParam(required = false) Double onshelvesend,
                @RequestParam(required = false) Double storeupnumstart,
                @RequestParam(required = false) Double storeupnumend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshebeiEntity> ew = new QueryWrapper<ShiyanshebeiEntity>();
        if(shuliangstart!=null) ew.ge("shuliang", shuliangstart);
        if(shuliangend!=null) ew.le("shuliang", shuliangend);
        if(onshelvesstart!=null) ew.ge("onshelves", onshelvesstart);
        if(onshelvesend!=null) ew.le("onshelves", onshelvesend);
        if(storeupnumstart!=null) ew.ge("storeupnum", storeupnumstart);
        if(storeupnumend!=null) ew.le("storeupnum", storeupnumend);

        //查询结果
		PageUtils page = shiyanshebeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshebei), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshebeiEntity shiyanshebei){
       	QueryWrapper<ShiyanshebeiEntity> ew = new QueryWrapper<ShiyanshebeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshebei, "shiyanshebei"));
        return R.ok().put("data", shiyanshebeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshebeiEntity shiyanshebei){
        QueryWrapper< ShiyanshebeiEntity> ew = new QueryWrapper< ShiyanshebeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshebei, "shiyanshebei"));
		ShiyanshebeiView shiyanshebeiView =  shiyanshebeiService.selectView(ew);
		return R.ok("查询实验设备成功").put("data", shiyanshebeiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshebeiEntity shiyanshebei = shiyanshebeiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshebei,deSens);
        return R.ok().put("data", shiyanshebei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshebeiEntity shiyanshebei = shiyanshebeiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshebei,deSens);
        return R.ok().put("data", shiyanshebei);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验设备")
    public R save(@RequestBody ShiyanshebeiEntity shiyanshebei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshebei);
        shiyanshebeiService.save(shiyanshebei);
        return R.ok().put("data",shiyanshebei.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验设备")
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshebeiEntity shiyanshebei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshebei);
        shiyanshebeiService.save(shiyanshebei);
        return R.ok().put("data",shiyanshebei.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改实验设备")
    public R update(@RequestBody ShiyanshebeiEntity shiyanshebei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshebei);
        //全部更新
        shiyanshebeiService.updateById(shiyanshebei);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验设备")
    public R delete(@RequestBody Long[] ids){
        shiyanshebeiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
