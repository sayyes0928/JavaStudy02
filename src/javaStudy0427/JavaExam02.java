package javaStudy0427;

public class JavaExam02 { // ����ó�� exception

	public static void main(String[] args) {
		try { //���ܰ� �߻� �� �� ���� �ڵ带 ���°�, �������� ����
			  // java.lang �� �����ִ�.
			  // ������ �ڿ� catch�� ���;��Ѵ�
		//	String [] s = new String[3];
		//	s[3] = "asd";
			String str =  "abc";
			System.out.println(str);
			int i = Integer.parseInt(str);
			int result = 10 / i;
//		}catch (ArrayIndexOutOfBoundsException e) {//try���� �߻��� ���ܸ� catch���� ��Ƽ� ó���Ѵ�.->�������� ���Ḧ ��Ÿ���ش�
//      System.out.println(e+"=>�μ��� �־��ּ���");		// catch �ȿ� ���๮�� ��������. ������ ����ֱ⸸
//   }catch (NumberFormatException e) {
//	   System.out.println(e+"=>���ڸ� �Է��ϼ���");
}catch(Exception e){ //exception�� �ֻ��� Ŭ����
	System.out.println(e + "=>�����Դϴ�.");
	}finally { //���ܿ� ������� ����
		System.out.println("�� ������ (���ܰ� �ִ�����)�����մϴ�");
	}
		System.out.println("���α׷� ����");
}

}
