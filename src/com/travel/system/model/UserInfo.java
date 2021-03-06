package com.travel.system.model;
// Generated 2019-1-25 21:47:24 by Hibernate Tools 5.0.6.Final

import java.util.Date;

/**
 * UserInfo generated by hbm2java
 */
public class UserInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String loginName;
	private String loginPwd;
	private String userName;
	private Integer deptId;
	private String userNativePalce;
	private Integer userGender;
	private Date birthDate;
	private String email;
	private String tellPhone;
	private String cardNo;
	private byte[] userHeadLogo;
	private Integer userType;
	private Integer userAddressId;
	private String remark;
	private Integer createUserId;
	private Date createDate;
	private Integer modifyUserId;
	private Date modifyDate;

	public UserInfo() {
	}

	public UserInfo(String loginName, String loginPwd, String userName) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.userName = userName;
	}

	public UserInfo(String loginName, String loginPwd, String userName, Integer deptId, String userNativePalce,
			Integer userGender, Date birthDate, String email, String tellPhone, String cardNo, byte[] userHeadLogo,
			Integer userType, Integer userAddressId, String remark, Integer createUserId, Date createDate,
			Integer modifyUserId, Date modifyDate) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.userName = userName;
		this.deptId = deptId;
		this.userNativePalce = userNativePalce;
		this.userGender = userGender;
		this.birthDate = birthDate;
		this.email = email;
		this.tellPhone = tellPhone;
		this.cardNo = cardNo;
		this.userHeadLogo = userHeadLogo;
		this.userType = userType;
		this.userAddressId = userAddressId;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.modifyUserId = modifyUserId;
		this.modifyDate = modifyDate;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getUserNativePalce() {
		return this.userNativePalce;
	}

	public void setUserNativePalce(String userNativePalce) {
		this.userNativePalce = userNativePalce;
	}

	public Integer getUserGender() {
		return this.userGender;
	}

	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTellPhone() {
		return this.tellPhone;
	}

	public void setTellPhone(String tellPhone) {
		this.tellPhone = tellPhone;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public byte[] getUserHeadLogo() {
		return this.userHeadLogo;
	}

	public void setUserHeadLogo(byte[] userHeadLogo) {
		this.userHeadLogo = userHeadLogo;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getUserAddressId() {
		return this.userAddressId;
	}

	public void setUserAddressId(Integer userAddressId) {
		this.userAddressId = userAddressId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
