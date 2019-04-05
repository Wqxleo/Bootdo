package com.bootdo.university.service;

import com.bootdo.university.domain.UniversityDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:58:00
 */
public interface UniversityService {
	
	UniversityDO get(Integer id);
	
	List<UniversityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UniversityDO university);
	
	int update(UniversityDO university);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
