package step9_03.atm_v3_ex1;

import java.io.IOException;
import java.util.Scanner;

import step9_00.myarraylist.MyArrayList;

public class MemberManager {
	
	private static MemberManager memberManager = new MemberManager();
	private MemberManager() {}
	public static MemberManager getInstance() {return memberManager;}
	
	MyArrayList<Member> memberList;
	private int memId = -1;
	
	public void setMemId(int id) {this.memId = id;}
	public int getMemId() {return memId;}
	
	Scanner sc = new Scanner(System.in);
	
	public boolean duplCheck(String id) {
		
		var dupl = false;
		
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getId().equals(id)) dupl = true;
		}
		
		return dupl;
	}
	
	public void join() {
		
		if (memberList == null) memberList = new MyArrayList<>();
		
		System.out.print("Enter new member id : ");
		String newId = sc.next();
		System.out.print("Enter new member pw : ");
		String newPw = sc.next();
		
		if (duplCheck(newId)) System.out.println("Duplicated ID, please re-generate");
		else {
			System.out.println(newId + ", welcome!");
			var newMem = new Member(newId, newPw);
			memberList.add(newMem);
		}
	}
	
	public void withdraw() {
		System.out.print("Enter your pw : ");
		String outPw = sc.next();
		
		if (!memberList.get(getMemId()).getPw().equals(outPw)) System.out.println("Wrong PW");
		else {
			System.out.println(memberList.get(getMemId()).getId() + ", GoodBYE");
			memberList.remove(getMemId());
			setMemId(-1);
		}
	}
	
	public int idChecker(String id) {
		int idx = -1;
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) idx = i;
		}
		return idx;
	}
	
	public void logIn() throws IOException {
		if (memberList == null) System.out.println("nobody registered");
		else {
			System.out.print("Enter id : ");
			String inId = sc.next();
			int idx = idChecker(inId);
			if (idx == -1) System.out.println("No same ID");
			else {
				System.out.print("Enter pw : ");
				String inPw = sc.next();
				
				if (!memberList.get(idx).getPw().equals(inPw)) System.out.println("Wrong PW");
				else {
					System.out.println(inId + ", logIn SUCCESS");
					setMemId(idx);
					memberMenu();
				}
			}
		}
	}
	
	public void logOut() throws IOException {
		if (getMemId() == -1) System.out.println("NOBODY login");
		else {
			System.out.println(memberList.get(getMemId()).getId() + ", logOut");
			setMemId(-1);
			AccountManager.getInstance().accountList = null;
			BankDB.getInstance().save();
		}
	}
	
	public void showMemberList() {
		if (memberList == null) System.out.println("Nobody registered");
		else {
			System.out.print("[");
			for (int i = 0; i < memberList.size(); i++) {
				System.out.print(" " + memberList.get(i).getId() + " ");
			}
			System.out.println("]");
		}
	}
	
	public void memberMenu() throws IOException {
		
		var accMngr = AccountManager.getInstance();
		accMngr.accountList = memberList.get(getMemId()).getAccList();
		
		while (true) {
			System.out.println();
			if (getMemId() != -1) {
				System.out.println(memberList.get(getMemId()).getId() + ", using");
			}
			System.out.println("[1. Make Account]");
			System.out.println("[2. Deposit]");
			System.out.println("[3. Withdraw Money]");
			System.out.println("[4. Transfer Money]");
			System.out.println("[5. Inquiry Account]");
			System.out.println("[6. Delete Account]");
			System.out.println("[7. Membership Withdrawal]");
			System.out.println("[0. Back, LogOut]");
			System.out.print("Select Menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) 	   accMngr.make();
			else if (sel == 2) accMngr.deposit();
			else if (sel == 3) accMngr.withdraw();
			else if (sel == 4) accMngr.transfer();
			else if (sel == 5) accMngr.showAllAcount(true);
			else if (sel == 6) accMngr.delete();
			else if (sel == 7) {
				withdraw();
				break;
			}
			else if (sel == 0) {
				logOut();
				break;
			}
		}
	}
}