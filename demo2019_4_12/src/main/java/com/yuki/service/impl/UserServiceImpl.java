package com.yuki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuki.mapper.UserMapper;
import com.yuki.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;

	@Override
	public List listMyUsers(String likeName, int limit1, int limit2) {
		return mapper.listMyUsers(likeName,limit1,limit2);
	}

	@Override
	public int getTotalData(String likeName) {
		return mapper.getTotalData(likeName);
	}
	
}
