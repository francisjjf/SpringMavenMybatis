package com.jjf.controller;

  
import java.io.IOException;
import java.util.logging.Logger;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.jjf.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jjf.pojo.User;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String showUser(HttpServletRequest request,Model model){ 
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
    
    @RequestMapping("/login")
    public String login(HttpServletRequest request,Model model){
    	System.out.println("login");
        int userId = Integer.parseInt(request.getParameter("id"));  
        System.out.println("id: " + userId);
        User user = this.userService.getUserById(userId);  
        System.out.println("user: " + user.toString());
        model.addAttribute("user", user);  
        return "showUser";  
    }
    
    @RequestMapping("/ajax")
    public void ajax(HttpServletRequest request,HttpServletResponse response){
        User user = this.userService.getUserById(2);
        System.out.println("ajax");
        String js = JSON.toJSONString(user);
        System.out.println(js);
;
    	System.out.println("1111");
    	try {
    	      response.getWriter().write(js);
    	    } catch (IOException e) {
    	      e.printStackTrace();
    	    }
    }
    
}  