package javaStudy;

import java.util.ArrayList;

public class JavaTest0001 {
	public static void main(String[] args) {
	
	ArrayList<String> arrlist = new ArrayList<String>(6);
	

	arrlist.add("������");
	arrlist.add("ȭ����");
	arrlist.add("������");
	arrlist.add("�����");
	arrlist.add("�ݿ���");
	arrlist.add("�����");

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
