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
import com.yb.entity.AnquanyinhuanEntity;
import com.yb.entity.view.AnquanyinhuanView;

import com.yb.service.AnquanyinhuanService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 安全隐患
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/anquanyinhuan")
public class AnquanyinhuanController {
    @Autowired
    private AnquanyinhuanService anquanyinhuanService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,AnquanyinhuanEntity anquanyinhuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			anquanyinhuan.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<AnquanyinhuanEntity> ew = new QueryWrapper<AnquanyinhuanEntity>();


        //查询结果
		PageUtils page = anquanyinhuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, anquanyinhuan), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,AnquanyinhuanEntity anquanyinhuan,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdatestart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdateend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangbaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangbaoshijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<AnquanyinhuanEntity> ew = new QueryWrapper<AnquanyinhuanEntity>();
        if(appointmentdatestart!=null) ew.ge("appointmentdate", appointmentdatestart);
        if(appointmentdateend!=null) ew.le("appointmentdate", appointmentdateend);
        if(shangbaoshijianstart!=null) ew.ge("shangbaoshijian", shangbaoshijianstart);
        if(shangbaoshijianend!=null) ew.le("shangbaoshijian", shangbaoshijianend);

        //查询结果
		PageUtils page = anquanyinhuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, anquanyinhuan), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( AnquanyinhuanEntity anquanyinhuan){
       	QueryWrapper<AnquanyinhuanEntity> ew = new QueryWrapper<AnquanyinhuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( anquanyinhuan, "anquanyinhuan"));
        return R.ok().put("data", anquanyinhuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(AnquanyinhuanEntity anquanyinhuan){
        QueryWrapper< AnquanyinhuanEntity> ew = new QueryWrapper< AnquanyinhuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( anquanyinhuan, "anquanyinhuan"));
		AnquanyinhuanView anquanyinhuanView =  anquanyinhuanService.selectView(ew);
		return R.ok("查询安全隐患成功").put("data", anquanyinhuanView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        AnquanyinhuanEntity anquanyinhuan = anquanyinhuanService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(anquanyinhuan,deSens);
        return R.ok().put("data", anquanyinhuan);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        AnquanyinhuanEntity anquanyinhuan = anquanyinhuanService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(anquanyinhuan,deSens);
        return R.ok().put("data", anquanyinhuan);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增安全隐患")
    public R save(@RequestBody AnquanyinhuanEntity anquanyinhuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(anquanyinhuan);
        anquanyinhuanService.save(anquanyinhuan);
        return R.ok().put("data",anquanyinhuan.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增安全隐患")
    @RequestMapping("/add")
    public R add(@RequestBody AnquanyinhuanEntity anquanyinhuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(anquanyinhuan);
        anquanyinhuanService.save(anquanyinhuan);
        return R.ok().put("data",anquanyinhuan.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改安全隐患")
    public R update(@RequestBody AnquanyinhuanEntity anquanyinhuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(anquanyinhuan);
        //全部更新
        anquanyinhuanService.updateById(anquanyinhuan);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除安全隐患")
    public R delete(@RequestBody Long[] ids){
        anquanyinhuanService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
