package step9_03.atm_v3_ex1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ShinHanAtm {
	
	Scanner sc = new Scanner(System.in);

	public void showMainMenu() throws IOException, ClassNotFoundException, SQLException {
		
		BankDB.getInstance().load();
		
		var membMngr = MemberManager.getInstance();
		
		while (true) {
			System.out.println();
			System.out.println("[ShinHan BANK]");
			System.out.println("[1. Join]");
			System.out.println("[2. Log-in]");
			System.out.println("[3. Show memberList]");
			System.out.println("[0. Exit]");
			System.out.print("Select menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) membMngr.join();
			else if (sel == 2) membMngr.logIn();
			else if (sel == 3) membMngr.showMemberList();
			else if (sel == 0) {
				BankDB.getInstance().save();
				break;
			}
		}
	}
}