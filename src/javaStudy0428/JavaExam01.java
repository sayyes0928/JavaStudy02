package javaStudy0428;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExam01 {

	public static void main(String[] args) throws IOException {
		FileInputStream f = null;
//	FileOutputStream f = null; //IO 는 반드시 try,catch 를 써야한다.
//		try {
//		//	**OutPut***
//			f =new FileOutputStream("d:javaex01.txt",true); // ("file dir", true) -> 이어쓰기
//			                                                // flie이 없을 경우, 생성
//			f.write(97); //계산이 가능한 숫자 이외에는 모두 글자로 인식한다.아스키코드
//			
//			
//			String data = "오늘은 화요일";
//			String data1 = "오늘은 수요일";
//			String data2 = "오늘은 목요일";
//			byte b[] = data.getBytes(); //byte 단위로 쪼개어 객체에 담아 저장한다.
//			f.write(b);
//			
//			byte b1[] = data1.getBytes(); //byte 단위로 쪼개어 객체에 담아 저장한다.
//			f.write(b1);
//			byte b2[] = data2.getBytes(); //byte 단위로 쪼개어 객체에 담아 저장한다.
//			f.write(b2);
//	//		
//	//		**InPut**
//		try {
//			f = new FileInputStream("d:javaex02.txt");
//			System.out.println("available = " + f.available()); // 읽어 올 수 있는 byte 수
//	//		byte b3[] = f.// 일어올 수 있는 만큼의 byte
//
//			while (f.read(b3) != -1) {
//			} // file의 끝을 ' -1 '로 처리한다. -1이 file 끝에 반환되기 떄문
//				// read b를 읽어 온다.
//
//			String data4 = new String(b3); // b를 정상적인 Data로 만들어줘라
//			System.out.println(data4);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // Input은 In을 해서 가져올 결과가 없기때문에 오류를 띄운다
//
////			
////	// IO의 구조는 같다. try,catch
//			
//	
	}
}
