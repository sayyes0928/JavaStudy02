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
//		FileOutputStream user = null; // fileOutPut�� �� ��ü ����
//		try { // IO������ �ʼ��� ����
//			System.out.println("id �Է�");
//			String IdTxt = sc.next();
//
//			user = new FileOutputStream("d:" + IdTxt + ".txt", true);
//
//			System.out.println("pw �Է�");
//			String Pw = sc.next() + ",";
//
//			System.out.println("pw Ȯ�� �Է�");
//			String PwRe = sc.next() + ",";
//
//			System.out.println("name �Է�");
//			String Name = sc.next() + ",";
//
//			System.out.println("birth �Է�");
//			String Birth = sc.next() + ",";
//
//			System.out.println("email �Է�");
//			String Email = sc.next() + ",";
//
//			System.out.println("addr �Է�");
//			String Addr = sc.next() + ",";
//
//			System.out.println("phone �Է�");
//			String Phone = sc.next() + ",";
//
//			byte id[] = IdTxt.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(id); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte pw[] = Pw.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(pw); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte pwre[] = PwRe.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(pwre); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte name[] = Name.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(name); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte birth[] = Birth.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(birth); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte email[] = Email.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(email); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte addr[] = Addr.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(addr); // method�� �̿��ؼ� b�� ������ bw�� write
//			byte phone[] = Phone.getBytes(); // byte ������ �ɰ��� ��ü b�� ����
//			user.write(phone); // method�� �̿��ؼ� b�� ������ bw�� write
//
//			String txt = (IdTxt + Pw + PwRe + Name + Birth + Email + Addr + Phone);
//			String[] arrTxt = txt.split(",");
//
//			for (int j = 0; j < arrTxt.length; j++) {
//				System.out.println(arrTxt[j]);
//			}
//
//			if (arrTxt[0].equals("123")) {
//				System.out.println("���� �����ϴ�.");
//			}
//
//			// Input�� In�� �ؼ� ������ ����� ���⶧���� ������ ����
////			
////	System.out.println("available = " + f2.available()); //�о� �� �� �ִ� byte ��
////	byte b3[] = new byte[f2.available()]; //�Ͼ�� �� �ִ� ��ŭ�� byte
////	
////	while(f2.read(b3) != -1) {} //file�� ���� ' -1 '�� ó���Ѵ�. -1�� file ���� ��ȯ�Ǳ� ����
////	                          //read b�� �о� �´�.
////	
////	String data4 = new String(b3); //b�� �������� Data�� �������� 
////	System.out.println(data4);
//
//			// while (!(Id = sc.nextLine()).equals("quit")) {// ���Ṯ �Է½� ����
//			// data ������ sc.next()�� ���ٰ� �߱� ������
//			// data �� Object �� �ȴ�.
//			// }
//		} catch (Exception e) {
//			System.out.println(e + " => ���");
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
					System.out.println("available = " + f.available()); // �о� �� �� �ִ� byte ��
					byte b3[];
					b3 = new byte[f.available()];
					String data4 = new String(b3); // b�� �������� Data�� ��������
					System.out.println(data4);
				} catch (Exception e) {
				}
			}
		}
	}

}

//		while (f.read(b3) != -1) {
//		} // file�� ���� ' -1 '�� ó���Ѵ�. -1�� file ���� ��ȯ�Ǳ� ����
//			// read b�� �о� �´�.
//		FileOutputStream bw = null; //fileOutPut�� �� ��ü ����
//		Scanner sc = new Scanner(System.in);
//		try { //IO������ �ʼ��� ����
//			bw = new FileOutputStream("d:javaex01.txt");
//			String data = null;
//			System.out.println("�Է� : "); //�ֿܼ��� �����ϱ� ������ ����
//			
//			while (!(data = sc.nextLine()).equals("quit")) {// ���Ṯ �Է½� ����
//				                                            //data ������ sc.next()�� ���ٰ� �߱� ������
//				                                            //data �� Object �� �ȴ�.
//				byte b [] = data.getBytes(); //byte ������ �ɰ��� ��ü b�� ����
//				bw.write(b); //method�� �̿��ؼ� b�� ������ bw�� write
//				System.out.println("�Է� ���� : " + data);
//				System.out.println("�Է� : ");
//			
//			}
//		} catch (Exception e) {
//			System.out.println(e + " => ���");
//		} finally {
//			try {
//				bw.close();
//			} catch (Exception e) {
//				System.out.println(e + " + close fail");
