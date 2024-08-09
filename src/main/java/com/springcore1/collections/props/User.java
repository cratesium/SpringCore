package com.springcore1.collections.props;

import java.util.Properties;

public class User {
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public User(Properties properties) {
		super();
		this.properties = properties;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
