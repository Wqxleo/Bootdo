package com.bootdo.customer.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-09 19:42:07
 */
public class InfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//客户编号
	private Integer customerId;
	//客户类别
	private String customerClass;
	//客户名
	private String customerName;
	//联系电话
	private String customerTellphone;

	/**
	 * 设置：客户编号
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * 获取：客户编号
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * 设置：客户类别
	 */
	public void setCustomerClass(String customerClass) {
		this.customerClass = customerClass;
	}
	/**
	 * 获取：客户类别
	 */
	public String getCustomerClass() {
		return customerClass;
	}
	/**
	 * 设置：客户名
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 获取：客户名
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 设置：联系电话
	 */
	public void setCustomerTellphone(String customerTellphone) {
		this.customerTellphone = customerTellphone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getCustomerTellphone() {
		return customerTellphone;
	}
}
