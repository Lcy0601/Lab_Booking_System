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
import com.yb.entity.BaofeishenqingEntity;
import com.yb.entity.view.BaofeishenqingView;

import com.yb.service.BaofeishenqingService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 报废申请
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:06
 */
@RestController
@RequestMapping("/baofeishenqing")
public class BaofeishenqingController {
    @Autowired
    private BaofeishenqingService baofeishenqingService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaofeishenqingEntity baofeishenqing,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<BaofeishenqingEntity> ew = new QueryWrapper<BaofeishenqingEntity>();


        //查询结果
		PageUtils page = baofeishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baofeishenqing), params), params));
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
    public R list(@RequestParam Map<String, Object> params,BaofeishenqingEntity baofeishenqing,
                @RequestParam(required = false) Double shuliangstart,
                @RequestParam(required = false) Double shuliangend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date baofeishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date baofeishijianend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<BaofeishenqingEntity> ew = new QueryWrapper<BaofeishenqingEntity>();
        if(shuliangstart!=null) ew.ge("shuliang", shuliangstart);
        if(shuliangend!=null) ew.le("shuliang", shuliangend);
        if(baofeishijianstart!=null) ew.ge("baofeishijian", baofeishijianstart);
        if(baofeishijianend!=null) ew.le("baofeishijian", baofeishijianend);

        //查询结果
		PageUtils page = baofeishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baofeishenqing), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaofeishenqingEntity baofeishenqing){
       	QueryWrapper<BaofeishenqingEntity> ew = new QueryWrapper<BaofeishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baofeishenqing, "baofeishenqing"));
        return R.ok().put("data", baofeishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaofeishenqingEntity baofeishenqing){
        QueryWrapper< BaofeishenqingEntity> ew = new QueryWrapper< BaofeishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baofeishenqing, "baofeishenqing"));
		BaofeishenqingView baofeishenqingView =  baofeishenqingService.selectView(ew);
		return R.ok("查询报废申请成功").put("data", baofeishenqingView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaofeishenqingEntity baofeishenqing = baofeishenqingService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(baofeishenqing,deSens);
        return R.ok().put("data", baofeishenqing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaofeishenqingEntity baofeishenqing = baofeishenqingService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(baofeishenqing,deSens);
        return R.ok().put("data", baofeishenqing);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增报废申请")
    public R save(@RequestBody BaofeishenqingEntity baofeishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baofeishenqing);
        baofeishenqingService.save(baofeishenqing);
        return R.ok().put("data",baofeishenqing.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增报废申请")
    @RequestMapping("/add")
    public R add(@RequestBody BaofeishenqingEntity baofeishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baofeishenqing);
        baofeishenqingService.save(baofeishenqing);
        return R.ok().put("data",baofeishenqing.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改报废申请")
    public R update(@RequestBody BaofeishenqingEntity baofeishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baofeishenqing);
        //全部更新
        baofeishenqingService.updateById(baofeishenqing);
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    @SysLog("审核报废申请")
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<BaofeishenqingEntity> list = new ArrayList<BaofeishenqingEntity>();
        for(Long id : ids) {
            BaofeishenqingEntity baofeishenqing = baofeishenqingService.getById(id);
            baofeishenqing.setSfsh(sfsh);
            baofeishenqing.setShhf(shhf);
            list.add(baofeishenqing);
        }
        baofeishenqingService.updateBatchById(list);
        return R.ok();
    }




    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除报废申请")
    public R delete(@RequestBody Long[] ids){
        baofeishenqingService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
