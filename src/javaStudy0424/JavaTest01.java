package javaStudy0424;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// **************** Ŭ������ ��ӹް�, �� Ŭ������ ��ü�� ������ Ȱ�� **********************

class A0AA extends ArrayList<Integer> {
	int e;
	public A0AA(int e) {
		super(e); // �θ� Ŭ���� ȣ��, ������ �����ϸ� �˾Ƽ� �þ��.
	}
// *** contains *** ���� ���� �����ϴ��� Ȯ���ϴ� �޼ҵ�
	void method(int e) {
		int count = 0; // ī��Ʈ�� ����� while �ݺ����� ���� �÷��׸� �����Ѵ�.
		while (count < e) { // �ݺ��� Ż�� ����
			Integer ran = (int) (Math.random() * 45) + 1; // ���� ����
			if (!contains(ran)) { // list.contains(ran) : �� ���Ե� ���� ������ ��� �ǹ�
				add(count, ran);
				count++; // �÷���
			}
		}
	}
}

public class JavaTest01 {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("����Ʈ ũ�⸦ �����ּ���");
		int in = sc.nextInt();
		
		System.out.println("1�� ����Ʈ ���");
		A0AA list1 = new A0AA(in); // ��ü����, ������ ȣ��, ��ӹ��� Ŭ������ ��üȭ
									// ArrayList �� ��ӹ��� A0AA Ŭ������ list1 ��ü ����
		                            // ��ü������ ���� class �� Object���� ����, �ش� class �� �����ڸ� ȣ���ϴ� class�� ���� ����,
		                            // ������ ��Ҹ� ���� Ʋ�� ����� ��
		list1.method(in);
		for (int j = 0; j < list1.size(); j++) {
			Collections.sort(list1);
			System.out.println(list1.get(j));
		}
		System.out.println("==========");
		System.out.println("2�� ����Ʈ ���");

		A0AA list2 = new A0AA(in); // ��ü����, ������ ȣ��
		// ArrayList �� ��ӹ��� A0AA Ŭ������ list1 ��ü ����
		list2.method(in);
		for (int j = 0; j < list1.size(); j++) {
			Collections.sort(list2);
			System.out.println(list2.get(j));
		}

	}
}
