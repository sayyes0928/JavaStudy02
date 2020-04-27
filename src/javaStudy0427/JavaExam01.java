package javaStudy0427;

import java.util.Enumeration;
import java.util.Hashtable;

class UserInfo {
	String name;
	String addr;
	String tel; // intŸ���� �ش� ������ ��� �� ������ �����Ѵ٤�

	public String getName() { // get�� ���� return
		return name;
	}

	public void setName(String name) { // set�� this���� �Ű������� �ִ´�.
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}

class CollectionMap {

	Hashtable<String, UserInfo> table = new Hashtable<String, UserInfo>();

	public CollectionMap() {
		UserInfo u = new UserInfo();
		u.setName("��");
		u.setTel("010");
		u.setAddr("������");
		
		UserInfo u2 = new UserInfo();
		u2.setName("�̳���");
		u2.setTel("1234");
		u2.setAddr("���ﵿ");
		
		table.put("na", u);
		table.put("lee", u2);
		
		Enumeration<String> e = table.keys();
		while (e.hasMoreElements()) { //�о�� ��Ұ� ������ true, ������ false�� ��ȯ
			String key = e.nextElement();
			UserInfo value = table.get(key);
			System.out.println(key + "=" + value);
			System.out.println(value.getName() + "," + value.getTel()+","
					+ "" + value.getAddr());
			
		}
	}
}

public class JavaExam01 { // Collection ����

	public static void main(String[] args) {
//		UserInfo info = new UserInfo();
//	//	ArrayList</*��ü�� Ÿ�Ը� ���� */UserInfo> arrlist = new ArrayList<UserInfo>(); //** ��ü�� ��ü�� Ÿ���� �ٸ�!
//		
//		ArrayList<UserInfo> arrlist = new ArrayList<UserInfo>(); // < > ���׸�Ÿ�� (��ü�� Ÿ��)�� ��ü�� class�� ������ �ش� class�� ��ü�� Ÿ���� ��� ����
//		HashMap<String, UserInfo>hashMap = new HashMap<>();

		new CollectionMap();
	}

}
