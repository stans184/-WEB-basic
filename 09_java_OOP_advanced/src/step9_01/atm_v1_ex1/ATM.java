package step9_01.atm_v1_ex1;
//- 메뉴출력 및 입력
//- 로그인
//- 회원가입
//- 회원탈퇴
//- 종료

import java.util.Scanner;

public class ATM {

	Scanner sc = new Scanner(System.in);
	UserManager usrMnger = new UserManager();
	
	public void printATMMenu() {
		
		while (true) {
			System.out.println();
			System.out.println("[IT ATM]");
			System.out.println("[1. Log-in] [2. Join] [3. Withdraw] [0. Quit]");
			System.out.print("Selete the menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.print("Enter User ID : ");
				String inId = sc.next();
				System.out.print("Enter User PW : ");
				String inPw = sc.next();
				
				usrMnger.logIn(inId, inPw);
				printUserMenu();
			}
			else if (sel == 2) {
				System.out.println("Welcome IT ATM");
				System.out.print("Enter new User ID : ");
				String inId = sc.next();
				System.out.print("Enter new User PW : ");
				String inPw = sc.next();
				
				usrMnger.addUser(inId, inPw);
			}
			else if (sel == 3) {
				System.out.print("Enter User ID : ");
				String inId = sc.next();
				System.out.print("Enter User PW : ");
				String inPw = sc.next();
				
				usrMnger.withdraw(inId, inPw);
			}
			else if (sel == 0) break;
		}
	}
	
	public void printUserMenu() {
		while (true) {
			System.out.println();
			System.out.println(usrMnger.getIdentifier() + ", using");
			System.out.println("[1. make Account] [2. delete Account] [3. search] [4. Deposit] [5. Withdraw] [0. Log-out]");
			System.out.print("Select menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				
			}
			else if (sel == 2) {
				
			}
			else if (sel == 3) {
				
			}
			else if (sel == 4) {
				
			}
			else if (sel == 5) {
				
			}
			else if (sel == 0) {
				usrMnger.setIdentifier(-1);
				break;
			}
		}
	}
}