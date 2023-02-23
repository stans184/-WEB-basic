package step9_02.bank_v2_ex1;
/*
 * 회원가입
 * 중복체크
 * 인덱스반환
 * 로그인
 * 로그아웃
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ClientManager {
	
	Scanner sc = new Scanner(System.in);
	
	private ClientManager() {}
	private static ClientManager clientManager = new ClientManager();
	public static ClientManager getInstance() {return clientManager;}
	
	ArrayList<Client> clients;
	public int clientCnt;
	private int logIdenifier = -1;
	
	public int getLogIdenifier() {return logIdenifier;}

	public void setLogIdenifier(int logIdenifier) {this.logIdenifier = logIdenifier;}

	public void join() {
		if (clients == null) clients = new ArrayList<Client>();
		
		System.out.print("Enter new Client ID : ");
		String newId = sc.next();
		System.out.print("Enter new Client Pw : ");
		String newPw = sc.next();
		
		if (duplCheck(newId, newPw)) System.out.println("duplicated ID, please re-generate");
		else {
			Client newClient = new Client(newId, newPw);
			System.out.println(newId + ", welcome!");
			clients.add(newClient);
			clientCnt += 1;
		}
	}
	
	public boolean duplCheck(String id, String pw) {
		boolean duplIdx = false;
		
		for (int i = 0; i < clients.size(); i++) {
			if (id.equals(clients.get(i).getClientId())) duplIdx = true;
		}
		return duplIdx;
	}
	
	public int idxCheck(String id) {
		int idx = -1;
		
		for (int i = 0; i < clients.size(); i++) {
			if (id.equals(clients.get(i).getClientId())) idx = i;
		}
		return idx;
	}
	
	public void logIn() {
		System.out.print("Enter client ID : ");
		String inId = sc.next();
		System.out.print("Enter client Pw : ");
		String inPw = sc.next();
		
		if (clients == null) System.out.println("Nobody Registered");
		else {
			int clientIdx = idxCheck(inId);
			
			if (clientIdx == -1) System.out.println("ID recheck");
			else {
				if (clients.get(clientIdx).getClientPw().equals(inPw)) {
					System.out.println(inId + ", Lon-In success");
					setLogIdenifier(clientIdx);
					
					var bookMngr = PassbookManager.getInstance();
					bookMngr.bookList = clients.get(getLogIdenifier()).getBookList();
				}
				else System.out.println("PW recheck");
			}
		}
	}
	
	public void logOut() {
		
		var bookMngr = PassbookManager.getInstance();
		
		if (getLogIdenifier() == -1) System.out.println("Nobody Log-in");
		else {
			System.out.println(clients.get(getLogIdenifier()).getClientId() + ", Log-Out");
			clients.get(getLogIdenifier()).setBookList(bookMngr.returnList());
			bookMngr.bookList = null;
			setLogIdenifier(-1);
		}
	}
}