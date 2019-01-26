package com.travel.system.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


/**
 * 公共父类
 * @author richaelguitar
 *
 */
public  class AbstractBaseDao<T> implements BaseDao<T> {
	
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public long[] save(T... entity) {
		// TODO Auto-generated method stub
		if(sessionFactory!=null) {
			sessionFactory.openSession().save(entity);
			return new long[entity.length];
		}
		return new long[0];
	}

	@Override
	public long[] saveOrUpdate(T... entity) {
		// TODO Auto-generated method stub
		if(sessionFactory!=null) {
			sessionFactory.openSession().save(entity);
			return new long[entity.length];
		}
		return new long[0];
	}

	@Override
	public T queryById(T entity,int id) {
		// TODO Auto-generated method stub
		T t = null;
		if(sessionFactory!=null) {
			t = (T)sessionFactory.openSession().find(entity.getClass(),id);
		}
		return t;
	}

	@Override
	public List<T> list(T entity,int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List<T>  roleInfos = new ArrayList<>();
		StringBuilder sb = new StringBuilder("select * from "+entity.getClass().getSimpleName()+" where 1=1 ");
		if(pageIndex>=0&&pageSize>0) {
			sb.append("limit")
			.append(pageIndex)
			.append(",")
			.append(pageSize);
		}
		if(sessionFactory!=null) {
			Query<T> query = (Query<T>) sessionFactory.openSession().createQuery(sb.toString(),entity.getClass());
			roleInfos.addAll(query.list());
		}
		return roleInfos;
	}

	@Override
	public  List<T> query(Map<String, Object> params){return null;};

	@Override
	public void delete(T ...entity) {
		// TODO Auto-generated method stub
		if(sessionFactory!=null) {
			sessionFactory.openSession().delete(entity);
		}
		
	}
}
