package javaStudy0424;

import java.util.HashMap;
import java.util.Set;

 class HashMapExam extends HashMap<String, Integer>{

	public HashMapExam() {
		// ������ ù�ٿ� �θ��� �����ڰ� �Ҹ��� 
		// super(); �����Ǿ��ִ�.
		super.put("a", 10);  //ArrayList �� add�� ���� ���
		super.put("b", 20);  // super ���� ����, �θ𿡰� �����޾ұ� ������
		super.put("c", 30);
		
		System.out.println("size = "+ super.size());
		
		Set<String> s = super.keySet(); //��ȯ���� Set<E> �����̱� ������ ����
		for(String str : s) { //���� ���� �ڿ���ġ �� s �ǰ��� ������ �Ѿ�� �� �ֵ��� ��ġ
			                  // s �� ������ŭ �˾Ƽ� ����.
			int i = super.get(str); // key ���� �־��ָ� value�� ��ȯ���ش� 
			                       // HashMap ��  get()�� key ���� ���� ��ȯ , ArrayList�� �ٸ�
			                       // n ��°��� �ϴ� ������ ����.
			System.out.println("key = "+str+" value = "+i);
		}
	}
}

public class JavaExam03 {

	public static void main(String[] args) {

		new HashMapExam();
	}

}
