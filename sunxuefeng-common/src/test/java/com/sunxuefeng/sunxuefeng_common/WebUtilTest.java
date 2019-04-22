package com.sunxuefeng.sunxuefeng_common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.sunxuefeng.common.utils.CollectionUtil;
import com.sunxuefeng.common.utils.WebUtil;

public class WebUtilTest extends HttpServlet {
	@Test
	@Override
	public  void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println(111);

	}

}
