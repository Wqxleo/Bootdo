package com.bootdo.keyword.service;

import com.bootdo.keyword.domain.KeywordDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:17
 */
public interface KeywordService {
	
	KeywordDO get(Integer id);
	
	List<KeywordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KeywordDO keyword);
	
	int update(KeywordDO keyword);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
