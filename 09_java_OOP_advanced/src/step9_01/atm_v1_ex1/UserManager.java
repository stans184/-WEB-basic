package step9_01.atm_v1_ex1;

import java.util.ArrayList;

public class UserManager {

	// AccountManager 에서도 부르고, ATM 에서도 불러서, SingleTon 으로 구현해봄
	// static 변수로 해도 먹힐 거 같다
	// 나중에 한번 해봐야지
	
	private static UserManager userManager;
	
	private UserManager() {}
	
	public static UserManager getInstance() {
		if (userManager == null) userManager = new UserManager();
		return userManager;
	}
	
//	이러면 stackOverFlow 발생
//	AccountManager accMngr = AccountManager.getInstance();
	
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
		var newUser = new User(id, pw);
		
		if (duplCheck != -1) System.out.println("duplicated ID, please re-generate");
		else {
			userList.add(newUser);
			System.out.println(id + ", welcome!");
		}
	}
	
	public void logIn(String id, String pw) {
		
		/*
		 * qq, welcome!
		 * ID recheck
		 * ID recheck
		 * ID recheck
		 * 
		 * for 안에다가 else print recheck 를 띄워놔서 이게 반복되던 이슈가 있었음
		 * id checker를 밖으로 빼고 print 를 해야겠네
		 */
		
		int inUser = -1;
		
		if (userList != null) {
			for (int i = 0; i < userList.size(); i++) {
				if (id.equals(userList.get(i).getUserId())) {
					if (pw.equals(userList.get(i).getUserPw())) inUser = i;
					else inUser = -2;
				}
			}
		}
		else System.out.println("Nobody Registered");
		
		if (inUser == -1) System.out.println("ID recheck");
		else if (inUser == -2) System.out.println("PW recheck");
		else {
			System.out.println(userList.get(inUser).getUserId() + ", welcome!");
			setIdentifier(inUser);;
		}
	}
	
	// 로그아웃을 하나로 구현하는게 좋은데, 여기서 넘겨버리면 accountList 를 반환하지 못함
	// AccountManager 또한 SingleTon 으로 구현해서 처리해야함
	public void logOut() {
		var accMngr = AccountManager.getInstance();
		
		accMngr.returnAccList();
		setIdentifier(-1);
	}
	
	public void withdraw(String id, String pw) {
		
		// login 과 비슷하게, 반복되는 for 안에서 출력을 구현해놔서
		// 원하지 않을 때 Id recheck, PW recheck 이 뜰 수 있음
		
		int delUser = -1;
		
		for (int i = 0; i < userList.size(); i++) {
			if (id.equals(userList.get(i).getUserId())) {
				if (pw.equals(userList.get(i).getUserPw())) delUser = i;
				else delUser = -2;
			}
		}
		
		if (delUser == -2) System.out.println("PW recheck");
		else if (delUser == -1) System.out.println("ID recheck");
		else {
			userList.remove(delUser);
			System.out.println(id + ", withdrawal");
		}
	}
}