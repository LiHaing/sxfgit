package com.yuki.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	List listMyUsers(@Param("likeName")String likeName, @Param("limit1")int limit1, @Param("limit2")int limit2);

	int getTotalData(@Param("likeName")String likeName);
	
}
