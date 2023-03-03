package step9_03.atm_v3_ex1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import step9_00.myarraylist.MyArrayList;

public class AccountManager {
	
	private static AccountManager accountManager = new AccountManager();
	private AccountManager() {}
	public static AccountManager getInstance() {return accountManager;}
	
	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	
//	이렇게 하면 memIdx 가 제대로 반영이 안됨? 이유는?
//	MemberManager mb = MemberManager.getInstance();
//	int memIdx = mb.getMemId();
	public final int MAX_CNT = 3;
	MyArrayList<Account> accountList;
	
	public int[] accountIdxCheck(int num) {
		var memberMngr = MemberManager.getInstance();
		
		int[] idx = {-1, -1};
		
		for (int i = 0; i < memberMngr.memberList.size(); i++) {
			MyArrayList<Account> accList = memberMngr.memberList.get(i).getAccList();
			if (accList == null) continue;
			else {
				for (int j = 0; j < accList.size(); j++) {
					if (accList.get(j).getNum() == num) {
						idx[0] = i;
						idx[1] = j;
					}
				}
			}
		}
		return idx;		// [0] member [1] account index
	}
	
	public void showAllAcount(boolean choice) {
		if (!choice) {
			if (accountList == null) System.out.println("No Account, please generate");
			else {
				for (int i = 0; i < accountList.size(); i++) {
					System.out.println("[" + (i+1) + "] " + accountList.get(i).getNum());
				}
				System.out.println();
			}
		}
		else {
			if (accountList == null) System.out.println("No Account, please generate");
			else {
				for (int i = 0; i < accountList.size(); i++) {
					System.out.print("[" + (i+1) + "] " + accountList.get(i).getNum() + " : ");
					System.out.println("$" + accountList.get(i).getMoney());
				}
				System.out.println();
			}
		}
	}
	
	public void make() throws IOException {
		if (accountList == null) {
			accountList = new MyArrayList<>();
			int newNum = rm.nextInt(899999)+100000;
			System.out.println(newNum + ", Created");
			accountList.add(new Account(newNum));
		}
		else {
			if (accountList.size() == MAX_CNT) System.out.println("AccountList FULL");
			else {
				while (true) {
					int newNum = rm.nextInt(899999)+100000;
					int duplCheck = accountIdxCheck(newNum)[1];
					
					if (duplCheck == -1) {
						System.out.println(newNum + ", Created");
						accountList.add(new Account(newNum));
						break;
					}
				}
			}
		}
		saveList();
	}
	
	public void delete() throws IOException {
		showAllAcount(false);
		System.out.print("Select Account to delete : ");
		int sel = sc.nextInt()-1;
		accountList.remove(sel);
		saveList();
	}
	
	public void deposit() throws IOException {
		showAllAcount(false);
		System.out.print("Select Account to deposit : ");
		int sel = sc.nextInt()-1;

		System.out.print("How much money ? ");
		int inMoney = sc.nextInt();
		accountList.get(sel).setMoney(inMoney);
		System.out.println("Deposit successful");
		saveList();
	}
	
	public boolean lackCheck(int idx, int money) {
		boolean check = false;
		var memberMngr = MemberManager.getInstance();
		accountList = memberMngr.memberList.get(memberMngr.getMemId()).getAccList();
		
		if (accountList.get(idx).getMoney() < money) check = true;
		
		return check;
	}
	
	public void withdraw() throws IOException {
		showAllAcount(true);
		System.out.print("Select Account to withdraw money : ");
		int sel = sc.nextInt()-1;
		
		System.out.print("How much money ? ");
		int outMoney = sc.nextInt();
		
		if (lackCheck(sel, outMoney)) System.out.println("Lack of balance");
		else {
			accountList.get(sel).setMoney(-outMoney);
			System.out.println("$" + outMoney + ", withdrawal");
			saveList();
		}
	}
	
	public void transfer() throws IOException {
		showAllAcount(true);
		System.out.print("Select Account to transfer money : ");
		int sel = sc.nextInt()-1;
		
		System.out.print("How much money ? ");
		int transMoney = sc.nextInt();
		
		if (lackCheck(sel, transMoney)) System.out.println("Lack of Balance");
		else {
			System.out.print("Enter Account to transfer : ");
			int transNum = sc.nextInt();
			int[] idx = accountIdxCheck(transNum);
			
			accountList.get(sel).setMoney(-transMoney);
			saveList();
			
			var memberMngr = MemberManager.getInstance();
			memberMngr.memberList.get(idx[0]).getAccList().get(idx[1]).setMoney(transMoney);
			System.out.println(accountList.get(sel).getNum() + " -> " + transMoney + " -> " + memberMngr.memberList.get(idx[0]).getAccList().get(idx[1]).getNum());
		}
	}
	
	public void saveList() {
		var memberMngr = MemberManager.getInstance();
		memberMngr.memberList.get(memberMngr.getMemId()).setAccList(accountList);
	}
}