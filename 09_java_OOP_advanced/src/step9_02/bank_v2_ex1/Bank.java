package step9_02.bank_v2_ex1;

import java.util.Scanner;

/*
 * run
 * login
 * > login menu
 * join
 * exit
 */

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	ClientManager clientMngr = ClientManager.getInstance();
	
	void run() {
		
		while (true) {
			System.out.println();
			System.out.println("[IT BANK]");
			System.out.println("[1. Login]");
			System.out.println("[2. Join]");
			System.out.println("[3. Save]");
			System.out.println("[4. Load]");
			System.out.println("[0. Exit (AutoSave)]");
			System.out.print("Select Menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				clientMngr.logIn();
				if (clientMngr.getLogIdenifier() != -1) clientMenu();
			}
			else if (sel == 2) {
				clientMngr.join();
			}
			else if (sel == 3) {
				
			}
			else if (sel == 4) {
				
			}
			else if (sel == 0) break;
		}
	}
	
	void clientMenu() {
		
		var bookMngr = PassbookManager.getInstance();
		
		while (true) {
			System.out.println();
			if (clientMngr.getLogIdenifier() != -1) System.out.println(clientMngr.clients.get(clientMngr.getLogIdenifier()).getClientId() + ", using");
			System.out.println("[1. Make PassBook]");
			System.out.println("[2. Delete PassBook]");
			System.out.println("[3. Inquiry PassBook]");
			System.out.println("[4. Deposit Money]");
			System.out.println("[5. Withdraw]");
			System.out.println("[6. Transfer Money]");
			System.out.println("[0. Log-Out]");
			System.out.print("Select menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				bookMngr.creat();
			}
			else if (sel == 2) {
				bookMngr.delete();
			}
			else if (sel == 3) {
				bookMngr.print();
			}
			else if (sel == 4) {
				
			}
			else if (sel == 5) {
				
			}
			else if (sel == 6) {

			}
			else if (sel == 0) {
				clientMngr.logOut();
				break;
			}
		}
	}
}