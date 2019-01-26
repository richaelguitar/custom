package com.travel.system.model;
// Generated 2019-1-25 21:47:24 by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * Privilege generated by hbm2java
 */
public class Privilege implements java.io.Serializable {

	private Integer privilegeId;
	private String privilegeMaster;
	private Integer privilegeValue;
	private String privilegeAccess;
	private String privilegeAccessValue;
	private Integer privilegeOperation;
	private Integer createUserId;
	private Date createDate;
	private Integer modifyUserId;
	private Date modifyDate;

	public Privilege() {
	}

	public Privilege(String privilegeMaster, Integer privilegeValue, String privilegeAccess,
			String privilegeAccessValue, Integer privilegeOperation, Integer createUserId, Date createDate,
			Integer modifyUserId, Date modifyDate) {
		this.privilegeMaster = privilegeMaster;
		this.privilegeValue = privilegeValue;
		this.privilegeAccess = privilegeAccess;
		this.privilegeAccessValue = privilegeAccessValue;
		this.privilegeOperation = privilegeOperation;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.modifyUserId = modifyUserId;
		this.modifyDate = modifyDate;
	}

	public Integer getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeMaster() {
		return this.privilegeMaster;
	}

	public void setPrivilegeMaster(String privilegeMaster) {
		this.privilegeMaster = privilegeMaster;
	}

	public Integer getPrivilegeValue() {
		return this.privilegeValue;
	}

	public void setPrivilegeValue(Integer privilegeValue) {
		this.privilegeValue = privilegeValue;
	}

	public String getPrivilegeAccess() {
		return this.privilegeAccess;
	}

	public void setPrivilegeAccess(String privilegeAccess) {
		this.privilegeAccess = privilegeAccess;
	}

	public String getPrivilegeAccessValue() {
		return this.privilegeAccessValue;
	}

	public void setPrivilegeAccessValue(String privilegeAccessValue) {
		this.privilegeAccessValue = privilegeAccessValue;
	}

	public Integer getPrivilegeOperation() {
		return this.privilegeOperation;
	}

	public void setPrivilegeOperation(Integer privilegeOperation) {
		this.privilegeOperation = privilegeOperation;
	}

	public Integer getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getModifyUserId() {
		return this.modifyUserId;
	}

	public void setModifyUserId(Integer modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
