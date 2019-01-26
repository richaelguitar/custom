package com.travel.system.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.query.Query;

import com.travel.system.common.AbstractBaseDao;
import com.travel.system.model.UserInfo;

/**
 * Home object for domain model class UserInfo.
 * @see com.travel.system.model.UserInfo
 * @author Hibernate Tools
 */
public class UserInfoDao extends AbstractBaseDao<UserInfo>{

	private static final Log log = LogFactory.getLog(UserInfoDao.class);


	@Override
	public List<UserInfo> query(Map<String, Object> params) {
		// TODO Auto-generated method stub
		List<UserInfo>  userInfos = new ArrayList<>();
		StringBuilder sb = new StringBuilder("select * from UserInfo where 1=1 ");
		if(params!=null&&params.size()>0) {
			for(String key:params.keySet()) {
				sb.append(" and ");
				Object value = params.get(key);
				sb.append(key).append("=").append(value);
			}
		}
		if(getSessionFactory()!=null) {
			Query<UserInfo> query = getSessionFactory().openSession().createQuery(sb.toString(),UserInfo.class);
			userInfos.addAll(query.list());
		}
		return userInfos;
	}
	
}
