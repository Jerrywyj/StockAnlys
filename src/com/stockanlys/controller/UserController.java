package com.stockanlys.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.stockanlys.entity.UserInfo;
import com.stockanlys.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public Map login(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");

		boolean loginResult = userService.login(userName, passWord);
		Map<String, Object> map = new HashMap<String, Object>();
		if (loginResult)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", userName);
			//TODO
			//用userService生成token并存到session里
			map.put("json", 200);
			return map;
		}
		else
		{
			map.put("json", 404);
			return map;
		}
	}
}
