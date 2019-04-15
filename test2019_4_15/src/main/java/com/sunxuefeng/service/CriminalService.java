package com.sunxuefeng.service;

import java.util.List;

import com.sunxuefeng.bean.Criminal;

public interface CriminalService {

	List<Criminal> listCriminal(String likeName, int limit1, int limit2);

	int getTotalData(String likeName);

	Criminal findById(Integer cid);

	boolean upd(Criminal c);

	boolean add(Criminal c);

	boolean del(Integer cid);

}
