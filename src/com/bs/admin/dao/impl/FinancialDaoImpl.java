package com.bs.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.FinancialDao;
import com.bs.admin.mapper.FinancialMapper;
import com.bs.admin.pojo.Financial;

@Repository
public class FinancialDaoImpl implements FinancialDao {
	@Autowired
	private FinancialMapper fm;

	@Override
	public List<String> getAllFinancialStatus() {
		List<Financial> statusList = fm.getAllFinancialStatus();
		List<String> status = new ArrayList<String>();
		for (Financial financial : statusList) {
			status.add(financial.getFinancialStatus());
		}
		return status;
	}

	@Override
	public List<String> getAllFinancaialTypes() {
		List<Financial> typesList = fm.getAllFinancaialTypes();
		List<String> types = new ArrayList<String>();
		for (Financial financial : typesList) {
			types.add(financial.getFinancialTypes());
		}
		return types;
	}
	
	@Override
	public List<Financial> getAllFinancial(String financialStatus, String financialTypes, String financialStart, String financialEnd, Integer start, Integer end) {
		return fm.getAllFinancial(financialStatus, financialTypes, financialStart, financialEnd, start, end);
	}

	@Override
	public Integer getFinancialTotal(String financialStatus, String financialTypes, String financialStart, String financialEnd) {
		return fm.getFinancialTotal(financialStatus, financialTypes, financialStart, financialEnd);
	}

	@Override
	public Financial getIdByFinancial(Financial financial) {
		return fm.getIdByFinancial(financial);
	}

	@Override
	public Integer insertFinancial(Financial financial) {
		return fm.insertFinancial(financial);
	}

	@Override
	public Integer delFinancial(Financial financial) {
		return fm.delFinancial(financial);
	}

	@Override
	public Integer updateFinancial(Financial financial) {
		return fm.updateFinancial(financial);
	}
	


	
}
