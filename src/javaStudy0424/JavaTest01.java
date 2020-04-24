package javaStudy0424;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// **************** 클래스를 상속받고, 그 클래스에 객체를 생성해 활용 **********************

class A0AA extends ArrayList<Integer> {
	int e;
	public A0AA(int e) {
		super(e); // 부모 클래스 호출, 공간이 부족하면 알아서 늘어난다.
	}
// *** contains *** 같은 값이 존재하는지 확인하는 메소드
	void method(int e) {
		int count = 0; // 카운트를 사용해 while 반복문을 끝낼 플래그를 설정한다.
		while (count < e) { // 반복문 탈출 기준
			Integer ran = (int) (Math.random() * 45) + 1; // 난수 생성
			if (!contains(ran)) { // list.contains(ran) : 에 포함된 값이 없을때 라는 의미
				add(count, ran);
				count++; // 플래그
			}
		}
	}
}

public class JavaTest01 {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("리스트 크기를 정해주세요");
		int in = sc.nextInt();
		
		System.out.println("1번 리스트 출력");
		A0AA list1 = new A0AA(in); // 객체생성, 생성자 호출, 상속받은 클래스를 객체화
									// ArrayList 를 상속받은 A0AA 클래스에 list1 객체 생성
		                            // 객체생성은 앞의 class 에 Object명을 갖고, 해당 class 의 생성자를 호출하는 class와 같은 구조,
		                            // 형태의 요소를 갖는 틀을 만드는 것
		list1.method(in);
		for (int j = 0; j < list1.size(); j++) {
			Collections.sort(list1);
			System.out.println(list1.get(j));
		}
		System.out.println("==========");
		System.out.println("2번 리스트 출력");

		A0AA list2 = new A0AA(in); // 객체생성, 생성자 호출
		// ArrayList 를 상속받은 A0AA 클래스에 list1 객체 생성
		list2.method(in);
		for (int j = 0; j < list1.size(); j++) {
			Collections.sort(list2);
			System.out.println(list2.get(j));
		}

	}
}
