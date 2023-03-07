package step9_04.customer_ex1;

import java.sql.SQLException;
import java.util.Map;

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
				System.out.print("Enter your ID : ");
				String id = sc.next();
				System.out.print("Enter your pw : ");
				String pw = sc.next();
				
				var csModify = controller.getCsModify();
				
				try {
					if (csModify.checkId(id)) {
						if (csModify.checkPw(id, pw)) {
							System.out.print("Enter new PW : ");
							String newPw = sc.next();
							System.out.print("Enter new email : ");
							String newEmail = sc.next();
							
							csModify.modify(id, newPw, newEmail);
						}
						else System.out.println("Wrong PW");
					}
					else System.out.println("Cannot found " + id);
				} catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
			}
			else if (sel == 3) {
				System.out.print("Enter ID : ");
				String id = sc.next();
				
				var csDelete = controller.getCsDelete();
				try {csDelete.delete(id);} catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
			}
			else if (sel == 4) {
				System.out.print("Enter ID : ");
				String id = sc.next();
				
				var csSelect = controller.getCsSelect();
				try {
					CSDTO customer = csSelect.select(id);
					customer.print();
				} catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
			}
			else if (sel == 5) {
				try {
					Map<Integer, CSDTO> csList = controller.getCsSelectAll().select();
					
					for (int num : csList.keySet()) {
						csList.get(num).print();
					}
				} catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
			}
			else if (sel == 0) {
				System.out.println("Program Exit");
				sc.close();
				break;
			}
		}
	}
}