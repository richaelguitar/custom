package com.travel.system.action;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.travel.system.dao.SysMenuDao;
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
	
	private UserInfo userInfo = new UserInfo();
	
	private static final Log log = LogFactory.getLog(UserInfoAction.class);



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
		userInfo.setLoginName("test");
		userInfo.setLoginPwd("123456");
		userInfo.setUserName("张三");
		userInfo.setBirthDate(new Date());
		userInfo.setCardNo("123456789123456789");
		userInfo.setEmail("123456@gmail.com");
		userInfo.setTellPhone("12345678910");
		userInfo.setCreateDate(new Date());
		userInfo.setCreateUserId(10010);
		userInfo.setDeptId(100);
		userInfo.setModifyDate(new Date());
		userInfo.setModifyUserId(10086);
		if(userInfoDao!=null) {
			long[] ids = userInfoDao.save(userInfo);
			log.debug("新增成功！ids.length="+ids.length);
		}
		ActionContext context = ActionContext.getContext();
		context.put("message", String.format("用户：%s，新增成功", userInfo.getUserName()));
		return SUCCESS;
	}

}
