package com.bootdo.university.controller;

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

import com.bootdo.university.domain.UniversityDO;
import com.bootdo.university.service.UniversityService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:58:00
 */
 
@Controller
@RequestMapping("/university/university")
public class UniversityController {
	@Autowired
	private UniversityService universityService;
	
	@GetMapping()
	@RequiresPermissions("university:university:university")
	String University(){
	    return "university/university/university";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("university:university:university")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UniversityDO> universityList = universityService.list(query);
		int total = universityService.count(query);
		PageUtils pageUtils = new PageUtils(universityList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("university:university:add")
	String add(){
	    return "university/university/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("university:university:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		UniversityDO university = universityService.get(id);
		model.addAttribute("university", university);
	    return "university/university/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("university:university:add")
	public R save( UniversityDO university){
		if(universityService.save(university)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("university:university:edit")
	public R update( UniversityDO university){
		universityService.update(university);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("university:university:remove")
	public R remove( Integer id){
		if(universityService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("university:university:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		universityService.batchRemove(ids);
		return R.ok();
	}
	
}
