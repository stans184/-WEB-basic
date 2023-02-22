package step9_01.atm_v1_ex1;
//- 메뉴출력 및 입력
//- 로그인
//- 회원가입
//- 회원탈퇴
//- 종료
import java.util.Scanner;

public class ATM {

	Scanner sc = new Scanner(System.in);
	UserManager usrMnger = UserManager.getInstance();

	public void printATMMenu() {
		
		while (true) {
			System.out.println();
			System.out.println("[IT ATM]");
			System.out.println("[1. Log-in] [2. Join] [3. Withdraw] [0. Quit]");
			System.out.print("Select the menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.print("Enter User ID : ");
				String inId = sc.next();
				System.out.print("Enter User PW : ");
				String inPw = sc.next();
				
				usrMnger.logIn(inId, inPw);
				if (usrMnger.getIdentifier() != -1) printUserMenu();
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
		
		var accMng = new AccountManager();
		
		while (true) {
			System.out.println();
			System.out.println(usrMnger.userList.get(usrMnger.getIdentifier()).getUserId() + ", using");
			System.out.println("[1. make Account] [2. delete Account] [3. search] [4. Deposit] [5. Withdraw] [0. Log-out]");
			System.out.print("Select menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				accMng.makeAccount();
			}
			else if (sel == 2) {
				System.out.print("Enter Account Number to delete : ");
				int inAcc = sc.nextInt();
				accMng.deleteAccount(inAcc);
			}
			else if (sel == 3) {
				System.out.println(usrMnger.userList.get(usrMnger.getIdentifier()).getUserId() + " Account List");
				accMng.printAccountList();
			}
			else if (sel == 4) {
				System.out.print("Enter Account Number : ");
				int inAcc = sc.nextInt();
				System.out.print("How much money ? ");
				int inMoney = sc.nextInt();
				
				accMng.deposit(inAcc, inMoney);
			}
			else if (sel == 5) {
				System.out.print("Enter Account Number : ");
				int outAcc = sc.nextInt();
				System.out.print("How much money ? ");
				int outMoney = sc.nextInt();
				
				accMng.deposit(outAcc, outMoney);
			}
			else if (sel == 0) {
				System.out.println(usrMnger.userList.get(usrMnger.getIdentifier()).getUserId() + ", log out");
				// 로그인 했던 유저의 accList 를 반환하기 (2개 방법)
				// [1] usrMnger.userList.get(usrMnger.getIdentifier()).setAccountList(accMng.getUsrAccList());
				/* [2] */ accMng.returnAccList();
				usrMnger.setIdentifier(-1);
				break;
			}
		}
	}
}