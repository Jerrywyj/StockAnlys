package com.stockanlys.dao;

import com.stockanlys.entity.UserInfo;

public interface UserInfoMapper {
	
    UserInfo selectByUserName(String userName);
}