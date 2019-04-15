package com.sunxuefeng.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunxuefeng.bean.Criminal;

public interface CriminalMapper {

	List<Criminal> listCriminal(@Param("likeName")String likeName,@Param("limit1") int limit1, @Param("limit2")int limit2);

	int getTotalData(@Param("likeName")String likeName);

	Criminal findById(@Param("cid")Integer cid);

	void upd(Criminal c);

	void add(Criminal c);

	void del(@Param("cid")Integer cid);

}
