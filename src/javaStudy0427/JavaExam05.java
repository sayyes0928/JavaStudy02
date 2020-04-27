package javaStudy0427;

import java.io.File;
import java.util.Date;

public class JavaExam05 {

	public static void main(String[] args) throws Exception { //외부 파일에 대한 접근

		File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\JavaStudy");
		if (f.exists()) {
			System.out.println("존재합니다");

			if (f.isDirectory()) {
				System.out.println("폴더정보");
			} else {

				System.out.println("파일정보****");
				System.out.println("파일이름 : " + f.getName());
				System.out.println("file root : " + f.getAbsolutePath());
				System.out.println("read" + f.canRead());
				System.out.println("write : " + f.canWrite());
				System.out.println("lenght : " + f.length());

				long time = f.lastModified();
				Date lastModifier = new Date(time);
				System.out.println("수정날짜 : " + lastModifier);
				f.delete();
			}
		}
	}
}
