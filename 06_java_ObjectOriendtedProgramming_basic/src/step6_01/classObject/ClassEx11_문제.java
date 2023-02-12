package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;

class ATM{
	String name = "Shin-Han Bank";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
	
	void join(String acc, String pw) {
		
		if (accCnt > 0) {
			int duplCheck = -1;
			
			for (int i = 0; i < accCnt; i++) {
				if (arAcc[i].equals(acc)) duplCheck = i;
			}
			
			if (duplCheck != -1) System.out.println(acc + "는 중복된 계좌입니다.");
			else {
				System.out.println(acc + " 계좌 가입되었습니다.");
				arAcc[accCnt] = acc;
				arPw[accCnt] = pw;
				arMoney[accCnt] += 1000;
				accCnt += 1;
			}
		}
		else {
			System.out.println(acc + "계좌 가입되었습니다.");
			arAcc[accCnt] = acc;
			arPw[accCnt] = pw;
			arMoney[accCnt] += 1000;
			accCnt += 1;
		}
		System.out.println();
	}
	
	void withdrawal() {
		if (identifier == -1) System.out.println("로그인 후 이용하세요.");
		else {
			if (accCnt == 1) {
				System.out.println(arAcc[identifier] + "님 탈퇴되었습니다.");
				arAcc[identifier] = null;
				arPw[identifier] = null;
				accCnt -= 1;
				identifier = -1;
			}
			else {
				String[] tmpAcc = new String[5];
				String[] tmpPw = new String[5];
				
				for (int i = 0; i < identifier; i++) {
					tmpAcc[i] = arAcc[i];
					tmpPw[i] = arPw[i];
				}
				for (int i = identifier; i < tmpPw.length-1; i++) {
					tmpAcc[i] = arAcc[i+1];
					tmpPw[i] = arPw[i+1];
				}
				System.out.println(arAcc[identifier] + "님 탈퇴되었습니다.");
				accCnt -= 1;
				identifier = -1;
				arAcc = tmpAcc;
				arPw = tmpPw;
			}
		}
	}
	
	void logIn(String acc, String pw) {
		int checkIdx = -1;
		
		for (int i = 0; i < arAcc.length; i++) {
			if (acc.equals(arAcc[i])) checkIdx = i;
		}
		
		if (checkIdx == -1) System.out.println("등록된 계좌가 아닙니다.");
		else {
			if(!pw.equals(arPw[checkIdx])) System.out.println("비밀번호가 다릅니다.");
			else {
				System.out.println(arAcc[checkIdx] + "님 로그인 되었습니다.");
				identifier = checkIdx;
			}
		}
		System.out.println();
	}
	
	void logOut() {
		if (identifier == -1) System.out.println("로그인 후 이용하세요.");
		else {
			System.out.println(arAcc[identifier] + "님 로그아웃 되었습니다.");
			identifier = -1;
		}
		System.out.println();
	}
	
	void deposit(int money) {
		if (identifier == -1) System.out.println("로그인 후 이용하세요.");
		else {
			arMoney[identifier] += money;
			System.out.println(arAcc[identifier] + "님 계좌로 " + money + "입금되어 잔액은 " + arMoney[identifier] + "입니다.");
		}
		System.out.println();
	}
	
	void transfer(String acc, int money) {
		if (identifier == -1) System.out.println("로그인 후 이용하세요.");
		else {
			if (arMoney[identifier] < money) System.out.println(arAcc[identifier] + "님 잔액이 부족합니다.");
			else {
				int toIdx = -1;
				
				for (int i = 0; i < arAcc.length; i++) {
					if (acc.equals(arAcc[i])) toIdx = i;
				}
				
				if (toIdx == -1) System.out.println("계좌번호가 조회되지 않습니다.");
				else {
					arMoney[identifier] -= money;
					arMoney[toIdx] += money;
					System.out.println(arAcc[toIdx] + "님에게 " + money + "송금되었습니다.");
					System.out.println(arAcc[identifier] + "님 잔액은 " + arMoney[identifier] + "입니다.");
				}
			}
		}
		System.out.println();
	}
	
	void check() {
		if (identifier == -1) System.out.println("로그인 후 이용하세요.");
		else {
			System.out.println("Account\t\tMoney");
			System.out.println(arAcc[identifier] + "\t\t" + arMoney[identifier]);
		}
		System.out.println();
	}
}

public class ClassEx11_문제 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		
		while (true) {
			
			System.out.print("[" + atm.name + "]");
			if (atm.identifier != -1) System.out.println("\t"+atm.arAcc[atm.identifier] + "님 로그인 ");
			else System.out.println();
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				System.out.print("Enter the Account\t: ");
				String inAcc = sc.next();
				System.out.print("Enter the Pssword\t: ");
				String inPw = sc.next();
				atm.join(inAcc, inPw);
			}
			else if (sel == 2) atm.withdrawal();
			else if (sel == 3) {
				System.out.print("Enter the Account\t: ");
				String inAcc = sc.next();
				System.out.print("Enter the Pssword\t: ");
				String inPw = sc.next();
				atm.logIn(inAcc, inPw);
			}
			else if (sel == 4) atm.logOut();
			else if (sel == 5) {
				System.out.print("Enter deposit money\t: ");
				int inMoney = sc.nextInt();
				atm.deposit(inMoney);
			}
			else if (sel == 6) {
				System.out.print("Enter the Account\t: ");
				String toAcc = sc.next();
				System.out.print("Enter transfer money\t: ");
				int toMoney = sc.nextInt();
				atm.transfer(toAcc, toMoney);
			}
			else if (sel == 7) atm.check();
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}		
		sc.close();
	}
}