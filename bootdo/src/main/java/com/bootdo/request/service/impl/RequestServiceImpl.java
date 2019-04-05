package com.bootdo.request.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.request.dao.RequestDao;
import com.bootdo.request.domain.RequestDO;
import com.bootdo.request.service.RequestService;



@Service
public class RequestServiceImpl implements RequestService {
	@Autowired
	private RequestDao requestDao;
	
	@Override
	public RequestDO get(Integer requestId){
		return requestDao.get(requestId);
	}
	
	@Override
	public List<RequestDO> list(Map<String, Object> map){
		return requestDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return requestDao.count(map);
	}
	
	@Override
	public int save(RequestDO request){
		return requestDao.save(request);
	}
	
	@Override
	public int update(RequestDO request){
		return requestDao.update(request);
	}
	
	@Override
	public int remove(Integer requestId){
		return requestDao.remove(requestId);
	}
	
	@Override
	public int batchRemove(Integer[] requestIds){
		return requestDao.batchRemove(requestIds);
	}
	
}
