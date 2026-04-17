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
import com.yb.entity.YuanxiEntity;
import com.yb.entity.view.YuanxiView;

import com.yb.service.YuanxiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 院系
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:05
 */
@RestController
@RequestMapping("/yuanxi")
public class YuanxiController {
    @Autowired
    private YuanxiService yuanxiService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuanxiEntity yuanxi,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<YuanxiEntity> ew = new QueryWrapper<YuanxiEntity>();


        //查询结果
		PageUtils page = yuanxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanxi), params), params));
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
    public R list(@RequestParam Map<String, Object> params,YuanxiEntity yuanxi,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<YuanxiEntity> ew = new QueryWrapper<YuanxiEntity>();

        //查询结果
		PageUtils page = yuanxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuanxiEntity yuanxi){
       	QueryWrapper<YuanxiEntity> ew = new QueryWrapper<YuanxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuanxi, "yuanxi"));
        return R.ok().put("data", yuanxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuanxiEntity yuanxi){
        QueryWrapper< YuanxiEntity> ew = new QueryWrapper< YuanxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuanxi, "yuanxi"));
		YuanxiView yuanxiView =  yuanxiService.selectView(ew);
		return R.ok("查询院系成功").put("data", yuanxiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuanxiEntity yuanxi = yuanxiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuanxi,deSens);
        return R.ok().put("data", yuanxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuanxiEntity yuanxi = yuanxiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yuanxi,deSens);
        return R.ok().put("data", yuanxi);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增院系")
    public R save(@RequestBody YuanxiEntity yuanxi, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yuanxiService.count(new QueryWrapper<YuanxiEntity>().eq("yuanxi", yuanxi.getYuanxi()))>0) {
            return R.error("院系已存在");
        }
        //ValidatorUtils.validateEntity(yuanxi);
        yuanxiService.save(yuanxi);
        return R.ok().put("data",yuanxi.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增院系")
    @RequestMapping("/add")
    public R add(@RequestBody YuanxiEntity yuanxi, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(yuanxiService.count(new QueryWrapper<YuanxiEntity>().eq("yuanxi", yuanxi.getYuanxi()))>0) {
            return R.error("院系已存在");
        }
        //ValidatorUtils.validateEntity(yuanxi);
        yuanxiService.save(yuanxi);
        return R.ok().put("data",yuanxi.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改院系")
    public R update(@RequestBody YuanxiEntity yuanxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuanxi);
        //验证字段唯一性，否则返回错误信息
        if(yuanxiService.count(new QueryWrapper<YuanxiEntity>().ne("id", yuanxi.getId()).eq("yuanxi", yuanxi.getYuanxi()))>0) {
            return R.error("院系已存在");
        }
        //全部更新
        yuanxiService.updateById(yuanxi);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除院系")
    public R delete(@RequestBody Long[] ids){
        yuanxiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
