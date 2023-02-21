package step9_01.atm_v1_ex1;

import java.util.ArrayList;

public class UserManager {

// AccountManager 에서도 부르고, ATM 에서도 불러서, SingleTon 으로 구현해봄
	
	private static UserManager userManager;
	
	private UserManager() {}
	
	public static UserManager getInstance() {
		if (userManager == null) {
			userManager = new UserManager();
		}
		return userManager;
	}
	
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
		int duplCheck = -1;
		
		if (userList == null) userList = new ArrayList<>();
		else {
			if (userList.size() > 0) {
				for (int i = 0; i < userList.size(); i++) {
					if (userList.get(i).getUserId().equals(id)) duplCheck = i;
				}
			}
		}
		User newUser = new User(id, pw);
		
		if (duplCheck != -1) System.out.println("duplicated ID, please re-generate");
		else {
			userList.add(newUser);
			System.out.println(id + ", welcome!");
		}
	}
	
	public void logIn(String id, String pw) {
		if (userList != null) {
			for (int i = 0; i < userList.size(); i++) {
				if (id.equals(userList.get(i).getUserId())) {
					if (pw.equals(userList.get(i).getUserPw())) {
						System.out.println(userList.get(i).getUserId() + ", welcome!");
						setIdentifier(i);;
					}
					else System.out.println("PW recheck");
				}
				else System.out.println("ID recheck");
			}
		}
		else System.out.println("Nobody Registered");
		
	}
	
	public void withdraw(String id, String pw) {
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).getUserId())) {
				if (pw.equals(userList.get(i).getUserPw())) {
					userList.remove(i);
					System.out.println(id + ", withdrawal");
				}
				else System.out.println("PW recheck");
			}
			else System.out.println("ID recheck");
		}
	}
}