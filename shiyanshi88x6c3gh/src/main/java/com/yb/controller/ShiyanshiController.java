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
import com.yb.entity.ShiyanshiEntity;
import com.yb.entity.view.ShiyanshiView;

import com.yb.service.ShiyanshiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;
import com.yb.service.StoreupService;
import com.yb.entity.StoreupEntity;

/**
 * 实验室
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:07
 */
@RestController
@RequestMapping("/shiyanshi")
public class ShiyanshiController {
    @Autowired
    private ShiyanshiService shiyanshiService;

    @Autowired
    private StoreupService storeupService;









    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshiEntity shiyanshi,
                @RequestParam(required = false) Double reduciblenumstart,
                @RequestParam(required = false) Double reduciblenumend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshiEntity> ew = new QueryWrapper<ShiyanshiEntity>();
        if(reduciblenumstart!=null) ew.ge("reduciblenum", reduciblenumstart);
        if(reduciblenumend!=null) ew.le("reduciblenum", reduciblenumend);


        //查询结果
		PageUtils page = shiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshi), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ShiyanshiEntity shiyanshi,
                @RequestParam(required = false) Double reduciblenumstart,
                @RequestParam(required = false) Double reduciblenumend,
                @RequestParam(required = false) Double discussnumstart,
                @RequestParam(required = false) Double discussnumend,
                @RequestParam(required = false) Double totalscorestart,
                @RequestParam(required = false) Double totalscoreend,
                @RequestParam(required = false) Double storeupnumstart,
                @RequestParam(required = false) Double storeupnumend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanshiEntity> ew = new QueryWrapper<ShiyanshiEntity>();
        if(reduciblenumstart!=null) ew.ge("reduciblenum", reduciblenumstart);
        if(reduciblenumend!=null) ew.le("reduciblenum", reduciblenumend);
        if(discussnumstart!=null) ew.ge("discussnum", discussnumstart);
        if(discussnumend!=null) ew.le("discussnum", discussnumend);
        if(totalscorestart!=null) ew.ge("totalscore", totalscorestart);
        if(totalscoreend!=null) ew.le("totalscore", totalscoreend);
        if(storeupnumstart!=null) ew.ge("storeupnum", storeupnumstart);
        if(storeupnumend!=null) ew.le("storeupnum", storeupnumend);

        //查询结果
		PageUtils page = shiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshiEntity shiyanshi){
       	QueryWrapper<ShiyanshiEntity> ew = new QueryWrapper<ShiyanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshi, "shiyanshi"));
        return R.ok().put("data", shiyanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshiEntity shiyanshi){
        QueryWrapper< ShiyanshiEntity> ew = new QueryWrapper< ShiyanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshi, "shiyanshi"));
		ShiyanshiView shiyanshiView =  shiyanshiService.selectView(ew);
		return R.ok("查询实验室成功").put("data", shiyanshiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshiEntity shiyanshi = shiyanshiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshi,deSens);
        return R.ok().put("data", shiyanshi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshiEntity shiyanshi = shiyanshiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanshi,deSens);
        return R.ok().put("data", shiyanshi);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验室")
    public R save(@RequestBody ShiyanshiEntity shiyanshi, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(shiyanshiService.count(new QueryWrapper<ShiyanshiEntity>().eq("bianhao", shiyanshi.getBianhao()))>0) {
            return R.error("编号已存在");
        }
        //ValidatorUtils.validateEntity(shiyanshi);
        shiyanshiService.save(shiyanshi);
        return R.ok().put("data",shiyanshi.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验室")
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiEntity shiyanshi, HttpServletRequest request){
        //验证字段唯一性，否则返回错误信息
        if(shiyanshiService.count(new QueryWrapper<ShiyanshiEntity>().eq("bianhao", shiyanshi.getBianhao()))>0) {
            return R.error("编号已存在");
        }
        //ValidatorUtils.validateEntity(shiyanshi);
        shiyanshiService.save(shiyanshi);
        return R.ok().put("data",shiyanshi.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改实验室")
    public R update(@RequestBody ShiyanshiEntity shiyanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshi);
        //验证字段唯一性，否则返回错误信息
        if(shiyanshiService.count(new QueryWrapper<ShiyanshiEntity>().ne("id", shiyanshi.getId()).eq("bianhao", shiyanshi.getBianhao()))>0) {
            return R.error("编号已存在");
        }
        //全部更新
        shiyanshiService.updateById(shiyanshi);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验室")
    public R delete(@RequestBody Long[] ids){
        shiyanshiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
