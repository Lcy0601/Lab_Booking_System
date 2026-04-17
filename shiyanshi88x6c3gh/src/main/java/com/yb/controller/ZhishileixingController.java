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
import com.yb.entity.ZhishileixingEntity;
import com.yb.entity.view.ZhishileixingView;

import com.yb.service.ZhishileixingService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 知识类型
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
@RestController
@RequestMapping("/zhishileixing")
public class ZhishileixingController {
    @Autowired
    private ZhishileixingService zhishileixingService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhishileixingEntity zhishileixing,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ZhishileixingEntity> ew = new QueryWrapper<ZhishileixingEntity>();


        //查询结果
		PageUtils page = zhishileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhishileixing), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ZhishileixingEntity zhishileixing,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ZhishileixingEntity> ew = new QueryWrapper<ZhishileixingEntity>();

        //查询结果
		PageUtils page = zhishileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhishileixing), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhishileixingEntity zhishileixing){
       	QueryWrapper<ZhishileixingEntity> ew = new QueryWrapper<ZhishileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhishileixing, "zhishileixing"));
        return R.ok().put("data", zhishileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhishileixingEntity zhishileixing){
        QueryWrapper< ZhishileixingEntity> ew = new QueryWrapper< ZhishileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhishileixing, "zhishileixing"));
		ZhishileixingView zhishileixingView =  zhishileixingService.selectView(ew);
		return R.ok("查询知识类型成功").put("data", zhishileixingView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhishileixingEntity zhishileixing = zhishileixingService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(zhishileixing,deSens);
        return R.ok().put("data", zhishileixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhishileixingEntity zhishileixing = zhishileixingService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(zhishileixing,deSens);
        return R.ok().put("data", zhishileixing);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增知识类型")
    public R save(@RequestBody ZhishileixingEntity zhishileixing, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(zhishileixingService.count(new QueryWrapper<ZhishileixingEntity>().eq("zhishileixing", zhishileixing.getZhishileixing()))>0) {
            return R.error("知识类型已存在");
        }
        //ValidatorUtils.validateEntity(zhishileixing);
        zhishileixingService.save(zhishileixing);
        return R.ok().put("data",zhishileixing.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增知识类型")
    @RequestMapping("/add")
    public R add(@RequestBody ZhishileixingEntity zhishileixing, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(zhishileixingService.count(new QueryWrapper<ZhishileixingEntity>().eq("zhishileixing", zhishileixing.getZhishileixing()))>0) {
            return R.error("知识类型已存在");
        }
        //ValidatorUtils.validateEntity(zhishileixing);
        zhishileixingService.save(zhishileixing);
        return R.ok().put("data",zhishileixing.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改知识类型")
    public R update(@RequestBody ZhishileixingEntity zhishileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhishileixing);
        //验证字段唯一性，否则返回错误信息
        if(zhishileixingService.count(new QueryWrapper<ZhishileixingEntity>().ne("id", zhishileixing.getId()).eq("zhishileixing", zhishileixing.getZhishileixing()))>0) {
            return R.error("知识类型已存在");
        }
        //全部更新
        zhishileixingService.updateById(zhishileixing);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除知识类型")
    public R delete(@RequestBody Long[] ids){
        zhishileixingService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
