package com.stockanlys.service;

import com.stockanlys.entity.UserInfo;

public interface UserService
{
	boolean oauth(String userName, String token);
	boolean login(String userName, String passWord);
}
