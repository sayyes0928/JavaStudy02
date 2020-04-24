package javaStudy0424;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaExam02 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		// add(E e)  : 입력된 값을 순서대로 리스트에 넣는다 (쌓는다).
		// 이클립스는 객체 생성시 지정한 <E> 값으로 자동 지정해준다 
		list1.add(5); //첫번째
		list1.add(4); //from index ~
		list1.add(2);
		list1.add(0);
		list1.add(1); // ~to index : to 는 포함하지 않는다
		list1.add(3); //마지막
		// list1.add("test");

		// subList(from index i,to index j) : for(int x = i, x < j; x++){ 배열처리 }
		// return type 는 List<E> 구조
		ArrayList list2 = new ArrayList(list1.subList(1, 4));  // list(1) ~ list(3)의 값을 넣는다
		// 순서 : 1) 객체생성 ->생성자 호출 subList -> (list1.subList(1, 4)) 
		       // <E> : 제네릭 타입이 정해져 있지 않으면 Object로 인식
		       // 하지만, 자료를 뽑아낼 때 자료형이 명확하지 않아서 헷갈릴 수 있다.(수동으로 확인 해야함)

		System.out.println("add() , subList();");
		print(list1, list2);

		System.out.println("containsAll");
		//Collection : class 생성
		//Collection.sort(Object) = Object의 값들을 오름차순으로 정렬
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("list.containsAll(list2)" + list1.containsAll(list2));
		// containsAll(object o) : 부모에게서 확인
		//list1가 list2의 모든(All) 값을 갖고 있는지 확인
		//객체끼리의 배열이 같은치 Boolean으로 return
		// list1가 list2의 배열에 모두 같은 값이 들어있는지 비교 후 true 또는 false로 return

		System.out.println("add(element)");
		//add() : 리스트에 마지막에 값을 넣는다
		//초기 생성시 자료타입 설정 안하면 Object로 설정
		list2.add("B");
		list2.add("C");
		//add(index a, element) : 지정한 index에 값을 넣고, 넣으려는 값으로 변경한다
		list2.add(3, "KK");
		print(list1, list2);
		System.out.println("set(index, e)");
		//set(index a, e) : index 순번에 들어있는 값을  e로 변환한다
		list2.set(3, "AA");
		print(list1, list2);

		System.out.println("retainAll()  Before");
		//retain(e) :  e값과 중복되는 값만 남기고 소거
		System.out.println("list.containsAll(list2)" + list1.retainAll(list2));
		//***** 괄호 안쪽을 먼저 실행 후 System.out.println(); 실행한다.******
		System.out.println("retainAll()  After");
		print(list1, list2);

		// list1.size();
		
		System.out.println("get(), remove();");
		// size() : 사용하고 있는 리스트의 크기
		// new ArrayList<Integer>(10) : 10의 capacity 를 갖고 있다. '용량'
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i)))
				//get(i) : i번째의 값을 가져온다
				//contains(e) : e에 들어있는 중복값만 남기고 지운다 
				list2.remove(i);
			    //remove(i) : i 값을 제거
		}
		print(list1, list2);
		
	}

	static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();

	}

}
