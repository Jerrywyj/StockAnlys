package com.stockanlys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockanlys.dao.UserInfoMapper;
import com.stockanlys.entity.UserInfo;

@Service()
@Transactional  //此处不再进行创建SqlSession和提交事务，都交由spring去管理。
public class UserServiceImpl implements UserService
{
	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Override
	public boolean oauth(String userName, String token)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(String userName, String passWord)
	{
		UserInfo userInfo = userInfoMapper.selectByUserName(userName);
		if (userInfo != null && userInfo.getPassword().equals(passWord))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
