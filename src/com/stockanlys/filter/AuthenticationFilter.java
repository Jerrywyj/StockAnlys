package com.stockanlys.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter
{
	private FilterConfig config;
	@Override
	public void destroy()
	{

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		String noFilterPaths = config.getInitParameter("noFilterPaths");
		HttpSession session = request.getSession();
		arg2.doFilter(arg0, arg1);

//		if (noFilterPaths != null)
//		{
//			String[] strArray = noFilterPaths.split(";");
//			for (String str : strArray)
//			{
//				System.out.println("白名单有："+str);
//			}
//			for (String str : strArray)
//			{
//				if (str == null || "".equals(str))continue;
//				if (request.getRequestURI().indexOf(str) != -1 )
//				{
//					System.out.println("noFilterPaths");
//					arg2.doFilter(arg0, arg1);
//					return;
//				}
//			}
//		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{
		config = arg0;	
	}

}
