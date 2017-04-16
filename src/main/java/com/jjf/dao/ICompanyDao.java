package com.jjf.dao;

import java.util.List;

import com.jjf.pojo.Company;

public interface ICompanyDao {
//    int deleteByPrimaryKey(Integer id);
//
//    
//    int insert(User record);
//
//    int insertSelective(User record);
//
//    User selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(User record);
//
//    int updateByPrimaryKey(User record);
    
    List<Company> selectAll();
}