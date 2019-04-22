package com.sunxuefeng.common.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmptyListOrSet(Collection c){
		if(c.isEmpty()){
			return false;
		}else{
			if(c.contains(null)){
				return false;
			}
		}
		return true;
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmptyOfMap(Map map){
		if(map.isEmpty()){
			return false;
		}else{
			if(map.containsKey(null)){
				return false;
			}
		}
		return true;
	}

}
