package com.sunxuefeng.common.utils;

public class StringUtil {
	// 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String src) {
		// 实现代码
		// 判断是否为空如果为空直接返回false
		if (src == null) {
			return false;
		}
		// 和空串作比较
		if ("".equals(src) || src.length() == 0) {
			return false;
		}
		return true;
	}

	// 方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public boolean hasText(String src) {
		// 实现代码
		// 判断是否为空如果为空直接返回false
		if (src == null) {
			return false;
		}
		// 去掉空格和空串作比较
		if ("".equals(src.trim())) {
			return false;
		}
		return true;
	}

	// 方法3：判断是否为手机号码 (5分)
	public boolean isMobile(String src) {
		// 实现代码
		// 利用正则判断手机号
		String reg = "^1[3578]\\d{9}$";
		if (src.matches(reg)) {
			return true;
		}
		return false;
	}

	// 方法4：判断是否为邮箱 (5分)
	public boolean isEmail(String src) {
		// 实现代码
		// 利用正则判断邮箱
		String reg = "^\\w+@\\w+(.com|.cn|.com.cn)$";
		if (src.matches(reg)) {
			return true;
		}
		return false;
	}

	// 方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public String reverse(String src) {
		// 实现代码
		char[] arr = src.toCharArray();
		char[] newarr = new char[src.length()];
		int j = arr.length - 1;
		// 倒叙赋值
		for (int i = 0; i < arr.length; i++) {
			if (j >= 0) {
				newarr[j--] = arr[i];
			}
		}
		// 拼接字符串
		String string = "";
		for (char c : newarr) {
			string += c;
		}
		return string;
	}

}
