package javaStudy;

import java.util.ArrayList;

public class JavaTest0001 {
	public static void main(String[] args) {
	
	ArrayList<String> arrlist = new ArrayList<String>(6);
	

	arrlist.add("월요일");
	arrlist.add("화요일");
	arrlist.add("수요일");
	arrlist.add("목요일");
	arrlist.add("금요일");
	arrlist.add("토요일");

	for (int i = 0; i < arrlist.size(); i++) {
		String str = arrlist.get(i);
		System.out.println(str);
	}
	System.out.println("=====");
	for (String s : arrlist) {
		System.out.println(s);
	} 
}
}
