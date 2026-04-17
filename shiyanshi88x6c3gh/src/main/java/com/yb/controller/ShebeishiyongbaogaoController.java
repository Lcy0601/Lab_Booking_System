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
import com.yb.entity.ShebeishiyongbaogaoEntity;
import com.yb.entity.view.ShebeishiyongbaogaoView;

import com.yb.service.ShebeishiyongbaogaoService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备使用报告
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/shebeishiyongbaogao")
public class ShebeishiyongbaogaoController {
    @Autowired
    private ShebeishiyongbaogaoService shebeishiyongbaogaoService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeishiyongbaogaoEntity shebeishiyongbaogao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shebeishiyongbaogao.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<ShebeishiyongbaogaoEntity> ew = new QueryWrapper<ShebeishiyongbaogaoEntity>();


        //查询结果
		PageUtils page = shebeishiyongbaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeishiyongbaogao), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ShebeishiyongbaogaoEntity shebeishiyongbaogao,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangbaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangbaoshijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShebeishiyongbaogaoEntity> ew = new QueryWrapper<ShebeishiyongbaogaoEntity>();
        if(shangbaoshijianstart!=null) ew.ge("shangbaoshijian", shangbaoshijianstart);
        if(shangbaoshijianend!=null) ew.le("shangbaoshijian", shangbaoshijianend);

        //查询结果
		PageUtils page = shebeishiyongbaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeishiyongbaogao), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeishiyongbaogaoEntity shebeishiyongbaogao){
       	QueryWrapper<ShebeishiyongbaogaoEntity> ew = new QueryWrapper<ShebeishiyongbaogaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeishiyongbaogao, "shebeishiyongbaogao"));
        return R.ok().put("data", shebeishiyongbaogaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeishiyongbaogaoEntity shebeishiyongbaogao){
        QueryWrapper< ShebeishiyongbaogaoEntity> ew = new QueryWrapper< ShebeishiyongbaogaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeishiyongbaogao, "shebeishiyongbaogao"));
		ShebeishiyongbaogaoView shebeishiyongbaogaoView =  shebeishiyongbaogaoService.selectView(ew);
		return R.ok("查询设备使用报告成功").put("data", shebeishiyongbaogaoView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeishiyongbaogaoEntity shebeishiyongbaogao = shebeishiyongbaogaoService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shebeishiyongbaogao,deSens);
        return R.ok().put("data", shebeishiyongbaogao);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeishiyongbaogaoEntity shebeishiyongbaogao = shebeishiyongbaogaoService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shebeishiyongbaogao,deSens);
        return R.ok().put("data", shebeishiyongbaogao);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增设备使用报告")
    public R save(@RequestBody ShebeishiyongbaogaoEntity shebeishiyongbaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeishiyongbaogao);
        shebeishiyongbaogaoService.save(shebeishiyongbaogao);
        return R.ok().put("data",shebeishiyongbaogao.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增设备使用报告")
    @RequestMapping("/add")
    public R add(@RequestBody ShebeishiyongbaogaoEntity shebeishiyongbaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeishiyongbaogao);
        shebeishiyongbaogaoService.save(shebeishiyongbaogao);
        return R.ok().put("data",shebeishiyongbaogao.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改设备使用报告")
    public R update(@RequestBody ShebeishiyongbaogaoEntity shebeishiyongbaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeishiyongbaogao);
        //全部更新
        shebeishiyongbaogaoService.updateById(shebeishiyongbaogao);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除设备使用报告")
    public R delete(@RequestBody Long[] ids){
        shebeishiyongbaogaoService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
