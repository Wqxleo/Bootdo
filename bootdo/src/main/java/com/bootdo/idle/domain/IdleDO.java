package com.bootdo.idle.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:51:27
 */
public class IdleDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//闲置物品编号
	private Integer idleId;
	//发布者编号
	private Integer publisherId;
	//所属学校编号
	private Integer universityId;
	//物品描述
	private String description;
	//图片路径
	private String photoPath;
	//价格
	private Double price;
	//发布者联系方式
	private String publisherContactway;

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
	 * 设置：物品描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：物品描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：图片路径
	 */
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	/**
	 * 获取：图片路径
	 */
	public String getPhotoPath() {
		return photoPath;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 设置：发布者联系方式
	 */
	public void setPublisherContactway(String publisherContactway) {
		this.publisherContactway = publisherContactway;
	}
	/**
	 * 获取：发布者联系方式
	 */
	public String getPublisherContactway() {
		return publisherContactway;
	}
}
