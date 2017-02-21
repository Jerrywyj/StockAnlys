package com.stockanlys.dao;

import org.apache.ibatis.annotations.Param;

import com.stockanlys.entity.UserInfo;

public interface UserInfoMapper {
	
    UserInfo selectByUserName(String userName);
    void updateTokenByUserName(@Param("userName")String userName, @Param("token")String token);
}