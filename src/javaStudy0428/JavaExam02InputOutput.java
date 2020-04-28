package javaStudy0428;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import team1.InputData;

public class JavaExam02InputOutput {

	public static void main(String[] args) {
	//	Input input = new Input();
		
//		Scanner sc = new Scanner(System.in);
//		FileOutputStream user = null; // fileOutPut을 할 객체 생성
//		try { // IO에서는 필수로 설정
//			System.out.println("id 입력");
//			String IdTxt = sc.next();
//
//			user = new FileOutputStream("d:" + IdTxt + ".txt", true);
//
//			System.out.println("pw 입력");
//			String Pw = sc.next() + ",";
//
//			System.out.println("pw 확인 입력");
//			String PwRe = sc.next() + ",";
//
//			System.out.println("name 입력");
//			String Name = sc.next() + ",";
//
//			System.out.println("birth 입력");
//			String Birth = sc.next() + ",";
//
//			System.out.println("email 입력");
//			String Email = sc.next() + ",";
//
//			System.out.println("addr 입력");
//			String Addr = sc.next() + ",";
//
//			System.out.println("phone 입력");
//			String Phone = sc.next() + ",";
//
//			byte id[] = IdTxt.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(id); // method를 이용해서 b의 내용을 bw에 write
//			byte pw[] = Pw.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(pw); // method를 이용해서 b의 내용을 bw에 write
//			byte pwre[] = PwRe.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(pwre); // method를 이용해서 b의 내용을 bw에 write
//			byte name[] = Name.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(name); // method를 이용해서 b의 내용을 bw에 write
//			byte birth[] = Birth.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(birth); // method를 이용해서 b의 내용을 bw에 write
//			byte email[] = Email.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(email); // method를 이용해서 b의 내용을 bw에 write
//			byte addr[] = Addr.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(addr); // method를 이용해서 b의 내용을 bw에 write
//			byte phone[] = Phone.getBytes(); // byte 단위로 쪼개어 객체 b에 저장
//			user.write(phone); // method를 이용해서 b의 내용을 bw에 write
//
//			String txt = (IdTxt + Pw + PwRe + Name + Birth + Email + Addr + Phone);
//			String[] arrTxt = txt.split(",");
//
//			for (int j = 0; j < arrTxt.length; j++) {
//				System.out.println(arrTxt[j]);
//			}
//
//			if (arrTxt[0].equals("123")) {
//				System.out.println("값이 같습니다.");
//			}
//
//			// Input은 In을 해서 가져올 결과가 없기때문에 오류를 띄운다
////			
////	System.out.println("available = " + f2.available()); //읽어 올 수 있는 byte 수
////	byte b3[] = new byte[f2.available()]; //일어올 수 있는 만큼의 byte
////	
////	while(f2.read(b3) != -1) {} //file의 끝을 ' -1 '로 처리한다. -1이 file 끝에 반환되기 떄문
////	                          //read b를 읽어 온다.
////	
////	String data4 = new String(b3); //b를 정상적인 Data로 만들어줘라 
////	System.out.println(data4);
//
//			// while (!(Id = sc.nextLine()).equals("quit")) {// 종료문 입력시 종료
//			// data 변수를 sc.next()와 같다고 했기 때문에
//			// data 는 Object 가 된다.
//			// }
//		} catch (Exception e) {
//			System.out.println(e + " => 요류");
//		} finally {
//			try {
//				user.close();
//			} catch (Exception e) {
//				System.out.println(e + " + close fail");
//			}
//		}
//	}
//}

class Input {

			void print() {
				InputData inputdata = new InputData();
				try {
					FileInputStream f = new FileInputStream("d:jsi092.txt");
					System.out.println("available = " + f.available()); // 읽어 올 수 있는 byte 수
					byte b3[];
					b3 = new byte[f.available()];
					String data4 = new String(b3); // b를 정상적인 Data로 만들어줘라
					System.out.println(data4);
				} catch (Exception e) {
				}
			}
		}
	}

}

//		while (f.read(b3) != -1) {
//		} // file의 끝을 ' -1 '로 처리한다. -1이 file 끝에 반환되기 떄문
//			// read b를 읽어 온다.
//		FileOutputStream bw = null; //fileOutPut을 할 객체 생성
//		Scanner sc = new Scanner(System.in);
//		try { //IO에서는 필수로 설정
//			bw = new FileOutputStream("d:javaex01.txt");
//			String data = null;
//			System.out.println("입력 : "); //콘솔에서 실행하기 때문에 가능
//			
//			while (!(data = sc.nextLine()).equals("quit")) {// 종료문 입력시 종료
//				                                            //data 변수를 sc.next()와 같다고 했기 때문에
//				                                            //data 는 Object 가 된다.
//				byte b [] = data.getBytes(); //byte 단위로 쪼개어 객체 b에 저장
//				bw.write(b); //method를 이용해서 b의 내용을 bw에 write
//				System.out.println("입력 내용 : " + data);
//				System.out.println("입력 : ");
//			
//			}
//		} catch (Exception e) {
//			System.out.println(e + " => 요류");
//		} finally {
//			try {
//				bw.close();
//			} catch (Exception e) {
//				System.out.println(e + " + close fail");
