package com.bootdo.idle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.idle.dao.IdleDao;
import com.bootdo.idle.domain.IdleDO;
import com.bootdo.idle.service.IdleService;



@Service
public class IdleServiceImpl implements IdleService {
	@Autowired
	private IdleDao idleDao;
	
	@Override
	public IdleDO get(Integer idleId){
		return idleDao.get(idleId);
	}
	
	@Override
	public List<IdleDO> list(Map<String, Object> map){
		return idleDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return idleDao.count(map);
	}
	
	@Override
	public int save(IdleDO idle){
		return idleDao.save(idle);
	}
	
	@Override
	public int update(IdleDO idle){
		return idleDao.update(idle);
	}
	
	@Override
	public int remove(Integer idleId){
		return idleDao.remove(idleId);
	}
	
	@Override
	public int batchRemove(Integer[] idleIds){
		return idleDao.batchRemove(idleIds);
	}
	
}
