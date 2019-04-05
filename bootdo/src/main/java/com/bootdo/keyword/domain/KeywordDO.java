package com.bootdo.keyword.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:17
 */
public class KeywordDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//闲置物品关键词编号
	private Integer id;
	//关键词
	private String keyword;
	//闲置物品编号
	private Integer idleId;

	/**
	 * 设置：闲置物品关键词编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：闲置物品关键词编号
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：关键词
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * 获取：关键词
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * 设置：闲置物品编号
	 */
	public void setIdleId(Integer idleId) {
		this.idleId = idleId;
	}
	/**
	 * 获取：闲置物品编号
	 */
	public Integer getIdleId() {
		return idleId;
	}
}
