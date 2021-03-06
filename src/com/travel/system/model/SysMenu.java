package com.travel.system.model;
// Generated 2019-1-25 21:47:24 by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * SysMenu generated by hbm2java
 */
public class SysMenu implements java.io.Serializable {

	private Integer menuId;
	private String menuNo;
	private String menuName;
	private String menuUrl;
	private String appCode;
	private String menuParentNo;
	private byte[] menuIcon;
	private Boolean isVisible;
	private Boolean isLeaf;
	private Integer sqeNo;
	private Integer createUserId;
	private Date createDate;
	private Integer modifyUserId;
	private Date modifyDate;

	public SysMenu() {
	}

	public SysMenu(String menuNo, String menuName, String menuUrl, String appCode, String menuParentNo, byte[] menuIcon,
			Boolean isVisible, Boolean isLeaf, Integer sqeNo, Integer createUserId, Date createDate,
			Integer modifyUserId, Date modifyDate) {
		this.menuNo = menuNo;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.appCode = appCode;
		this.menuParentNo = menuParentNo;
		this.menuIcon = menuIcon;
		this.isVisible = isVisible;
		this.isLeaf = isLeaf;
		this.sqeNo = sqeNo;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.modifyUserId = modifyUserId;
		this.modifyDate = modifyDate;
	}

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuNo() {
		return this.menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getMenuParentNo() {
		return this.menuParentNo;
	}

	public void setMenuParentNo(String menuParentNo) {
		this.menuParentNo = menuParentNo;
	}

	public byte[] getMenuIcon() {
		return this.menuIcon;
	}

	public void setMenuIcon(byte[] menuIcon) {
		this.menuIcon = menuIcon;
	}

	public Boolean getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Boolean getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Integer getSqeNo() {
		return this.sqeNo;
	}

	public void setSqeNo(Integer sqeNo) {
		this.sqeNo = sqeNo;
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
