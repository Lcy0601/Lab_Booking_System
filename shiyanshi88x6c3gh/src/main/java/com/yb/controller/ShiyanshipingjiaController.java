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
import com.yb.entity.ShiyanshipingjiaEntity;
import com.yb.entity.view.ShiyanshipingjiaView;

import com.yb.service.ShiyanshipingjiaService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室评价
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/shiyanshipingjia")
public class ShiyanshipingjiaController {
    @Autowired
    private ShiyanshipingjiaService shiyanshipingjiaService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshipingjiaEntity shiyanshipingjia,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shiyanshipingjia.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<ShiyanshipingjiaEntity> ew = new QueryWrapper<ShiyanshipingjiaEntity>();


        //查询结果
		PageUtils page = shiyanshipingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshipingjia), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshipingjiaEntity shiyanshipingjia,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdatestart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdateend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshipingjiaEntity> ew = new QueryWrapper<ShiyanshipingjiaEntity>();
        if(appointmentdatestart!=null) ew.ge("appointmentdate", appointmentdatestart);
        if(appointmentdateend!=null) ew.le("appointmentdate", appointmentdateend);

        //查询结果
		PageUtils page = shiyanshipingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshipingjia), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshipingjiaEntity shiyanshipingjia){
       	QueryWrapper<ShiyanshipingjiaEntity> ew = new QueryWrapper<ShiyanshipingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshipingjia, "shiyanshipingjia"));
        return R.ok().put("data", shiyanshipingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshipingjiaEntity shiyanshipingjia){
        QueryWrapper< ShiyanshipingjiaEntity> ew = new QueryWrapper< ShiyanshipingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshipingjia, "shiyanshipingjia"));
		ShiyanshipingjiaView shiyanshipingjiaView =  shiyanshipingjiaService.selectView(ew);
		return R.ok("查询实验室评价成功").put("data", shiyanshipingjiaView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshipingjiaEntity shiyanshipingjia = shiyanshipingjiaService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshipingjia,deSens);
        return R.ok().put("data", shiyanshipingjia);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshipingjiaEntity shiyanshipingjia = shiyanshipingjiaService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshipingjia,deSens);
        return R.ok().put("data", shiyanshipingjia);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验室评价")
    public R save(@RequestBody ShiyanshipingjiaEntity shiyanshipingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshipingjia);
        shiyanshipingjiaService.save(shiyanshipingjia);
        return R.ok().put("data",shiyanshipingjia.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验室评价")
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshipingjiaEntity shiyanshipingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshipingjia);
        shiyanshipingjiaService.save(shiyanshipingjia);
        return R.ok().put("data",shiyanshipingjia.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改实验室评价")
    public R update(@RequestBody ShiyanshipingjiaEntity shiyanshipingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshipingjia);
        //全部更新
        shiyanshipingjiaService.updateById(shiyanshipingjia);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验室评价")
    public R delete(@RequestBody Long[] ids){
        shiyanshipingjiaService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
