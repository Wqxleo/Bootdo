package com.bootdo.keyword.dao;

import com.bootdo.keyword.domain.KeywordDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:17
 */
@Mapper
public interface KeywordDao {

	KeywordDO get(Integer id);
	
	List<KeywordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KeywordDO keyword);
	
	int update(KeywordDO keyword);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
