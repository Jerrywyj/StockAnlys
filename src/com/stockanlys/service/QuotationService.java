package com.stockanlys.service;

import java.util.List;

import com.stockanlys.entity.Quotation;

public interface QuotationService
{
	List<Quotation> selectAllByDate(String quotationDate);
	/*查询下跌家数 query Indexdec*/
	List<Quotation> selectIndexdecByDate(String quotationDate);
	/*查询上涨家数 query Indexadv*/
	List<Quotation> selectIndexadvByDate(String quotationDate);
	/*查询停牌家数 query Indexsusp*/
	List<Quotation> selectIndexsuspByDate(String quotationDate);
}
