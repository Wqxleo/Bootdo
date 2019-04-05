package com.bootdo.student.service;

import com.bootdo.student.domain.InUniversityDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:57:25
 */
public interface InUniversityService {
	
	InUniversityDO get(Integer id);
	
	List<InUniversityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InUniversityDO inUniversity);
	
	int update(InUniversityDO inUniversity);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
