package com.bootdo.student.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-12-17 15:57:25
 */
public class InUniversityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//学生系统编号
	private Integer id;
	//姓名
	private String name;
	//所属大学id
	private Integer universityId;
	//学号
	private Integer studentId;
	//
	private Integer isRegister;

	/**
	 * 设置：学生系统编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：学生系统编号
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：所属大学id
	 */
	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}
	/**
	 * 获取：所属大学id
	 */
	public Integer getUniversityId() {
		return universityId;
	}
	/**
	 * 设置：学号
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	/**
	 * 获取：学号
	 */
	public Integer getStudentId() {
		return studentId;
	}
	/**
	 * 设置：
	 */
	public void setIsRegister(Integer isRegister) {
		this.isRegister = isRegister;
	}
	/**
	 * 获取：
	 */
	public Integer getIsRegister() {
		return isRegister;
	}
}
