package com.jjf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjf.dao.ICompanyDao;
import com.jjf.pojo.Company;
import com.jjf.service.ICompanyService;

@Service("companyService")
public class CompanyServiceImpl implements ICompanyService{
	@Autowired
	private ICompanyDao companyDao;

	@Override
	public List<Company> getAllCompanies() {
		return this.companyDao.selectAll();
	}
}
