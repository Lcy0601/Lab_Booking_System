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
import com.yb.entity.QuxiaoshiyanshiyuyueEntity;
import com.yb.entity.view.QuxiaoshiyanshiyuyueView;

import com.yb.service.QuxiaoshiyanshiyuyueService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 取消实验室预约
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/quxiaoshiyanshiyuyue")
public class QuxiaoshiyanshiyuyueController {
    @Autowired
    private QuxiaoshiyanshiyuyueService quxiaoshiyanshiyuyueService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			quxiaoshiyanshiyuyue.setXueshengxuehao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<QuxiaoshiyanshiyuyueEntity> ew = new QueryWrapper<QuxiaoshiyanshiyuyueEntity>();


        //查询结果
		PageUtils page = quxiaoshiyanshiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshiyanshiyuyue), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }


    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdatestart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date appointmentdateend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date quxiaoshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date quxiaoshijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<QuxiaoshiyanshiyuyueEntity> ew = new QueryWrapper<QuxiaoshiyanshiyuyueEntity>();
        if(appointmentdatestart!=null) ew.ge("appointmentdate", appointmentdatestart);
        if(appointmentdateend!=null) ew.le("appointmentdate", appointmentdateend);
        if(quxiaoshijianstart!=null) ew.ge("quxiaoshijian", quxiaoshijianstart);
        if(quxiaoshijianend!=null) ew.le("quxiaoshijian", quxiaoshijianend);

        //查询结果
		PageUtils page = quxiaoshiyanshiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quxiaoshiyanshiyuyue), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue){
       	QueryWrapper<QuxiaoshiyanshiyuyueEntity> ew = new QueryWrapper<QuxiaoshiyanshiyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quxiaoshiyanshiyuyue, "quxiaoshiyanshiyuyue"));
        return R.ok().put("data", quxiaoshiyanshiyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue){
        QueryWrapper< QuxiaoshiyanshiyuyueEntity> ew = new QueryWrapper< QuxiaoshiyanshiyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quxiaoshiyanshiyuyue, "quxiaoshiyanshiyuyue"));
		QuxiaoshiyanshiyuyueView quxiaoshiyanshiyuyueView =  quxiaoshiyanshiyuyueService.selectView(ew);
		return R.ok("查询取消实验室预约成功").put("data", quxiaoshiyanshiyuyueView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue = quxiaoshiyanshiyuyueService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(quxiaoshiyanshiyuyue,deSens);
        return R.ok().put("data", quxiaoshiyanshiyuyue);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue = quxiaoshiyanshiyuyueService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(quxiaoshiyanshiyuyue,deSens);
        return R.ok().put("data", quxiaoshiyanshiyuyue);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增取消实验室预约")
    public R save(@RequestBody QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshiyanshiyuyue);
        quxiaoshiyanshiyuyueService.save(quxiaoshiyanshiyuyue);
        return R.ok().put("data",quxiaoshiyanshiyuyue.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增取消实验室预约")
    @RequestMapping("/add")
    public R add(@RequestBody QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshiyanshiyuyue);
        quxiaoshiyanshiyuyueService.save(quxiaoshiyanshiyuyue);
        return R.ok().put("data",quxiaoshiyanshiyuyue.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改取消实验室预约")
    public R update(@RequestBody QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quxiaoshiyanshiyuyue);
        //全部更新
        quxiaoshiyanshiyuyueService.updateById(quxiaoshiyanshiyuyue);
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    @SysLog("审核取消实验室预约")
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QuxiaoshiyanshiyuyueEntity> list = new ArrayList<QuxiaoshiyanshiyuyueEntity>();
        for(Long id : ids) {
            QuxiaoshiyanshiyuyueEntity quxiaoshiyanshiyuyue = quxiaoshiyanshiyuyueService.getById(id);
            quxiaoshiyanshiyuyue.setSfsh(sfsh);
            quxiaoshiyanshiyuyue.setShhf(shhf);
            list.add(quxiaoshiyanshiyuyue);
        }
        quxiaoshiyanshiyuyueService.updateBatchById(list);
        return R.ok();
    }




    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除取消实验室预约")
    public R delete(@RequestBody Long[] ids){
        quxiaoshiyanshiyuyueService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
