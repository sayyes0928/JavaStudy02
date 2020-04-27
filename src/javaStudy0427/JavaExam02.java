package javaStudy0427;

public class JavaExam02 { // 예외처리 exception

	public static void main(String[] args) {
		try { //예외가 발생 될 것 같은 코드를 묶는것, 잠재적인 문제
			  // java.lang 에 속해있다.
			  // 무조건 뒤에 catch가 나와야한다
		//	String [] s = new String[3];
		//	s[3] = "asd";
			String str =  "abc";
			System.out.println(str);
			int i = Integer.parseInt(str);
			int result = 10 / i;
//		}catch (ArrayIndexOutOfBoundsException e) {//try에서 발생된 예외를 catch에서 잡아서 처리한다.->정상적인 종료를 나타내준다
//      System.out.println(e+"=>인수를 넣어주세요");		// catch 안에 실행문장 넣지말기. 오류를 잡아주기만
//   }catch (NumberFormatException e) {
//	   System.out.println(e+"=>숫자만 입력하세요");
}catch(Exception e){ //exception의 최상위 클래스
	System.out.println(e + "=>오류입니다.");
	}finally { //예외에 상관없이 실행
		System.out.println("난 무조건 (예외가 있던없던)실행합니다");
	}
		System.out.println("프로그램 종료");
}

}
