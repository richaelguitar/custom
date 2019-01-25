package com.travel.system.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.travel.system.dao.UserInfoDao;
import com.travel.system.model.UserInfo;
/**
 * 用户action
 * @author xiaowenwu
 *
 */
public class UserInfoAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserInfoDao userInfoDao;
	
	private UserInfo userInfo;
	
	



	public UserInfo getUserInfo() {
		return userInfo;
	}



	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}



	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}



	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(userInfoDao!=null) {
			userInfoDao.persist(userInfo);
		}
		ActionContext context = ActionContext.getContext();
		context.put("message", String.format("用户：%s，新增成功", userInfo.getUserName()));
		return SUCCESS;
	}

}
