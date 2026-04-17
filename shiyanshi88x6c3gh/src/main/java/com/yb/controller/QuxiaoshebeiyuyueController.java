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
import com.yb.entity.QuxiaoshebeiyuyueEntity;
import com.yb.entity.view.QuxiaoshebeiyuyueView;

import com.yb.service.QuxiaoshebeiyuyueService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 取消设备预约
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/quxiaoshebeiyuyue")
public class QuxiaoshebeiyuyueController {
    @Autowired
    private QuxiaoshebeiyuyueService quxiaoshebeiyuyueService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			quxiaoshebeiyuyue.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<QuxiaoshebeiyuyueEntity> ew = new QueryWrapper<QuxiaoshebeiyuyueEntity>();


        //查询结果
		PageUtils page = quxiaoshebeiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshebeiyuyue), params), params));
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
    public R list(@RequestParam Map<String, Object> params,QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue,
                @RequestParam(required = false) Double shuliangstart,
                @RequestParam(required = false) Double shuliangend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jieyongshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date jieyongshijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<QuxiaoshebeiyuyueEntity> ew = new QueryWrapper<QuxiaoshebeiyuyueEntity>();
        if(shuliangstart!=null) ew.ge("shuliang", shuliangstart);
        if(shuliangend!=null) ew.le("shuliang", shuliangend);
        if(jieyongshijianstart!=null) ew.ge("jieyongshijian", jieyongshijianstart);
        if(jieyongshijianend!=null) ew.le("jieyongshijian", jieyongshijianend);

        //查询结果
		PageUtils page = quxiaoshebeiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshebeiyuyue), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue){
       	QueryWrapper<QuxiaoshebeiyuyueEntity> ew = new QueryWrapper<QuxiaoshebeiyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaoshebeiyuyue, "quxiaoshebeiyuyue"));
        return R.ok().put("data", quxiaoshebeiyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue){
        QueryWrapper< QuxiaoshebeiyuyueEntity> ew = new QueryWrapper< QuxiaoshebeiyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaoshebeiyuyue, "quxiaoshebeiyuyue"));
		QuxiaoshebeiyuyueView quxiaoshebeiyuyueView =  quxiaoshebeiyuyueService.selectView(ew);
		return R.ok("查询取消设备预约成功").put("data", quxiaoshebeiyuyueView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue = quxiaoshebeiyuyueService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(quxiaoshebeiyuyue,deSens);
        return R.ok().put("data", quxiaoshebeiyuyue);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue = quxiaoshebeiyuyueService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(quxiaoshebeiyuyue,deSens);
        return R.ok().put("data", quxiaoshebeiyuyue);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增取消设备预约")
    public R save(@RequestBody QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshebeiyuyue);
        quxiaoshebeiyuyueService.save(quxiaoshebeiyuyue);
        return R.ok().put("data",quxiaoshebeiyuyue.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增取消设备预约")
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshebeiyuyue);
        quxiaoshebeiyuyueService.save(quxiaoshebeiyuyue);
        return R.ok().put("data",quxiaoshebeiyuyue.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改取消设备预约")
    public R update(@RequestBody QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshebeiyuyue);
        //全部更新
        quxiaoshebeiyuyueService.updateById(quxiaoshebeiyuyue);
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    @SysLog("审核取消设备预约")
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QuxiaoshebeiyuyueEntity> list = new ArrayList<QuxiaoshebeiyuyueEntity>();
        for(Long id : ids) {
            QuxiaoshebeiyuyueEntity quxiaoshebeiyuyue = quxiaoshebeiyuyueService.getById(id);
            quxiaoshebeiyuyue.setSfsh(sfsh);
            quxiaoshebeiyuyue.setShhf(shhf);
            list.add(quxiaoshebeiyuyue);
        }
        quxiaoshebeiyuyueService.updateBatchById(list);
        return R.ok();
    }




    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除取消设备预约")
    public R delete(@RequestBody Long[] ids){
        quxiaoshebeiyuyueService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
