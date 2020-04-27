package javaStudy0427;

import java.util.Enumeration;
import java.util.Hashtable;

class UserInfo {
	String name;
	String addr;
	String tel; // int타입은 해당 값으로 계산 할 때에만 지정한다ㅣ

	public String getName() { // get은 값을 return
		return name;
	}

	public void setName(String name) { // set은 this값에 매개변수를 넣는다.
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
		u.setName("나");
		u.setTel("010");
		u.setAddr("강남구");
		
		UserInfo u2 = new UserInfo();
		u2.setName("이나영");
		u2.setTel("1234");
		u2.setAddr("역삼동");
		
		table.put("na", u);
		table.put("lee", u2);
		
		Enumeration<String> e = table.keys();
		while (e.hasMoreElements()) { //읽어올 요소가 있으면 true, 없으면 false를 반환
			String key = e.nextElement();
			UserInfo value = table.get(key);
			System.out.println(key + "=" + value);
			System.out.println(value.getName() + "," + value.getTel()+","
					+ "" + value.getAddr());
			
		}
	}
}

public class JavaExam01 { // Collection 수업

	public static void main(String[] args) {
//		UserInfo info = new UserInfo();
//	//	ArrayList</*객체형 타입만 가능 */UserInfo> arrlist = new ArrayList<UserInfo>(); //** 객체와 객체형 타입은 다름!
//		
//		ArrayList<UserInfo> arrlist = new ArrayList<UserInfo>(); // < > 제네릭타입 (객체형 타입)에 객체의 class를 넣으면 해당 class의 객체의 타입을 사용 가능
//		HashMap<String, UserInfo>hashMap = new HashMap<>();

		new CollectionMap();
	}

}
