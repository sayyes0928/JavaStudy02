package javaStudy0424;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaExam02 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		// add(E e)  : �Էµ� ���� ������� ����Ʈ�� �ִ´� (�״´�).
		// ��Ŭ������ ��ü ������ ������ <E> ������ �ڵ� �������ش� 
		list1.add(5); //ù��°
		list1.add(4); //from index ~
		list1.add(2);
		list1.add(0);
		list1.add(1); // ~to index : to �� �������� �ʴ´�
		list1.add(3); //������
		// list1.add("test");

		// subList(from index i,to index j) : for(int x = i, x < j; x++){ �迭ó�� }
		// return type �� List<E> ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));  // list(1) ~ list(3)�� ���� �ִ´�
		// ���� : 1) ��ü���� ->������ ȣ�� subList -> (list1.subList(1, 4)) 
		       // <E> : ���׸� Ÿ���� ������ ���� ������ Object�� �ν�
		       // ������, �ڷḦ �̾Ƴ� �� �ڷ����� ��Ȯ���� �ʾƼ� �򰥸� �� �ִ�.(�������� Ȯ�� �ؾ���)

		System.out.println("add() , subList();");
		print(list1, list2);

		System.out.println("containsAll");
		//Collection : class ����
		//Collection.sort(Object) = Object�� ������ ������������ ����
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("list.containsAll(list2)" + list1.containsAll(list2));
		// containsAll(object o) : �θ𿡰Լ� Ȯ��
		//list1�� list2�� ���(All) ���� ���� �ִ��� Ȯ��
		//��ü������ �迭�� ����ġ Boolean���� return
		// list1�� list2�� �迭�� ��� ���� ���� ����ִ��� �� �� true �Ǵ� false�� return

		System.out.println("add(element)");
		//add() : ����Ʈ�� �������� ���� �ִ´�
		//�ʱ� ������ �ڷ�Ÿ�� ���� ���ϸ� Object�� ����
		list2.add("B");
		list2.add("C");
		//add(index a, element) : ������ index�� ���� �ְ�, �������� ������ �����Ѵ�
		list2.add(3, "KK");
		print(list1, list2);
		System.out.println("set(index, e)");
		//set(index a, e) : index ������ ����ִ� ����  e�� ��ȯ�Ѵ�
		list2.set(3, "AA");
		print(list1, list2);

		System.out.println("retainAll()  Before");
		//retain(e) :  e���� �ߺ��Ǵ� ���� ����� �Ұ�
		System.out.println("list.containsAll(list2)" + list1.retainAll(list2));
		//***** ��ȣ ������ ���� ���� �� System.out.println(); �����Ѵ�.******
		System.out.println("retainAll()  After");
		print(list1, list2);

		// list1.size();
		
		System.out.println("get(), remove();");
		// size() : ����ϰ� �ִ� ����Ʈ�� ũ��
		// new ArrayList<Integer>(10) : 10�� capacity �� ���� �ִ�. '�뷮'
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i)))
				//get(i) : i��°�� ���� �����´�
				//contains(e) : e�� ����ִ� �ߺ����� ����� ����� 
				list2.remove(i);
			    //remove(i) : i ���� ����
		}
		print(list1, list2);
		
	}

	static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();

	}

}
