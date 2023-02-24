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
	
	private final int BOOKCNT = 3;
	
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
		/* 출금할 계좌를 받고
		 * 얼마인지 받고
		 * 상대 계좌를 받고
		 */
		var clientMngr = ClientManager.getInstance();
		
		System.out.print("Enter your passbook number want to withdraw : ");
		int bookNum = sc.nextInt();
		int outBook = bookIdxCheck(bookNum);
		if (outBook == -1) System.out.println("PassBook num recheck");
		else {
			System.out.print("Enter money to transfer ? ");
			int outMoney = sc.nextInt();
			
			if (outMoney > bookList.get(outBook).getMoney()) System.out.println("Lack of Balance");
			else {
				System.out.print("Enter passbook number to transfer : ");
				int transBookNum = sc.nextInt();
				int transUsrIdx = -1;
				int transBookIdx = -1;
				
				
				for (int i = 0; i < clientMngr.clients.size(); i++) {
					var targetBookList = clientMngr.clients.get(i).getBookList();
					for (int j = 0; j < targetBookList.size(); j++) {
						if (transBookNum == targetBookList.get(j).getBookNum()) {
							transUsrIdx = i;
							transBookIdx = j;
						}
					}
				}
				
				var targetBook = clientMngr.clients.get(transUsrIdx).getBookList().get(transBookIdx);
				
				System.out.println(outMoney + ", transfer from [" + bookList.get(outBook).getBookNum() + "]");
				System.out.println("to [" + targetBook.getBookNum() + "]");
				bookList.get(outBook).setMoney(-outMoney);
				clientMngr.clients.get(transUsrIdx).getBookList().get(transBookIdx).setMoney(outMoney);
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