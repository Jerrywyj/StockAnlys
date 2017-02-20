package com.stockanlys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockanlys.dao.QuotationMapper;
import com.stockanlys.entity.Quotation;

@Service()
@Transactional  //此处不再进行创建SqlSession和提交事务，都交由spring去管理。
public class QuotationServiceImpl implements QuotationService
{
	@Autowired
	QuotationMapper quotationMapper;
	
	@Override
	public List<Quotation> selectAllByDate(String quotationDate)
	{
		quotationDate = "quotation" + quotationDate;
		List<Quotation> quotations = quotationMapper.selectAllByDate(quotationDate);
		return quotations;
	}

	@Override
	public List<Quotation> selectIndexdecByDate(String quotationDate)
	{
		quotationDate = "quotation" + quotationDate;
		List<Quotation> quotations = quotationMapper.selectIndexdecByDate(quotationDate);
		return quotations;
	}

	@Override
	public List<Quotation> selectIndexadvByDate(String quotationDate)
	{
		quotationDate = "quotation" + quotationDate;
		List<Quotation> quotations = quotationMapper.selectIndexadvByDate(quotationDate);
		return quotations;
	}

	@Override
	public List<Quotation> selectIndexsuspByDate(String quotationDate)
	{
		quotationDate = "quotation" + quotationDate;
		List<Quotation> quotations = quotationMapper.selectIndexsuspByDate(quotationDate);
		return quotations;
	}

}
