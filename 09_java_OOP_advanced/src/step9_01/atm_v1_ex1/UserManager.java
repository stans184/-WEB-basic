package step9_01.atm_v1_ex1;

import java.util.ArrayList;

public class UserManager {

//	- 유저추가
//	- 유저반환
//	- 로그인
//	- 로그아웃
//	- 회원탈퇴

	ArrayList<User> userList;
	private int identifier = -1;
	
	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public void addUser(String id, String pw) {
		
		User newUser = new User(id, pw);
		int duplCheck = -1;
		
		if (userList.size() > 0) {
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getUserId().equals(newUser.getUserId())) duplCheck = i;
			}
		}
		
		if (duplCheck != -1) System.out.println("duplicated ID, please re-generate");
		else userList.add(newUser);
		System.out.println(id + ", welcome!");
	}
	
	public void logIn(String id, String pw) {
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).getUserId())) {
				if (pw.equals(userList.get(i).getUserPw())) {
					System.out.println(userList.get(i).getUserId() + ", welcome!");
					identifier = i;
				}
				else System.out.println("PW recheck");
			}
			else System.out.println("ID recheck");
		}
	}
	
	public void logOut() {
		if (identifier == -1) System.out.println("Nobody login");
		else {
			System.out.println(userList.get(identifier).getUserId() + ", log-out");
			identifier = -1;
		}
	}
	
	public void withdraw(String id, String pw) {
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).getUserId())) {
				if (pw.equals(userList.get(i).getUserPw())) {
					userList.remove(new User(id, pw));
				}
				else System.out.println("PW recheck");
			}
			else System.out.println("ID recheck");
		}
	}
}