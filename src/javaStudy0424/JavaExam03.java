package javaStudy0424;

import java.util.HashMap;
import java.util.Set;

 class HashMapExam extends HashMap<String, Integer>{

	public HashMapExam() {
		// 무조건 첫줄에 부모의 생성자가 불린다 
		// super(); 생략되어있다.
		super.put("a", 10);  //ArrayList 의 add와 같은 기능
		super.put("b", 20);  // super 생략 가능, 부모에게 생략받았기 때문에
		super.put("c", 30);
		
		System.out.println("size = "+ super.size());
		
		Set<String> s = super.keySet(); //반환형이 Set<E> 구조이기 때문에 썼음
		for(String str : s) { //많은 값을 뒤에배치 후 s 의값이 앞으로 넘어올 수 있도록 배치
			                  // s 가 가진만큼 알아서 돈다.
			int i = super.get(str); // key 값을 넣어주면 value를 반환해준다 
			                       // HashMap 의  get()은 key 값을 통해 반환 , ArrayList와 다름
			                       // n 번째라고 하는 순서가 없다.
			System.out.println("key = "+str+" value = "+i);
		}
	}
}

public class JavaExam03 {

	public static void main(String[] args) {

		new HashMapExam();
	}

}
