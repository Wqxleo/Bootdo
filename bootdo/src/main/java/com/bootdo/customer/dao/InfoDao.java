package com.bootdo.customer.dao;

import com.bootdo.customer.domain.InfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-09 19:42:07
 */
@Mapper
public interface InfoDao {

	InfoDO get(Integer customerId);
	
	List<InfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InfoDO info);
	
	int update(InfoDO info);
	
	int remove(Integer customer_id);
	
	int batchRemove(Integer[] customerIds);
}
