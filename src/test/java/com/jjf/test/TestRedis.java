//package com.jjf.test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.jjf.service.IUserService;  
//
//
//@RunWith(SpringJUnit4ClassRunner.class)  
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})    
//public class TestRedis  
//{  
//    private static final Logger logger = LoggerFactory.getLogger(TestRedis.class);      
//  
//    @Autowired  
//    private IUserService userService ;   
//    /*  
//     * 二级缓存测试  
//     */  
//    @Test  
//    public void testCache2() {  
////        PageInfo<Site> page1 = service.querySite("", 1, 2, "", "");  
////        logger.info(page1.getList().get(1).getName());  
////  
////        PageInfo<Site> page2 = service.querySite("", 2, 2, "", "");  
////        logger.info(page2.getList().get(0).getName());  
////  
////        PageInfo<Site> page3 = service.querySite("", 1, 2, "", "");  
////        logger.info(page3.getList().get(0).getName());  
//    }     
//  
//}  