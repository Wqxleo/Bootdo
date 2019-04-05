package com.bootdo.university.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.university.dao.UniversityDao;
import com.bootdo.university.domain.UniversityDO;
import com.bootdo.university.service.UniversityService;



@Service
public class UniversityServiceImpl implements UniversityService {
	@Autowired
	private UniversityDao universityDao;
	
	@Override
	public UniversityDO get(Integer id){
		return universityDao.get(id);
	}
	
	@Override
	public List<UniversityDO> list(Map<String, Object> map){
		return universityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return universityDao.count(map);
	}
	
	@Override
	public int save(UniversityDO university){
		return universityDao.save(university);
	}
	
	@Override
	public int update(UniversityDO university){
		return universityDao.update(university);
	}
	
	@Override
	public int remove(Integer id){
		return universityDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return universityDao.batchRemove(ids);
	}
	
}
