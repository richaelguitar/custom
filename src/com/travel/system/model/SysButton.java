package com.travel.system.model;
// Generated 2019-1-25 21:47:24 by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * SysButton generated by hbm2java
 */
public class SysButton implements java.io.Serializable {

	private Integer btnId;
	private String btnName;
	private String btnNo;
	private String btnClass;
	private byte[] btnIcon;
	private String btnScript;
	private String menuNo;
	private Boolean initStatus;
	private Integer seqNo;
	private Integer createUserId;
	private Date createDate;
	private Integer modifyUserId;
	private Date modifyDate;

	public SysButton() {
	}

	public SysButton(String btnName, String btnNo, String btnClass, byte[] btnIcon, String btnScript, String menuNo,
			Boolean initStatus, Integer seqNo, Integer createUserId, Date createDate, Integer modifyUserId,
			Date modifyDate) {
		this.btnName = btnName;
		this.btnNo = btnNo;
		this.btnClass = btnClass;
		this.btnIcon = btnIcon;
		this.btnScript = btnScript;
		this.menuNo = menuNo;
		this.initStatus = initStatus;
		this.seqNo = seqNo;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.modifyUserId = modifyUserId;
		this.modifyDate = modifyDate;
	}

	public Integer getBtnId() {
		return this.btnId;
	}

	public void setBtnId(Integer btnId) {
		this.btnId = btnId;
	}

	public String getBtnName() {
		return this.btnName;
	}

	public void setBtnName(String btnName) {
		this.btnName = btnName;
	}

	public String getBtnNo() {
		return this.btnNo;
	}

	public void setBtnNo(String btnNo) {
		this.btnNo = btnNo;
	}

	public String getBtnClass() {
		return this.btnClass;
	}

	public void setBtnClass(String btnClass) {
		this.btnClass = btnClass;
	}

	public byte[] getBtnIcon() {
		return this.btnIcon;
	}

	public void setBtnIcon(byte[] btnIcon) {
		this.btnIcon = btnIcon;
	}

	public String getBtnScript() {
		return this.btnScript;
	}

	public void setBtnScript(String btnScript) {
		this.btnScript = btnScript;
	}

	public String getMenuNo() {
		return this.menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public Boolean getInitStatus() {
		return this.initStatus;
	}

	public void setInitStatus(Boolean initStatus) {
		this.initStatus = initStatus;
	}

	public Integer getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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
