package com.travel.system.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * 公共父类
 * 
 * @author richaelguitar
 *
 */
public class AbstractBaseDao<T> implements BaseDao<T> {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public long save(T entity) {
		// TODO Auto-generated method stub
		if (sessionFactory != null) {

			int id = (int) sessionFactory.openSession().save(entity);

			return id;
		}
		return 0;
	}

	@Override
	public long[] saveAllInTx(T... entity) {
		// TODO Auto-generated method stub
		long[] ids = new long[entity.length];
		if (sessionFactory != null) {
			// 开启事务
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			for (int s = 0; s < ids.length; s++) {
				ids[s] = (Integer) session.save(entity[s]);
			}
			transaction.commit();
			session.close();
		}
		return ids;
	}

	@Override
	public long saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		if (sessionFactory != null) {

			return (long) sessionFactory.openSession().save(entity);
		}
		return 0;
	}

	@Override
	public long[] saveOrUpdate(T... entity) {
		// TODO Auto-generated method stub
		long[] ids = new long[entity.length];
		if (sessionFactory != null) {
			// 开启事务
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			for (int s = 0; s < ids.length; s++) {
				session.saveOrUpdate(entity[s]);
				ids[s] = s;
			}
			transaction.commit();
			session.close();
		}
		return ids;
	}

	@Override
	public T queryById(T entity, int id) {
		// TODO Auto-generated method stub
		T t = null;
		if (sessionFactory != null) {
			t = (T) sessionFactory.openSession().find(entity.getClass(), id);
		}
		return t;
	}

	@Override
	public List<T> list(T entity, int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		List<T> roleInfos = new ArrayList<>();
		StringBuilder sb = new StringBuilder("from " + entity.getClass().getSimpleName() + " where 1=1 ");
		if (pageIndex >= 0 && pageSize > 0) {
			sb.append("limit").append(pageIndex).append(",").append(pageSize);
		}
		if (sessionFactory != null) {
			//执行hql
			Query<T> query = (Query<T>) sessionFactory.openSession().createQuery(sb.toString(), entity.getClass());
			roleInfos.addAll(query.list());
		}
		return roleInfos;
	}

	@Override
	public List<T> query(Map<String, Object> params) {
		return null;
	};

	@Override
	public void delete(T... entity) {
		// TODO Auto-generated method stub
		if (sessionFactory != null) {
			sessionFactory.openSession().delete(entity);
		}

	}
}
