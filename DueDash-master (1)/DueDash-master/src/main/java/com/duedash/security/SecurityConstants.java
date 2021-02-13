package com.duedash.security;

import com.duedash.SpringApplicationContext;

public class SecurityConstants {
	public static final long EXPIRATION_TIME=86400000;
	public static final String TOKEN_PREFIX="Bearer";
	public static final String HEADER_STRING="Authourization";
	public static final String SIGN_UP_URL="/users";
	public  static final String LOGIN_URL="/users/login";
	
	public static String getTokenSecret() {
		AppProperties appProperties=(AppProperties)SpringApplicationContext.getBean("AppProperties");
		return appProperties.getTokenSecret();
	}

}
