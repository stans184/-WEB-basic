package step9_02.bank_v2_ex1;

import java.io.IOException;
import java.util.Scanner;

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	BankDB bankDB = new BankDB();
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
			else if (sel == 2) clientMngr.join();
			else if (sel == 3) try {bankDB.save();} catch (IOException e) {System.out.println(e);}
			else if (sel == 4) try {bankDB.load();} catch (IOException e) {System.out.println(e);}
			else if (sel == 0) {
				System.out.println("Program Exit");
				try {bankDB.save();} catch (IOException e) {System.out.println(e);}
				break;
			}
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
			
			if 		(sel == 1) bookMngr.creat();
			else if (sel == 2) bookMngr.delete();
			else if (sel == 3) bookMngr.print();
			else if (sel == 4) bookMngr.deposit();
			else if (sel == 5) bookMngr.withdraw();
			else if (sel == 6) bookMngr.transfer();
			else if (sel == 0) {
				clientMngr.logOut();
				break;
			}
		}
	}
}