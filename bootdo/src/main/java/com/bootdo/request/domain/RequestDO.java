package com.bootdo.request.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:56:54
 */
public class RequestDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//需求编号
	private Integer requestId;
	//发布者编号
	private Integer publisherId;
	//所属学校编号
	private Integer universityId;
	//需求描述
	private String description;
	//发布者联系方式
	private String publishContact;

	/**
	 * 设置：需求编号
	 */
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	/**
	 * 获取：需求编号
	 */
	public Integer getRequestId() {
		return requestId;
	}
	/**
	 * 设置：发布者编号
	 */
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	/**
	 * 获取：发布者编号
	 */
	public Integer getPublisherId() {
		return publisherId;
	}
	/**
	 * 设置：所属学校编号
	 */
	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}
	/**
	 * 获取：所属学校编号
	 */
	public Integer getUniversityId() {
		return universityId;
	}
	/**
	 * 设置：需求描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：需求描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：发布者联系方式
	 */
	public void setPublishContact(String publishContact) {
		this.publishContact = publishContact;
	}
	/**
	 * 获取：发布者联系方式
	 */
	public String getPublishContact() {
		return publishContact;
	}
}
