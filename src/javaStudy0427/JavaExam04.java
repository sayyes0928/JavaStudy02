package javaStudy0427;

class Score {
	private int score;
// **   IO ��Ȳ�� ������������ ����ó�� �ʿ� ex) java -> txt
	public void setS(int j) throws MyEx { // �޼ҵ忡 ����ó��
		if (j < 0 || j > 100) {
			throw new MyEx(); // Exception Ŭ������ ��ӹ޾Ƽ�, ���� Ŭ������ ������ ��.
		} else { // new �ڿ� ���� ���� Exception �� ��ӹ��� Ŭ������ ����
			this.score = j;
		}
	}
}

public class JavaExam04 {

	public static void main(String[] args) {
		Score a = new Score();
		try {
			a.setS(110); // a��ü�� ����ó���� �޼ҵ� ����
		} catch (MyEx ex) {
			System.out.println("����");
		}
	}

}

class MyEx extends Exception {
	MyEx() {
		System.out.println("error");
	}
}
