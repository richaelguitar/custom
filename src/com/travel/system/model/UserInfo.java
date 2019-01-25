package com.travel.system.model;
// Generated 2019-1-25 16:59:44 by Hibernate Tools 5.3.6.Final

/**
 * UserInfo generated by hbm2java
 */
public class UserInfo implements java.io.Serializable {

	private int userId;
	private String userName;

	public UserInfo() {
	}

	public UserInfo(int userId) {
		this.userId = userId;
	}

	public UserInfo(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
