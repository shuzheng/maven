package com.app.service;

import java.util.List;
import java.util.Map;

public interface IBaseService<T> {
	
	T get(int id);

	long count(String condition);
	
	List<T> getAll(Map<String,Object> parameters);
	
	void insert(T t);
	
	void insertAutoKey(T t);
	
	void delete(int id);
	
	void update(T t);
	
}
