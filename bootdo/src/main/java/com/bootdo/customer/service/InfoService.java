package com.bootdo.customer.service;

import com.bootdo.customer.domain.InfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-09 19:42:07
 */
public interface InfoService {
	
	InfoDO get(Integer customerId);
	
	List<InfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InfoDO info);
	
	int update(InfoDO info);
	
	int remove(Integer customerId);
	
	int batchRemove(Integer[] customerIds);
}
