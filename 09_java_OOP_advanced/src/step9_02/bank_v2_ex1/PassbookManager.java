package step9_02.bank_v2_ex1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PassbookManager {
	
	private PassbookManager() {}
	private static PassbookManager passbookManager = new PassbookManager();
	public static PassbookManager getInstance() {return passbookManager;}
	
	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	ArrayList<PassBook> bookList;
	
	public final int BOOKCNT = 3;
	
	public void creat() {
		if (bookList == null) bookList = new ArrayList<PassBook>();
		
		if (bookList.size() == BOOKCNT) System.out.println("MAX PASSBOOK COUNT");
		else {
			while (true) {
				int newBookNum = rm.nextInt(8999) + 1000;
				
				if (!duplCheck(newBookNum)) {
					bookList.add(new PassBook(newBookNum));
					System.out.println("[" + newBookNum + "] passbook created!");
					break;
				}
			}
		}
	}
	
	public void delete() {
		System.out.print("Enter book number : ");
		int bookNum = sc.nextInt();
		int idx = bookIdxCheck(bookNum);
		
		if (idx == -1) System.out.println("Please re-check");
		else {
			System.out.println(bookNum + ", deleted");
			bookList.remove(idx);
		}
	}
	
	public void deposit() {
		System.out.print("Enter book number : ");
		int bookNum = sc.nextInt();
		int idx = bookIdxCheck(bookNum);
		
		if (idx == -1) System.out.println("Please re-check");
		else {
			System.out.print("Enter deposit Money ? ");
			int inMoney = sc.nextInt();
			
			System.out.println(inMoney + ", deposited in [" + bookList.get(idx).getBookNum() + "]");
			bookList.get(idx).setMoney(inMoney);
		}
	}
	
	public void withdraw() {
		System.out.print("Enter book number : ");
		int bookNum = sc.nextInt();
		int idx = bookIdxCheck(bookNum);
		
		if (idx == -1) System.out.println("Please re-check");
		else {
			System.out.print("Enter deposit Money ? ");
			int outMoney = sc.nextInt();
			
			System.out.println(outMoney + ", withdrawn from [" + bookList.get(idx).getBookNum() + "]");
			bookList.get(idx).setMoney(-outMoney);
		}
	}
	
	public void transfer() {
		
		var clientMngr = ClientManager.getInstance();
		
		System.out.print("Enter the passbook number want to withdraw : ");
		int bookNum = sc.nextInt();
		int idx = bookIdxCheck(bookNum);
		
		if (idx == -1) System.out.println("Please re-check");
		else {
			System.out.print("Enter Money to transfer ? ");
			int mvMoney = sc.nextInt();
			
			if (bookList.get(idx).getMoney() < mvMoney) System.out.println("Not enough money");
			else {
				System.out.print("Enter the passbook number to receive money : ");
				int mvBookNum = sc.nextInt();
				int mvIdx = -1;
				int mvUsrIdx = -1;
				
				for (int i = 0; i < clientMngr.clients.size(); i++) {
					for (int j = 0; j < clientMngr.clients.get(i).getBookList().size(); j++) {
						if (clientMngr.clients.get(i).getBookList().get(j).getBookNum() == mvBookNum) {
							mvIdx = j;
							mvUsrIdx = i;
						}
					}
				}
				
				if (mvIdx == -1 || mvUsrIdx == -1) System.out.println("Wrong input, reCheck");
				else {
					bookList.get(idx).setMoney(-mvMoney);
					clientMngr.clients.get(mvUsrIdx).getBookList().get(mvIdx).setMoney(mvMoney);
					System.out.println(mvMoney + ", transfer from [" + bookList.get(idx).getBookNum() + "]"
							+ " to " + clientMngr.clients.get(mvUsrIdx).getClientId() + "\' passbook ["
							+ clientMngr.clients.get(mvUsrIdx).getBookList().get(mvIdx).getBookNum() + "]");
				}
			}
		}
	}
	
	public int bookIdxCheck(int num) {
		int checker = -1;
		
		for (int i = 0; i < bookList.size(); i++) {
			if (num == bookList.get(i).getBookNum()) checker = i;
		}
		return checker;
	}
	
	public boolean duplCheck(int num) {
		boolean dupl = false;
		
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getBookNum() == num) dupl = true;
		}
		return dupl;
	}
	
	public void print() {
		if (bookList == null) System.out.println("Please make PassBook");
		else System.out.println(bookList);
	}
	
	public ArrayList<PassBook> returnList(){
		return bookList;
	}
}