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
import com.yb.entity.ShiyanshiqiantuiEntity;
import com.yb.entity.view.ShiyanshiqiantuiView;

import com.yb.service.ShiyanshiqiantuiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室签退
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/shiyanshiqiantui")
public class ShiyanshiqiantuiController {
    @Autowired
    private ShiyanshiqiantuiService shiyanshiqiantuiService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshiqiantuiEntity shiyanshiqiantui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shiyanshiqiantui.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<ShiyanshiqiantuiEntity> ew = new QueryWrapper<ShiyanshiqiantuiEntity>();


        //查询结果
		PageUtils page = shiyanshiqiantuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiqiantui), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshiqiantuiEntity shiyanshiqiantui,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdatestart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdateend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date qiantuishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date qiantuishijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshiqiantuiEntity> ew = new QueryWrapper<ShiyanshiqiantuiEntity>();
        if(appointmentdatestart!=null) ew.ge("appointmentdate", appointmentdatestart);
        if(appointmentdateend!=null) ew.le("appointmentdate", appointmentdateend);
        if(qiantuishijianstart!=null) ew.ge("qiantuishijian", qiantuishijianstart);
        if(qiantuishijianend!=null) ew.le("qiantuishijian", qiantuishijianend);

        //查询结果
		PageUtils page = shiyanshiqiantuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiqiantui), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshiqiantuiEntity shiyanshiqiantui){
       	QueryWrapper<ShiyanshiqiantuiEntity> ew = new QueryWrapper<ShiyanshiqiantuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshiqiantui, "shiyanshiqiantui"));
        return R.ok().put("data", shiyanshiqiantuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshiqiantuiEntity shiyanshiqiantui){
        QueryWrapper< ShiyanshiqiantuiEntity> ew = new QueryWrapper< ShiyanshiqiantuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshiqiantui, "shiyanshiqiantui"));
		ShiyanshiqiantuiView shiyanshiqiantuiView =  shiyanshiqiantuiService.selectView(ew);
		return R.ok("查询实验室签退成功").put("data", shiyanshiqiantuiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshiqiantuiEntity shiyanshiqiantui = shiyanshiqiantuiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshiqiantui,deSens);
        return R.ok().put("data", shiyanshiqiantui);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshiqiantuiEntity shiyanshiqiantui = shiyanshiqiantuiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshiqiantui,deSens);
        return R.ok().put("data", shiyanshiqiantui);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验室签退")
    public R save(@RequestBody ShiyanshiqiantuiEntity shiyanshiqiantui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiqiantui);
        shiyanshiqiantuiService.save(shiyanshiqiantui);
        return R.ok().put("data",shiyanshiqiantui.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验室签退")
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiqiantuiEntity shiyanshiqiantui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiqiantui);
        shiyanshiqiantuiService.save(shiyanshiqiantui);
        return R.ok().put("data",shiyanshiqiantui.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改实验室签退")
    public R update(@RequestBody ShiyanshiqiantuiEntity shiyanshiqiantui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiqiantui);
        //全部更新
        shiyanshiqiantuiService.updateById(shiyanshiqiantui);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验室签退")
    public R delete(@RequestBody Long[] ids){
        shiyanshiqiantuiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}

