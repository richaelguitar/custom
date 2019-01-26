package com.travel.system.common;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author richaelguitar
 * @see 数据库操作基类
 */
public interface BaseDao<T> {

	/**
	 * 保存数据
	 * @param entity
	 * @return
	 */
	long save(T entity);
	/**
	 * 批量保存，同一个事务提交
	 * @param entity
	 * @return
	 */
	long[] saveAllInTx(T ...entity);
	/**
	 * 如果记录不存在则插入，否则根据id进行更新
	 * @param entity
	 * @return
	 */
	long saveOrUpdate(T entity);
	
	
	/**
	 * 如果记录不存在则插入，否则根据id进行更新
	 * 批量操作，同一个事务提交
	 * @param entity
	 * @return
	 */
	long[] saveOrUpdate(T ...entity);
	
	/**
	 * 根据Id查询
	 * @param id
	 * @return
	 */
	T queryById(T entity,int id);
	
	/**
	 * 分页查询数据
	 * @param pageIndex 当前页
	 * @param pageSize 每页显示几条数据
	 * @return
	 */
	List<T> list(T entity,int pageIndex,int pageSize);
	
	/**
	 * 根据条件筛选数据
	 * @param params
	 * @return
	 */
	List<T> query(Map<String,Object> params);

	/**
	 * 删除数据
	 * @param id
	 */
	void delete(T ...entity);
	
}
