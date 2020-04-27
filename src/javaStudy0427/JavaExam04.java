package javaStudy0427;

class Score {
	private int score;
// **   IO 상황시 무조건적으로 예외처리 필요 ex) java -> txt
	public void setS(int j) throws MyEx { // 메소드에 예외처리
		if (j < 0 || j > 100) {
			throw new MyEx(); // Exception 클래스를 상속받아서, 예외 클래스를 생성한 것.
		} else { // new 뒤에 오는 것은 Exception 을 상속받은 클래스만 가능
			this.score = j;
		}
	}
}

public class JavaExam04 {

	public static void main(String[] args) {
		Score a = new Score();
		try {
			a.setS(110); // a객체의 예외처리된 메소드 실행
		} catch (MyEx ex) {
			System.out.println("오류");
		}
	}

}

class MyEx extends Exception {
	MyEx() {
		System.out.println("error");
	}
}
