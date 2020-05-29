package com.yedam.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void getMap(Map<Integer, String> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			if (num >= 80) {
				String val = map.get(num);
				System.out.println(val);
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> scores = new HashMap<>();
		scores.put(90, "Bong");
		scores.put(9, "Hwang");
		scores.put(80, "Park");
		System.out.println("80점 이상인학생");
		getMap(scores);
		System.out.println("===============");

		List<String> list = new ArrayList<>();
		list.add("Hong");
		list.get(0);
		Set<String> set = new HashSet<String>();
		set.add("Hong");
		set.add("Hwang");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str.toString());
		}

		Map<String, Integer> map = new HashMap<>();
		// key:velue -> Map.Entry
		map.put("Hong", 98);
		map.put("Hwang", 91);
		map.put("Hong", 21); // key값은 중복될수없음
		// key, value
		Set<String> keySet = map.keySet();
		keySet.iterator();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println("key: " + key + ", value" + value);

		}
		System.out.println();
		System.out.println();

		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hasNext()) {
			Entry<String, Integer> entry = entIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key: " + key + ", value" + value);
		}
	}
}
