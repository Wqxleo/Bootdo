package com.bootdo.university.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:58:00
 */
public class UniversityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String universityName;
	//
	private String universityAddress;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	/**
	 * 获取：
	 */
	public String getUniversityName() {
		return universityName;
	}
	/**
	 * 设置：
	 */
	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}
	/**
	 * 获取：
	 */
	public String getUniversityAddress() {
		return universityAddress;
	}
}
