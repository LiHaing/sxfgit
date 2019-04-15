package com.sunxuefeng.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunxuefeng.bean.Criminal;
import com.sunxuefeng.service.CriminalService;
import com.sunxuefeng.util.Page;

@Controller
public class CriminalController {

	@Autowired
	private CriminalService cs;

	@RequestMapping("list.do")
	public String listCriminal(Map map, String likeName, String pageNow) {
		int totalData=cs.getTotalData(likeName);
		Page page = Page.getInstance(pageNow, totalData);
		
		List<Criminal> list = cs.listCriminal(likeName,page.getLimit1(),page.getPageSize());

		map.put("list", list);
		map.put("page", page);
		return "list";
	}
	@RequestMapping("updBack.do")
	@ResponseBody
	public Object updBack(Integer cid) {
		Criminal c = cs.findById(cid);
		return c;
	}
	@RequestMapping("upd.do")
	@ResponseBody
	public Object upd(Criminal c) {
		boolean b = cs.upd(c);
		return b;
	}
	@RequestMapping("add.do")
	@ResponseBody
	public Object add(Criminal c) {
		boolean b = cs.add(c);
		return b;
	}
	@RequestMapping("del.do")
	@ResponseBody
	public Object del(Integer cid) {
		boolean b = cs.del(cid);
		return b;
	}

	
	
	
	
	
	
	
	
}
