package javaStudy0427;

class K099809808AA{
	void method()throws Exception{
		//�޼ҵ� �� ��� ���忡 ������
	}
}

public class JavaExam03 {

	public static void main(String[] args) {
//         try {
//        	 method(); ���ܸ� ���� �޼ҵ带 ����� ������ catch�ϱ����� ������
//         }catch(){
//        	  
//         }
		int i = (int) (Math.random() * 3) + 1;
		System.out.println("����  " + i);

		if (i == 3) {
			try {
				throw new Exception(); //���� ���� �߻�, ���α׷������� ������ ������ ������ ��Ȳ�� �߻� �� ���
			} catch (Exception e) {
				System.out.println(e + "=>�߻�");
			}
		} else {
			System.out.println("�ùٸ� �����Դϴ�.");
		}
		System.out.println("**End***");
	}

}
