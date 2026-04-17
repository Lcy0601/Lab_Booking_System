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
import com.yb.entity.ShiyanzhidaoEntity;
import com.yb.entity.view.ShiyanzhidaoView;

import com.yb.service.ShiyanzhidaoService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;
import com.yb.service.StoreupService;
import com.yb.entity.StoreupEntity;

/**
 * 实验指导
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:08
 */
@RestController
@RequestMapping("/shiyanzhidao")
public class ShiyanzhidaoController {
    @Autowired
    private ShiyanzhidaoService shiyanzhidaoService;

    @Autowired
    private StoreupService storeupService;









    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanzhidaoEntity shiyanzhidao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shiyanzhidao.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        QueryWrapper<ShiyanzhidaoEntity> ew = new QueryWrapper<ShiyanzhidaoEntity>();


        //查询结果
		PageUtils page = shiyanzhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanzhidao), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ShiyanzhidaoEntity shiyanzhidao,
                @RequestParam(required = false) Double thumbsupnumstart,
                @RequestParam(required = false) Double thumbsupnumend,
                @RequestParam(required = false) Double crazilynumstart,
                @RequestParam(required = false) Double crazilynumend,
                @RequestParam(required = false) Double clicknumstart,
                @RequestParam(required = false) Double clicknumend,
                @RequestParam(required = false) Double discussnumstart,
                @RequestParam(required = false) Double discussnumend,
                @RequestParam(required = false) Double storeupnumstart,
                @RequestParam(required = false) Double storeupnumend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<ShiyanzhidaoEntity> ew = new QueryWrapper<ShiyanzhidaoEntity>();
        if(thumbsupnumstart!=null) ew.ge("thumbsupnum", thumbsupnumstart);
        if(thumbsupnumend!=null) ew.le("thumbsupnum", thumbsupnumend);
        if(crazilynumstart!=null) ew.ge("crazilynum", crazilynumstart);
        if(crazilynumend!=null) ew.le("crazilynum", crazilynumend);
        if(clicknumstart!=null) ew.ge("clicknum", clicknumstart);
        if(clicknumend!=null) ew.le("clicknum", clicknumend);
        if(discussnumstart!=null) ew.ge("discussnum", discussnumstart);
        if(discussnumend!=null) ew.le("discussnum", discussnumend);
        if(storeupnumstart!=null) ew.ge("storeupnum", storeupnumstart);
        if(storeupnumend!=null) ew.le("storeupnum", storeupnumend);

        //查询结果
		PageUtils page = shiyanzhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanzhidao), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanzhidaoEntity shiyanzhidao){
       	QueryWrapper<ShiyanzhidaoEntity> ew = new QueryWrapper<ShiyanzhidaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanzhidao, "shiyanzhidao"));
        return R.ok().put("data", shiyanzhidaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanzhidaoEntity shiyanzhidao){
        QueryWrapper< ShiyanzhidaoEntity> ew = new QueryWrapper< ShiyanzhidaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanzhidao, "shiyanzhidao"));
		ShiyanzhidaoView shiyanzhidaoView =  shiyanzhidaoService.selectView(ew);
		return R.ok("查询实验指导成功").put("data", shiyanzhidaoView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanzhidaoEntity shiyanzhidao = shiyanzhidaoService.getById(id);
        if(null==shiyanzhidao.getClicknum()){
            shiyanzhidao.setClicknum(0);
        }
		shiyanzhidao.setClicknum(shiyanzhidao.getClicknum()+1);
		shiyanzhidaoService.updateById(shiyanzhidao);
        shiyanzhidao = shiyanzhidaoService.selectView(new QueryWrapper<ShiyanzhidaoEntity>().eq("id", id));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanzhidao,deSens);
        return R.ok().put("data", shiyanzhidao);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanzhidaoEntity shiyanzhidao = shiyanzhidaoService.getById(id);
        if(null==shiyanzhidao.getClicknum()){
            shiyanzhidao.setClicknum(0);
        }
		shiyanzhidao.setClicknum(shiyanzhidao.getClicknum()+1);
		shiyanzhidaoService.updateById(shiyanzhidao);
        shiyanzhidao = shiyanzhidaoService.selectView(new QueryWrapper<ShiyanzhidaoEntity>().eq("id", id));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shiyanzhidao,deSens);
        return R.ok().put("data", shiyanzhidao);
    }



    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShiyanzhidaoEntity shiyanzhidao = shiyanzhidaoService.getById(id);
        if(type.equals("1")) {
        	shiyanzhidao.setThumbsupnum(shiyanzhidao.getThumbsupnum()+1);
        } else {
        	shiyanzhidao.setCrazilynum(shiyanzhidao.getCrazilynum()+1);
        }
        shiyanzhidaoService.updateById(shiyanzhidao);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验指导")
    public R save(@RequestBody ShiyanzhidaoEntity shiyanzhidao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanzhidao);
        shiyanzhidaoService.save(shiyanzhidao);
        return R.ok().put("data",shiyanzhidao.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验指导")
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanzhidaoEntity shiyanzhidao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanzhidao);
        shiyanzhidaoService.save(shiyanzhidao);
        return R.ok().put("data",shiyanzhidao.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改实验指导")
    public R update(@RequestBody ShiyanzhidaoEntity shiyanzhidao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanzhidao);
        //全部更新
        shiyanzhidaoService.updateById(shiyanzhidao);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验指导")
    public R delete(@RequestBody Long[] ids){
        shiyanzhidaoService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }





    // hasAlipay:否




}
