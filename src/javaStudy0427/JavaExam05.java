package javaStudy0427;

import java.io.File;
import java.util.Date;

public class JavaExam05 {

	public static void main(String[] args) throws Exception { //�ܺ� ���Ͽ� ���� ����

		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\JavaStudy");
		if (f.exists()) {
			System.out.println("�����մϴ�");

			if (f.isDirectory()) {
				System.out.println("��������");
			} else {

				System.out.println("��������****");
				System.out.println("�����̸� : " + f.getName());
				System.out.println("file root : " + f.getAbsolutePath());
				System.out.println("read" + f.canRead());
				System.out.println("write : " + f.canWrite());
				System.out.println("lenght : " + f.length());

				long time = f.lastModified();
				Date lastModifier = new Date(time);
				System.out.println("������¥ : " + lastModifier);
				f.delete();
			}
		}
	}
}
