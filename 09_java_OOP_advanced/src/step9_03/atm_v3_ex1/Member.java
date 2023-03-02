package step9_03.atm_v3_ex1;

import step9_00.myarraylist.MyArrayList;

public class Member {

	private String id;
	private String pw;
	private MyArrayList<Account> accList;
	
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}

	public MyArrayList<Account> getAccList() {
		return accList;
	}
	
	public void setAccList(MyArrayList<Account> accList) {
		this.accList = accList;
	}
}