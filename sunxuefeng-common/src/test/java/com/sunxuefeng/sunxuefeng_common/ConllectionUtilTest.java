package com.sunxuefeng.sunxuefeng_common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.sunxuefeng.common.utils.CollectionUtil;

public class ConllectionUtilTest {
	@Test
	public void test_ConllectionUtil_notEmptyListOrSet() {
		CollectionUtil cu = new CollectionUtil();
		List list = new ArrayList();
		list.add(1);
		Set set = new HashSet();
		set.add(null);
		System.out.println(cu.notEmptyListOrSet(list));
		System.out.println(cu.notEmptyListOrSet(set));
	}

	@Test
	public void test_ConllectionUtil_notEmptyOfMap() {
		CollectionUtil cu = new CollectionUtil();
		Map map= new HashMap();
		map.put(null, null);
		System.out.println(cu.notEmptyOfMap(map));
	}

}
