package com.bootdo.request.service;

import com.bootdo.request.domain.RequestDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:54
 */
public interface RequestService {
	
	RequestDO get(Integer requestId);
	
	List<RequestDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RequestDO request);
	
	int update(RequestDO request);
	
	int remove(Integer requestId);
	
	int batchRemove(Integer[] requestIds);
}
