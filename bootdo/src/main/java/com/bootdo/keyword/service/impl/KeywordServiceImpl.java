package com.bootdo.keyword.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.keyword.dao.KeywordDao;
import com.bootdo.keyword.domain.KeywordDO;
import com.bootdo.keyword.service.KeywordService;



@Service
public class KeywordServiceImpl implements KeywordService {
	@Autowired
	private KeywordDao keywordDao;
	
	@Override
	public KeywordDO get(Integer id){
		return keywordDao.get(id);
	}
	
	@Override
	public List<KeywordDO> list(Map<String, Object> map){
		return keywordDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return keywordDao.count(map);
	}
	
	@Override
	public int save(KeywordDO keyword){
		return keywordDao.save(keyword);
	}
	
	@Override
	public int update(KeywordDO keyword){
		return keywordDao.update(keyword);
	}
	
	@Override
	public int remove(Integer id){
		return keywordDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return keywordDao.batchRemove(ids);
	}
	
}
