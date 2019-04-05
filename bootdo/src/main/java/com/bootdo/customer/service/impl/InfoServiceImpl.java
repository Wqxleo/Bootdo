package com.bootdo.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.customer.dao.InfoDao;
import com.bootdo.customer.domain.InfoDO;
import com.bootdo.customer.service.InfoService;



@Service
public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoDao infoDao;
	
	@Override
	public InfoDO get(Integer customerId){
		return infoDao.get(customerId);
	}
	
	@Override
	public List<InfoDO> list(Map<String, Object> map){
		return infoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return infoDao.count(map);
	}
	
	@Override
	public int save(InfoDO info){
		return infoDao.save(info);
	}
	
	@Override
	public int update(InfoDO info){
		return infoDao.update(info);
	}
	
	@Override
	public int remove(Integer customerId){
		return infoDao.remove(customerId);
	}
	
	@Override
	public int batchRemove(Integer[] customerIds){
		return infoDao.batchRemove(customerIds);
	}
	
}
