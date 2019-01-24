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
	long[] save(T ...entity);
	/**
	 * 如果记录不存在则插入，否则根据id进行更新
	 * @param entity
	 * @return
	 */
	long[] saveOrUpdate(T ...entity);
	
	/**
	 * 根据Id查询
	 * @param id
	 * @return
	 */
	T queryById(int id);
	
	/**
	 * 分页查询数据
	 * @param pageIndex 当前页
	 * @param pageSize 每页显示几条数据
	 * @return
	 */
	List<T> list(int pageIndex,int pageSize);
	
	/**
	 * 根据条件筛选数据
	 * @param params
	 * @return
	 */
	List<T> query(Map<String,Object> params);

	/**
	 * 根据id删除数据
	 * @param id
	 */
	void delete(int ...id);
	
}
