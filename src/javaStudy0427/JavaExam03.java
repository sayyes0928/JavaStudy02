package javaStudy0427;

class K099809808AA{
	void method()throws Exception{
		//메소드 내 모든 문장에 던진다
	}
}

public class JavaExam03 {

	public static void main(String[] args) {
//         try {
//        	 method(); 예외를 던진 메소드를 사용할 때에는 catch하기위해 구문사
//         }catch(){
//        	  
//         }
		int i = (int) (Math.random() * 3) + 1;
		System.out.println("난수  " + i);

		if (i == 3) {
			try {
				throw new Exception(); //강제 예외 발생, 프로그램적으로 문제가 되지는 않으나 상황이 발생 할 경우
			} catch (Exception e) {
				System.out.println(e + "=>발생");
			}
		} else {
			System.out.println("올바른 숫자입니다.");
		}
		System.out.println("**End***");
	}

}
