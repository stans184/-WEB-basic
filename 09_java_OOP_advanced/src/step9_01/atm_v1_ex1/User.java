package step9_01.atm_v1_ex1;

import java.util.ArrayList;

public class User {

	private String userId;
	private String userPw;
	private ArrayList<Account> accountList;
	
	public User(String id, String pw) {
		this.userId = id;
		this.userPw = pw;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "User [" + userId + "] accountList = " + accountList;
	}
}