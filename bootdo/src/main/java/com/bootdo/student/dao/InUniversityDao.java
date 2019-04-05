package com.bootdo.student.dao;

import com.bootdo.student.domain.InUniversityDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:57:25
 */
@Mapper
public interface InUniversityDao {

	InUniversityDO get(Integer id);
	
	List<InUniversityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InUniversityDO inUniversity);
	
	int update(InUniversityDO inUniversity);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
