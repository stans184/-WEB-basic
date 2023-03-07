package step9_04.customer_ex1;

import java.sql.SQLException;

/*
 * main > controller > service > DAO > DB
 * 
 *  - insert, modify, view, printAll, delete
 *  - DB 는 MySQL
 */

import java.util.Scanner;

public class CSMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		var controller = new CSController();
		
		while (true) {
			System.out.println();
			System.out.println("[Customer Manager]");
			System.out.println("[1. Insert]");
			System.out.println("[2. Modify]");
			System.out.println("[3. Delete]");
			System.out.println("[4. Show Detail]");
			System.out.println("[5. Print All]");
			System.out.println("[0. Quit Manager]");
			System.out.print("Select Menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.print("Enter your ID : ");
				String id = sc.next();
				System.out.print("Enter your PW : ");
				String pw = sc.next();
				System.out.print("Enter your Email : ");
				String email = sc.next();
				
				var csInsert = controller.getCsInsert();
				try {csInsert.insert(new CSDTO(id, pw, email));} catch (Exception e) {e.printStackTrace();}
			}
			else if (sel == 2) {
				controller.getCsModify();
			}
			else if (sel == 3) {
				controller.getCsDelete();
			}
			else if (sel == 4) {
				
			}
			else if (sel == 5) {
				
			}
			else if (sel == 0) {
				System.out.println("Program Exit");
				sc.close();
				break;
			}
		}
	}
}