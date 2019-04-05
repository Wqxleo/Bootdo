package com.bootdo.idle.service;

import com.bootdo.idle.domain.IdleDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:51:27
 */
public interface IdleService {
	
	IdleDO get(Integer idleId);
	
	List<IdleDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IdleDO idle);
	
	int update(IdleDO idle);
	
	int remove(Integer idleId);
	
	int batchRemove(Integer[] idleIds);
}
