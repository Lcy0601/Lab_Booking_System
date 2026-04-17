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
import com.yb.entity.DiscussshiyanshiEntity;
import com.yb.entity.view.DiscussshiyanshiView;

import com.yb.service.DiscussshiyanshiService;
import com.yb.utils.PageUtils;
import com.yb.utils.R;
import com.yb.utils.MPUtil;
import com.yb.utils.MapUtils;
import com.yb.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室评论
 * 后端接口
 * @author 
 * @email 
 * @date 2026-04-08 22:34:09
 */
@RestController
@RequestMapping("/discussshiyanshi")
public class DiscussshiyanshiController {
    @Autowired
    private DiscussshiyanshiService discussshiyanshiService;










    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussshiyanshiEntity discussshiyanshi,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<DiscussshiyanshiEntity> ew = new QueryWrapper<DiscussshiyanshiEntity>();


        //查询结果
		PageUtils page = discussshiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshiyanshi), params), params));
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
    public R list(@RequestParam Map<String, Object> params,DiscussshiyanshiEntity discussshiyanshi,
                @RequestParam(required = false) Double scorestart,
                @RequestParam(required = false) Double scoreend,
                @RequestParam(required = false) Double thumbsupnumstart,
                @RequestParam(required = false) Double thumbsupnumend,
                @RequestParam(required = false) Double crazilynumstart,
                @RequestParam(required = false) Double crazilynumend,
                @RequestParam(required = false) Double istopstart,
                @RequestParam(required = false) Double istopend,
		HttpServletRequest request){
        //设置查询条件
        QueryWrapper<DiscussshiyanshiEntity> ew = new QueryWrapper<DiscussshiyanshiEntity>();
        if(scorestart!=null) ew.ge("score", scorestart);
        if(scoreend!=null) ew.le("score", scoreend);
        if(thumbsupnumstart!=null) ew.ge("thumbsupnum", thumbsupnumstart);
        if(thumbsupnumend!=null) ew.le("thumbsupnum", thumbsupnumend);
        if(crazilynumstart!=null) ew.ge("crazilynum", crazilynumstart);
        if(crazilynumend!=null) ew.le("crazilynum", crazilynumend);
        if(istopstart!=null) ew.ge("istop", istopstart);
        if(istopend!=null) ew.le("istop", istopend);

        //查询结果
		PageUtils page = discussshiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshiyanshi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }




	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussshiyanshiEntity discussshiyanshi){
       	QueryWrapper<DiscussshiyanshiEntity> ew = new QueryWrapper<DiscussshiyanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussshiyanshi, "discussshiyanshi"));
        return R.ok().put("data", discussshiyanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussshiyanshiEntity discussshiyanshi){
        QueryWrapper< DiscussshiyanshiEntity> ew = new QueryWrapper< DiscussshiyanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussshiyanshi, "discussshiyanshi"));
		DiscussshiyanshiView discussshiyanshiView =  discussshiyanshiService.selectView(ew);
		return R.ok("查询实验室评论成功").put("data", discussshiyanshiView);
    }

    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussshiyanshiEntity discussshiyanshi = discussshiyanshiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(discussshiyanshi,deSens);
        return R.ok().put("data", discussshiyanshi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussshiyanshiEntity discussshiyanshi = discussshiyanshiService.getById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(discussshiyanshi,deSens);
        return R.ok().put("data", discussshiyanshi);
    }




    /**
     * 后台保存
     */
    @RequestMapping("/save")
    @SysLog("新增实验室评论")
    public R save(@RequestBody DiscussshiyanshiEntity discussshiyanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshiyanshi);
        discussshiyanshiService.save(discussshiyanshi);
        return R.ok().put("data",discussshiyanshi.getId());
    }

    /**
     * 前台保存
     */
    @SysLog("新增实验室评论")
    @RequestMapping("/add")
    public R add(@RequestBody DiscussshiyanshiEntity discussshiyanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshiyanshi);
        discussshiyanshiService.save(discussshiyanshi);
        return R.ok().put("data",discussshiyanshi.getId());
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussshiyanshiEntity discussshiyanshi = discussshiyanshiService.getOne(new QueryWrapper<DiscussshiyanshiEntity>().eq("", username));
        return R.ok().put("data", discussshiyanshi);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussshiyanshiEntity discussshiyanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussshiyanshi);
        //全部更新
        discussshiyanshiService.updateById(discussshiyanshi);
        return R.ok();
    }





    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除实验室评论")
    public R delete(@RequestBody Long[] ids){
        discussshiyanshiService.removeBatchByIds(Arrays.asList(ids));
        return R.ok();
    }

	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussshiyanshiEntity discussshiyanshi, HttpServletRequest request,String pre){
        QueryWrapper<DiscussshiyanshiEntity> ew = new QueryWrapper<DiscussshiyanshiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
        // 组装参数
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");

		PageUtils page = discussshiyanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussshiyanshi), params), params));
        return R.ok().put("data", page);
    }




    // hasAlipay:$hasAlipay




}
