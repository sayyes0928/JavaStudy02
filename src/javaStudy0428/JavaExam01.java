package javaStudy0428;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExam01 {

	public static void main(String[] args) throws IOException {
		FileInputStream f = null;
//	FileOutputStream f = null; //IO �� �ݵ�� try,catch �� ����Ѵ�.
//		try {
//		//	**OutPut***
//			f =new FileOutputStream("d:javaex01.txt",true); // ("file dir", true) -> �̾��
//			                                                // flie�� ���� ���, ����
//			f.write(97); //����� ������ ���� �̿ܿ��� ��� ���ڷ� �ν��Ѵ�.�ƽ�Ű�ڵ�
//			
//			
//			String data = "������ ȭ����";
//			String data1 = "������ ������";
//			String data2 = "������ �����";
//			byte b[] = data.getBytes(); //byte ������ �ɰ��� ��ü�� ��� �����Ѵ�.
//			f.write(b);
//			
//			byte b1[] = data1.getBytes(); //byte ������ �ɰ��� ��ü�� ��� �����Ѵ�.
//			f.write(b1);
//			byte b2[] = data2.getBytes(); //byte ������ �ɰ��� ��ü�� ��� �����Ѵ�.
//			f.write(b2);
//	//		
//	//		**InPut**
//		try {
//			f = new FileInputStream("d:javaex02.txt");
//			System.out.println("available = " + f.available()); // �о� �� �� �ִ� byte ��
//	//		byte b3[] = f.// �Ͼ�� �� �ִ� ��ŭ�� byte
//
//			while (f.read(b3) != -1) {
//			} // file�� ���� ' -1 '�� ó���Ѵ�. -1�� file ���� ��ȯ�Ǳ� ����
//				// read b�� �о� �´�.
//
//			String data4 = new String(b3); // b�� �������� Data�� ��������
//			System.out.println(data4);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // Input�� In�� �ؼ� ������ ����� ���⶧���� ������ ����
//
////			
////	// IO�� ������ ����. try,catch
//			
//	
	}
}
