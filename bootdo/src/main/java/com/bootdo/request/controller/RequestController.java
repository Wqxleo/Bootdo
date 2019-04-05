package com.bootdo.request.controller;

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

import com.bootdo.request.domain.RequestDO;
import com.bootdo.request.service.RequestService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:54
 */
 
@Controller
@RequestMapping("/request/request")
public class RequestController {
	@Autowired
	private RequestService requestService;
	
	@GetMapping()
	@RequiresPermissions("request:request:request")
	String Request(){
	    return "request/request/request";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("request:request:request")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RequestDO> requestList = requestService.list(query);
		int total = requestService.count(query);
		PageUtils pageUtils = new PageUtils(requestList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("request:request:add")
	String add(){
	    return "request/request/add";
	}

	@GetMapping("/edit/{requestId}")
	@RequiresPermissions("request:request:edit")
	String edit(@PathVariable("requestId") Integer requestId,Model model){
		RequestDO request = requestService.get(requestId);
		model.addAttribute("request", request);
	    return "request/request/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("request:request:add")
	public R save( RequestDO request){
		if(requestService.save(request)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("request:request:edit")
	public R update( RequestDO request){
		requestService.update(request);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("request:request:remove")
	public R remove( Integer requestId){
		if(requestService.remove(requestId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("request:request:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] requestIds){
		requestService.batchRemove(requestIds);
		return R.ok();
	}
	
}
