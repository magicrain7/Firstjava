package com.yedam.generic;

import java.util.List;
import java.util.ArrayList;

public class GenericExample {
	public static void main(String[] args) {
//		Object[] strAry = new Object[5];
//		strAry[0] = "Hello";
//		strAry[1] = new Integer(0);
//		
//		String str = (String) strAry[0];
//		Integer num = (Integer) strAry[1];
//		Integer num1 = (Integer) strAry[0];
//		
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(new Double(2.4));
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		Double d1 = (Double) list.get(0);
		
		for (Object o : list) {
			System.out.println(o.toString());
			String result = (String) o;
		}
		
		//제네릭. (타입을 미리지정)
		List<String> strList = new ArrayList<String>();
		strList.add(new String("Hellow"));
//		strList.add(new Integer("Hellow")); (x)
		
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(10));
	}
}
