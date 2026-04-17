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
import com.yb.entity.XunchajiluEntity;
import com.yb.entity.view.XunchajiluView;

import com.yb.service.XunchajiluService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 巡查记录
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
@RestController
@RequestMapping("/xunchajilu")
public class XunchajiluController {
    @Autowired
    private XunchajiluService xunchajiluService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XunchajiluEntity xunchajilu,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<XunchajiluEntity> ew = new QueryWrapper<XunchajiluEntity>();


        //查询结果
		PageUtils page = xunchajiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xunchajilu), params), params));
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
    public R list(@RequestParam Map<String, Object> params,XunchajiluEntity xunchajilu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date xunchashijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date xunchashijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<XunchajiluEntity> ew = new QueryWrapper<XunchajiluEntity>();
        if(xunchashijianstart!=null) ew.ge("xunchashijian", xunchashijianstart);
        if(xunchashijianend!=null) ew.le("xunchashijian", xunchashijianend);

        //查询结果
		PageUtils page = xunchajiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xunchajilu), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XunchajiluEntity xunchajilu){
       	QueryWrapper<XunchajiluEntity> ew = new QueryWrapper<XunchajiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xunchajilu, "xunchajilu"));
        return R.ok().put("data", xunchajiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XunchajiluEntity xunchajilu){
        QueryWrapper< XunchajiluEntity> ew = new QueryWrapper< XunchajiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xunchajilu, "xunchajilu"));
		XunchajiluView xunchajiluView =  xunchajiluService.selectView(ew);
		return R.ok("查询巡查记录成功").put("data", xunchajiluView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XunchajiluEntity xunchajilu = xunchajiluService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(xunchajilu,deSens);
        return R.ok().put("data", xunchajilu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XunchajiluEntity xunchajilu = xunchajiluService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(xunchajilu,deSens);
        return R.ok().put("data", xunchajilu);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增巡查记录")
    public R save(@RequestBody XunchajiluEntity xunchajilu, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(xunchajiluService.count(new QueryWrapper<XunchajiluEntity>().eq("bianhao", xunchajilu.getBianhao()))>0) {
            return R.error("编号已存在");
        }
        //ValidatorUtils.validateEntity(xunchajilu);
        xunchajiluService.save(xunchajilu);
        return R.ok().put("data",xunchajilu.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增巡查记录")
    @RequestMapping("/add")
    public R add(@RequestBody XunchajiluEntity xunchajilu, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(xunchajiluService.count(new QueryWrapper<XunchajiluEntity>().eq("bianhao", xunchajilu.getBianhao()))>0) {
            return R.error("编号已存在");
        }
        //ValidatorUtils.validateEntity(xunchajilu);
        xunchajiluService.save(xunchajilu);
        return R.ok().put("data",xunchajilu.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改巡查记录")
    public R update(@RequestBody XunchajiluEntity xunchajilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xunchajilu);
        //验证字段唯一性，否则返回错误信息
        if(xunchajiluService.count(new QueryWrapper<XunchajiluEntity>().ne("id", xunchajilu.getId()).eq("bianhao", xunchajilu.getBianhao()))>0) {
            return R.error("编号已存在");
        }
        //全部更新
        xunchajiluService.updateById(xunchajilu);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除巡查记录")
    public R delete(@RequestBody Long[] ids){
        xunchajiluService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
