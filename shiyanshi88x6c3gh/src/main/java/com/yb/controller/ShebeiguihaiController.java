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
import com.yb.entity.ShebeiguihaiEntity;
import com.yb.entity.view.ShebeiguihaiView;

import com.yb.service.ShebeiguihaiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备归还
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/shebeiguihai")
public class ShebeiguihaiController {
    @Autowired
    private ShebeiguihaiService shebeiguihaiService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeiguihaiEntity shebeiguihai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shebeiguihai.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<ShebeiguihaiEntity> ew = new QueryWrapper<ShebeiguihaiEntity>();


        //查询结果
		PageUtils page = shebeiguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeiguihai), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ShebeiguihaiEntity shebeiguihai,
                @RequestParam(required = false) Double shuliangstart,
                @RequestParam(required = false) Double shuliangend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date guihaishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date guihaishijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShebeiguihaiEntity> ew = new QueryWrapper<ShebeiguihaiEntity>();
        if(shuliangstart!=null) ew.ge("shuliang", shuliangstart);
        if(shuliangend!=null) ew.le("shuliang", shuliangend);
        if(guihaishijianstart!=null) ew.ge("guihaishijian", guihaishijianstart);
        if(guihaishijianend!=null) ew.le("guihaishijian", guihaishijianend);

        //查询结果
		PageUtils page = shebeiguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeiguihai), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeiguihaiEntity shebeiguihai){
       	QueryWrapper<ShebeiguihaiEntity> ew = new QueryWrapper<ShebeiguihaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeiguihai, "shebeiguihai"));
        return R.ok().put("data", shebeiguihaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeiguihaiEntity shebeiguihai){
        QueryWrapper< ShebeiguihaiEntity> ew = new QueryWrapper< ShebeiguihaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeiguihai, "shebeiguihai"));
		ShebeiguihaiView shebeiguihaiView =  shebeiguihaiService.selectView(ew);
		return R.ok("查询设备归还成功").put("data", shebeiguihaiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeiguihaiEntity shebeiguihai = shebeiguihaiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shebeiguihai,deSens);
        return R.ok().put("data", shebeiguihai);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeiguihaiEntity shebeiguihai = shebeiguihaiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shebeiguihai,deSens);
        return R.ok().put("data", shebeiguihai);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增设备归还")
    public R save(@RequestBody ShebeiguihaiEntity shebeiguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeiguihai);
        shebeiguihaiService.save(shebeiguihai);
        return R.ok().put("data",shebeiguihai.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增设备归还")
    @RequestMapping("/add")
    public R add(@RequestBody ShebeiguihaiEntity shebeiguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeiguihai);
        shebeiguihaiService.save(shebeiguihai);
        return R.ok().put("data",shebeiguihai.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改设备归还")
    public R update(@RequestBody ShebeiguihaiEntity shebeiguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeiguihai);
        //全部更新
        shebeiguihaiService.updateById(shebeiguihai);
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    @SysLog("审核设备归还")
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ShebeiguihaiEntity> list = new ArrayList<ShebeiguihaiEntity>();
        for(Long id : ids) {
            ShebeiguihaiEntity shebeiguihai = shebeiguihaiService.getById(id);
            shebeiguihai.setSfsh(sfsh);
            shebeiguihai.setShhf(shhf);
            list.add(shebeiguihai);
        }
        shebeiguihaiService.updateBatchById(list);
        return R.ok();
    }




    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除设备归还")
    public R delete(@RequestBody Long[] ids){
        shebeiguihaiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
