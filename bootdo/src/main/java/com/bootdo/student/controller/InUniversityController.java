package com.bootdo.student.controller;

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

import com.bootdo.student.domain.InUniversityDO;
import com.bootdo.student.service.InUniversityService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:57:25
 */
 
@Controller
@RequestMapping("/student/inUniversity")
public class InUniversityController {
	@Autowired
	private InUniversityService inUniversityService;
	
	@GetMapping()
	@RequiresPermissions("student:inUniversity:inUniversity")
	String InUniversity(){
	    return "student/inUniversity/inUniversity";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("student:inUniversity:inUniversity")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<InUniversityDO> inUniversityList = inUniversityService.list(query);
		int total = inUniversityService.count(query);
		PageUtils pageUtils = new PageUtils(inUniversityList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("student:inUniversity:add")
	String add(){
	    return "student/inUniversity/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("student:inUniversity:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		InUniversityDO inUniversity = inUniversityService.get(id);
		model.addAttribute("inUniversity", inUniversity);
	    return "student/inUniversity/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("student:inUniversity:add")
	public R save( InUniversityDO inUniversity){
		if(inUniversityService.save(inUniversity)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("student:inUniversity:edit")
	public R update( InUniversityDO inUniversity){
		inUniversityService.update(inUniversity);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("student:inUniversity:remove")
	public R remove( Integer id){
		if(inUniversityService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("student:inUniversity:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		inUniversityService.batchRemove(ids);
		return R.ok();
	}
	
}
