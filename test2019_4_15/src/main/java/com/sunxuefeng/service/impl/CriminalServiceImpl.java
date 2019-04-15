package com.sunxuefeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunxuefeng.bean.Criminal;
import com.sunxuefeng.mapper.CriminalMapper;
import com.sunxuefeng.service.CriminalService;

@Service
@Transactional
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalMapper mapper;

	@Override
	public List<Criminal> listCriminal(String likeName, int limit1, int limit2) {
		return mapper.listCriminal(likeName, limit1, limit2);
	}

	@Override
	public int getTotalData(String likeName) {
		return mapper.getTotalData(likeName);
	}

	@Override
	public Criminal findById(Integer cid) {
		// TODO Auto-generated method stub
		return mapper.findById(cid);
	}

	@Override
	public boolean upd(Criminal c) {
		try {
			mapper.upd(c);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	@Override
	public boolean add(Criminal c) {
		System.out.println(c.getCname() +"----------");
		if (c.getCname() != null && !"".equals(c.getCname())) {
			try {
				mapper.add(c);
			} catch (Exception e) {
				return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean del(Integer cid) {
		try {
			mapper.del(cid);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
