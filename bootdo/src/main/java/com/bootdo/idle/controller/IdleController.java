package com.bootdo.idle.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.idle.domain.IdleDO;
import com.bootdo.idle.service.IdleService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:51:27
 */
 
@Controller
@RequestMapping("/idle/idle")
public class IdleController {
	@Autowired
	private IdleService idleService;
	
	@GetMapping()
	@RequiresPermissions("idle:idle:idle")
	String Idle(){
	    return "idle/idle/idle";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("idle:idle:idle")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<IdleDO> idleList = idleService.list(query);
		int total = idleService.count(query);
		PageUtils pageUtils = new PageUtils(idleList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("idle:idle:add")
	String add(){
	    return "idle/idle/add";
	}

	@GetMapping("/edit/{idleId}")
	@RequiresPermissions("idle:idle:edit")
	String edit(@PathVariable("idleId") Integer idleId,Model model){
		IdleDO idle = idleService.get(idleId);
		model.addAttribute("idle", idle);
	    return "idle/idle/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("idle:idle:add")
	public R save( IdleDO idle){
		if(idleService.save(idle)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("idle:idle:edit")
	public R update( IdleDO idle){
		idleService.update(idle);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("idle:idle:remove")
	public R remove( Integer idleId){
		if(idleService.remove(idleId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("idle:idle:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] idleIds){
		idleService.batchRemove(idleIds);
		return R.ok();
	}
	
}
