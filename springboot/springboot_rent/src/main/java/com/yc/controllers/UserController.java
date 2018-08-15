package com.yc.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.JsonModel;
import com.yc.bean.User;
import com.yc.dao.UserDao;

//@Controller

@RestController			//controller的升级版		restful风格	1.返回的都是接送数据，	2.http的请求方法除了get post之外还有put delete......
public class UserController {
	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping(value="login")
	@ResponseBody
	public JsonModel login(JsonModel json,User user){
		System.out.println("login进来了");
		System.out.println(user);
		try {
			User loginUser=userDao.login(user);
			if(loginUser!=null){
				json.setCode(1);
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("loginUser", loginUser);
				json.setObj(map);
			}else {
				json.setCode(0);
			}
		} catch (Exception e) {
			json.setCode(0);
			json.setMsg(e.getMessage());
			e.printStackTrace();
		}
		return json;
	}
	
	@RequestMapping(value="reg")
	@ResponseBody
//	怎么用form表单提交数据注入对象？
	public JsonModel reg(JsonModel json,User user,HttpServletRequest http){
		String uname=user.getU_name();
		String upassword=user.getU_password();
		if(uname!=null&&uname!=""){
			if(upassword!=null&&upassword!=""){
				try {
					userDao.reg(user);
					json.setCode(1);
				} catch (Exception e) {
					json.setCode(0);
					json.setMsg(e.getMessage());
					e.printStackTrace();
				}
			}else {
				json.setCode(0);
				json.setMsg("密码不能为空。。");
			}
		}else {
			json.setCode(0);
			json.setMsg("用户名不能为空。。");
		}
		return json;
	}
	
	
}
