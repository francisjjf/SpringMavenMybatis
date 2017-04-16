package com.jjf.controller;

  
import java.io.IOException;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jjf.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jjf.pojo.User;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private IUserService userService;  
    
    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);
      

    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public Object login(HttpServletRequest request,HttpServletResponse response,
    		@RequestParam String username, @RequestParam String password) throws IOException{
    	
    	logger.debug("session Id = " + request.getSession().getId());
    	logger.debug("password = " + password);
    	logger.debug("username = " + username);
    	
//    	logger.debug("enter /user/login");
//    	
//    	logger.debug("requestbody : " + username);
//    	String sessionId = request.getSession().getId();
//    	logger.debug("session id = " + sessionId);
//
////    	String username =request.getParameter("username");  
////    	String username = user2.getUserName();
//    	int userId = 2;
//    	logger.debug("  id = " + userId + " username = " + username);
//    	User user = this.userService.getUserById(userId);  
//    	String js = JSON.toJSONString(user);
//    	logger.debug("user: " + js.toString());
//
////        response.getWriter().write(js); 
    	return "showUser";
    }


    
}  