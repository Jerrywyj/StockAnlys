package com.stockanlys.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stockanlys.entity.Quotation;
import com.stockanlys.service.QuotationService;

@Controller
@RequestMapping("/stock")
public class StockController
{
	@Autowired
	QuotationService quotationService;
	
	@RequestMapping(value="/data")
	@ResponseBody
	public Map data(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		List<Quotation> quotations = quotationService.selectAllByDate("20170217");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("json", quotations);
		return map;
	}
}
