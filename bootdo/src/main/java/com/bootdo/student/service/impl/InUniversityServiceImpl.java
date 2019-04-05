package com.bootdo.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.student.dao.InUniversityDao;
import com.bootdo.student.domain.InUniversityDO;
import com.bootdo.student.service.InUniversityService;



@Service
public class InUniversityServiceImpl implements InUniversityService {
	@Autowired
	private InUniversityDao inUniversityDao;
	
	@Override
	public InUniversityDO get(Integer id){
		return inUniversityDao.get(id);
	}
	
	@Override
	public List<InUniversityDO> list(Map<String, Object> map){
		return inUniversityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return inUniversityDao.count(map);
	}
	
	@Override
	public int save(InUniversityDO inUniversity){
		return inUniversityDao.save(inUniversity);
	}
	
	@Override
	public int update(InUniversityDO inUniversity){
		return inUniversityDao.update(inUniversity);
	}
	
	@Override
	public int remove(Integer id){
		return inUniversityDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return inUniversityDao.batchRemove(ids);
	}
	
}
