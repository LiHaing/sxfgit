package com.yuki.service;

import java.util.List;

public interface UserService {

	List listMyUsers(String likeName, int limit1, int limit2);

	int getTotalData(String likeName);

}
