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
import com.yb.entity.ShiyanshiqiandaoEntity;
import com.yb.entity.view.ShiyanshiqiandaoView;

import com.yb.service.ShiyanshiqiandaoService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室签到
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/shiyanshiqiandao")
public class ShiyanshiqiandaoController {
    @Autowired
    private ShiyanshiqiandaoService shiyanshiqiandaoService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshiqiandaoEntity shiyanshiqiandao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shiyanshiqiandao.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<ShiyanshiqiandaoEntity> ew = new QueryWrapper<ShiyanshiqiandaoEntity>();


        //查询结果
		PageUtils page = shiyanshiqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiqiandao), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshiqiandaoEntity shiyanshiqiandao,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdatestart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdateend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date qiandaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date qiandaoshijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshiqiandaoEntity> ew = new QueryWrapper<ShiyanshiqiandaoEntity>();
        if(appointmentdatestart!=null) ew.ge("appointmentdate", appointmentdatestart);
        if(appointmentdateend!=null) ew.le("appointmentdate", appointmentdateend);
        if(qiandaoshijianstart!=null) ew.ge("qiandaoshijian", qiandaoshijianstart);
        if(qiandaoshijianend!=null) ew.le("qiandaoshijian", qiandaoshijianend);

        //查询结果
		PageUtils page = shiyanshiqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiqiandao), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshiqiandaoEntity shiyanshiqiandao){
       	QueryWrapper<ShiyanshiqiandaoEntity> ew = new QueryWrapper<ShiyanshiqiandaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshiqiandao, "shiyanshiqiandao"));
        return R.ok().put("data", shiyanshiqiandaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshiqiandaoEntity shiyanshiqiandao){
        QueryWrapper< ShiyanshiqiandaoEntity> ew = new QueryWrapper< ShiyanshiqiandaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshiqiandao, "shiyanshiqiandao"));
		ShiyanshiqiandaoView shiyanshiqiandaoView =  shiyanshiqiandaoService.selectView(ew);
		return R.ok("查询实验室签到成功").put("data", shiyanshiqiandaoView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshiqiandaoEntity shiyanshiqiandao = shiyanshiqiandaoService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshiqiandao,deSens);
        return R.ok().put("data", shiyanshiqiandao);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshiqiandaoEntity shiyanshiqiandao = shiyanshiqiandaoService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshiqiandao,deSens);
        return R.ok().put("data", shiyanshiqiandao);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验室签到")
    public R save(@RequestBody ShiyanshiqiandaoEntity shiyanshiqiandao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiqiandao);
        shiyanshiqiandaoService.save(shiyanshiqiandao);
        return R.ok().put("data",shiyanshiqiandao.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验室签到")
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiqiandaoEntity shiyanshiqiandao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiqiandao);
        shiyanshiqiandaoService.save(shiyanshiqiandao);
        return R.ok().put("data",shiyanshiqiandao.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改实验室签到")
    public R update(@RequestBody ShiyanshiqiandaoEntity shiyanshiqiandao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiqiandao);
        //全部更新
        shiyanshiqiandaoService.updateById(shiyanshiqiandao);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验室签到")
    public R delete(@RequestBody Long[] ids){
        shiyanshiqiandaoService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}

