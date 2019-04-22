package com.sunxuefeng.sunxuefeng_common;

import org.junit.Test;

import com.sunxuefeng.common.utils.StringUtil;

public class StringUtilTest {
	@Test
    public void test_StringUtil_hasLength( ){
		 String src  ="1";
		 StringUtil su = new StringUtil();
		 boolean hasLength = su.hasLength(src);
		 System.out.println(hasLength);
		 
    }
	@Test
	public void test_StringUtil_hasText( ){
		String src  ="   ";
		StringUtil su = new StringUtil();
		boolean flag = su.hasText(src);
		System.out.println(flag);
		
	}
	@Test
	public void test_StringUtil_isMobile( ){
		String src  ="18345675411";
		StringUtil su = new StringUtil();
		boolean flag = su.isMobile(src);
		System.out.println(flag);
	}
	@Test
	public void test_StringUtil_isEmail( ){
		String src  ="1822234475@qq.com";
		StringUtil su = new StringUtil();
		boolean flag = su.isEmail(src);
		System.out.println(flag);
		
	}
	@Test
	public void test_StringUtil_reverse( ){
		String src  ="1822234475@qq.com";
		StringUtil su = new StringUtil();
		String flag = su.reverse(src);
		System.out.println(flag);
		
	}
}
