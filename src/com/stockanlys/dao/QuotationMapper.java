package com.stockanlys.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stockanlys.entity.Quotation;

public interface QuotationMapper {
	
	List<Quotation> selectAllByDate(@Param("quotationDate") String quotationDate);
	/*查询下跌家数 query Indexdec*/
	List<Quotation> selectIndexdecByDate(@Param("quotationDate") String quotationDate);
	/*查询上涨家数 query Indexadv*/
	List<Quotation> selectIndexadvByDate(@Param("quotationDate") String quotationDate);
	/*查询停牌家数 query Indexsusp*/
	List<Quotation> selectIndexsuspByDate(@Param("quotationDate") String quotationDate);
}