package com.stockanlys.servicetest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stockanlys.dao.QuotationMapper;
import com.stockanlys.dao.UserInfoMapper;
import com.stockanlys.entity.Quotation;
import com.stockanlys.entity.UserInfo;
import com.stockanlys.service.QuotationService;
import com.stockanlys.service.QuotationServiceImpl;
import com.stockanlys.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=
		{
		"classpath:test-mybatis-config.xml",
		"classpath:test-spring-common.xml",
		"classpath:test-spring-servlet.xml"
		})
public class TestUserInfoMapper
{
	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Autowired
	QuotationMapper quotationMapper;
	
	@Autowired
	UserService userService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testUserInfoMapper()
	{
		UserInfo userInfo = userInfoMapper.selectByUserName("123456@example.com");
		System.out.println(userInfo);
	}
	
	@Test
	public void testQuotationMapper()
	{
		List<Quotation> quotations = quotationMapper.selectAllByDate("quotation20170217");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("json", quotations);
		System.out.println(map);
	}
	
	@Test
	public void testUserService()
	{
		String userName = "123456@example.com";
		String passWord = "demo123456";
		boolean loginResult = userService.login(userName, passWord);
		Assert.assertEquals(true, loginResult);
	}
}
