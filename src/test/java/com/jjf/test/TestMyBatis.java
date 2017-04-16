package com.jjf.test;


import java.util.List;

import javax.annotation.Resource;  
  
import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;
import com.jjf.pojo.Company;
import com.jjf.pojo.User;
import com.jjf.service.ICompanyService;
import com.jjf.service.IUserService;  
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
    @Autowired  
    private IUserService userService ;  
    
    @Autowired  
    private ICompanyService companyService;  

  
    @Test  
    public void test1() {  

//        userService.insertUser(user);  
        
        List<User> users = userService.getAllUsers();
        System.out.println(JSON.toJSONString(users));
        
        List<Company> companies = companyService.getAllCompanies();
        System.out.println(JSON.toJSONString(companies));
        
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
    }  
}  
