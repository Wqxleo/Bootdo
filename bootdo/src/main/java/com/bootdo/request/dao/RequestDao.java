package com.bootdo.request.dao;

import com.bootdo.request.domain.RequestDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:54
 */
@Mapper
public interface RequestDao {

	RequestDO get(Integer requestId);
	
	List<RequestDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(RequestDO request);
	
	int update(RequestDO request);
	
	int remove(Integer request_id);
	
	int batchRemove(Integer[] requestIds);
}
