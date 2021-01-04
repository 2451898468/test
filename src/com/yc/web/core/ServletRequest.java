package com.yc.web.core;

public interface ServletRequest {
	/**
	 * 解析请求的方法
	 */
	public void parse();
	/**
	 * 获取请求参数
	 * @param key
	 * @return
	 */
	public String getParamter(String key);
	/**
	 * 获取请求方式
	 */
	public String getMethod();
	/**
	 * 获取请求地址
	 */
	public String getUrl();
	
}
