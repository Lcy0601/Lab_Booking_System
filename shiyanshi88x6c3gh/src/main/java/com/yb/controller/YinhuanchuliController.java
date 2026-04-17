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
import com.yb.entity.YinhuanchuliEntity;
import com.yb.entity.view.YinhuanchuliView;

import com.yb.service.YinhuanchuliService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 隐患处理
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/yinhuanchuli")
public class YinhuanchuliController {
    @Autowired
    private YinhuanchuliService yinhuanchuliService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinhuanchuliEntity yinhuanchuli,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yinhuanchuli.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<YinhuanchuliEntity> ew = new QueryWrapper<YinhuanchuliEntity>();


        //查询结果
		PageUtils page = yinhuanchuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinhuanchuli), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinhuanchuliEntity yinhuanchuli,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdatestart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdateend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangbaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangbaoshijianend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date chulishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date chulishijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<YinhuanchuliEntity> ew = new QueryWrapper<YinhuanchuliEntity>();
        if(appointmentdatestart!=null) ew.ge("appointmentdate", appointmentdatestart);
        if(appointmentdateend!=null) ew.le("appointmentdate", appointmentdateend);
        if(shangbaoshijianstart!=null) ew.ge("shangbaoshijian", shangbaoshijianstart);
        if(shangbaoshijianend!=null) ew.le("shangbaoshijian", shangbaoshijianend);
        if(chulishijianstart!=null) ew.ge("chulishijian", chulishijianstart);
        if(chulishijianend!=null) ew.le("chulishijian", chulishijianend);

        //查询结果
		PageUtils page = yinhuanchuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinhuanchuli), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinhuanchuliEntity yinhuanchuli){
       	QueryWrapper<YinhuanchuliEntity> ew = new QueryWrapper<YinhuanchuliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinhuanchuli, "yinhuanchuli"));
        return R.ok().put("data", yinhuanchuliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinhuanchuliEntity yinhuanchuli){
        QueryWrapper< YinhuanchuliEntity> ew = new QueryWrapper< YinhuanchuliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinhuanchuli, "yinhuanchuli"));
		YinhuanchuliView yinhuanchuliView =  yinhuanchuliService.selectView(ew);
		return R.ok("查询隐患处理成功").put("data", yinhuanchuliView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinhuanchuliEntity yinhuanchuli = yinhuanchuliService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yinhuanchuli,deSens);
        return R.ok().put("data", yinhuanchuli);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinhuanchuliEntity yinhuanchuli = yinhuanchuliService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(yinhuanchuli,deSens);
        return R.ok().put("data", yinhuanchuli);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增隐患处理")
    public R save(@RequestBody YinhuanchuliEntity yinhuanchuli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinhuanchuli);
        yinhuanchuliService.save(yinhuanchuli);
        return R.ok().put("data",yinhuanchuli.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增隐患处理")
    @RequestMapping("/add")
    public R add(@RequestBody YinhuanchuliEntity yinhuanchuli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinhuanchuli);
        yinhuanchuliService.save(yinhuanchuli);
        return R.ok().put("data",yinhuanchuli.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改隐患处理")
    public R update(@RequestBody YinhuanchuliEntity yinhuanchuli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinhuanchuli);
        //全部更新
        yinhuanchuliService.updateById(yinhuanchuli);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除隐患处理")
    public R delete(@RequestBody Long[] ids){
        yinhuanchuliService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
