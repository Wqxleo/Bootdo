package com.bootdo.idle.dao;

import com.bootdo.idle.domain.IdleDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:51:27
 */
@Mapper
public interface IdleDao {

	IdleDO get(Integer idleId);
	
	List<IdleDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IdleDO idle);
	
	int update(IdleDO idle);
	
	int remove(Integer idle_id);
	
	int batchRemove(Integer[] idleIds);
}
