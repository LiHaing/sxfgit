package com.yuki.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuki.service.UserService;
import com.yuki.util.Page;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("list.do")
	public String listMyUser(Map map,String likeName,String pageNow){
		//获得总记录数
		int totalData = service.getTotalData(likeName);
		//利用分页
		Page page = Page.getInstance(pageNow, totalData);
		
		//获取列表
		List list = service.listMyUsers(likeName,page.getLimit1(),page.getPageSize());
		map.put("list",list);
		map.put("page",page);
		return "list";
	}
	
}
