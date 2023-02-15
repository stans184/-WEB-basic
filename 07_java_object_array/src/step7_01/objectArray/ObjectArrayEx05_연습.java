package step7_01.objectArray;

class Client{
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	public void setData(String id, String pw, String name, String birth, int age, String contact, String address) {
		this.id = id;							// parameter로 전달된 data를 field에 대입
		this.passwd = pw;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;
	}
	
	void printData() {
		System.out.println(this.id + ", " + this.passwd + ", " + this.name + ", " + this.birth + ", " + this.age + ", " + this.contact + ", " + this.address);
	}
}

public class ObjectArrayEx05_연습 {

	public static void main(String[] args) {
		
		Client[] clientList = new Client[3];
		
		for (int i = 0; i < clientList.length; i++) clientList[i] = new Client();
		
		clientList[0].id = "user1";
		clientList[0].passwd = "1111";
		clientList[0].name = "사용자1"; 
		clientList[0].birth = "2023-01-01";
		clientList[0].age = 1;
		clientList[0].contact = "010-1111-1111";
		clientList[0].address = "서울";
		
		// 임의의 method, constructor 의 역할
		clientList[1].setData("user2" , "2222" , "사용자2" , "2022-01-01" , 2 , "010-2222-2222" , "경기");
		clientList[2].setData("user3" , "3333" , "사용자3" , "2021-01-01" , 3 , "010-3333-3333" , "인천");
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i].printData();
		}
	}
}