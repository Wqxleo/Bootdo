package com.bootdo.keyword.controller;

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

import com.bootdo.keyword.domain.KeywordDO;
import com.bootdo.keyword.service.KeywordService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:17
 */
 
@Controller
@RequestMapping("/keyword/keyword")
public class KeywordController {
	@Autowired
	private KeywordService keywordService;
	
	@GetMapping()
	@RequiresPermissions("keyword:keyword:keyword")
	String Keyword(){
	    return "keyword/keyword/keyword";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("keyword:keyword:keyword")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<KeywordDO> keywordList = keywordService.list(query);
		int total = keywordService.count(query);
		PageUtils pageUtils = new PageUtils(keywordList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("keyword:keyword:add")
	String add(){
	    return "keyword/keyword/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("keyword:keyword:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		KeywordDO keyword = keywordService.get(id);
		model.addAttribute("keyword", keyword);
	    return "keyword/keyword/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("keyword:keyword:add")
	public R save( KeywordDO keyword){
		if(keywordService.save(keyword)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("keyword:keyword:edit")
	public R update( KeywordDO keyword){
		keywordService.update(keyword);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("keyword:keyword:remove")
	public R remove( Integer id){
		if(keywordService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("keyword:keyword:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		keywordService.batchRemove(ids);
		return R.ok();
	}
	
}
