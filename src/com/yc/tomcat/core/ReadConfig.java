package com.yc.tomcat.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件的类
 * @author Dell
 *
 */
public class ReadConfig extends Properties{
	/**
	 * 
	 */
	private static final long serialVersionUID = -496663076628887083L;
	private static ReadConfig instance = new ReadConfig();
	
	private ReadConfig() {
		try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("web.properties")){
			load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ReadConfig getInstance() {
		return instance;
	}

}
