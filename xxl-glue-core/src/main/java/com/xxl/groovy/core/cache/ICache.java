package com.xxl.groovy.core.cache;

/**
 * chche interface
 * @author xuxueli 2016-1-8 15:57:27
 */
public interface ICache {
	
	public boolean set(String key, Object value);
	
	public Object get(String key);
	
	public boolean remove(String key);
	
}