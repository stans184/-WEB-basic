package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */
// 1/20 13:10 ~ 13:26
public class LoopEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 로그인
			if (sel == 1) {
				// 로그인 여부 확인
				if (identifier == 1) System.out.println(dbAcc1 + " 님 로그인 중");
				else if (identifier == 2) System.out.println(dbAcc2 + " 님 로그인 중");
				else {
					System.out.print("계좌번호를 입력하세요 : ");
					int inAcc = scan.nextInt();
					// 계좌번호 확인
					if (inAcc == dbAcc1) {
						System.out.print("비밀번호를 입력하세요 : ");
						int inPw = scan.nextInt();
						// acc1 비밀번호 확인
						if (inPw == dbPw1) {
							System.out.println("로그인 성공");
							identifier = 1;
						}else System.out.println("비밀번호를 확인하세요.");
					}else if (inAcc == dbAcc2) {
						System.out.print("비밀번호를 입력하세요 : ");
						int inPw = scan.nextInt();
						// acc1 비밀번호 확인
						if (inPw == dbPw2) {
							System.out.println("로그인 성공");
							identifier = 2;
						}else System.out.println("비밀번호를 확인하세요.");
					}else System.out.println("계좌번호를 확인하세요.");
				}
			}
			// 로그아웃
			else if (sel == 2) {
				if (identifier != -1) {
					System.out.println("로그아웃 되었습니다.");
					identifier = -1;
				}else System.out.println("로그인 후 이용하세요.");
			}
			// 입금
			else if (sel == 3) {
				// 로그인 여부 확인
				if (identifier == 1) {
					System.out.print("입금할 금액을 입력하세요 : ");
					int inMoney = scan.nextInt();
					dbMoney1 += inMoney;
					System.out.println(inMoney + "원 입금되었습니다. 잔액은 " + dbMoney1 + "원 입니다.");
				}else if (identifier == 2) {
					System.out.print("입금할 금액을 입력하세요 : ");
					int inMoney = scan.nextInt();
					dbMoney2 += inMoney;
					System.out.println(inMoney + "원 입금되었습니다. 잔액은 " + dbMoney2 + "원 입니다.");
				}else System.out.println("로그인 후 이용하세요.");
			}
			// 출금
			else if (sel == 4) {
				// 계좌 확인
				if (identifier == 1) {
					System.out.print("출금할 금액을 입력하세요 : ");
					int outMoney = scan.nextInt();
					// 잔액과 비교
					int charge = dbMoney1 - outMoney;
					if (charge >= 0) {
						dbMoney1 -= outMoney;
						System.out.println(outMoney + " 출금합니다. 잔액은 " + dbMoney1 + "입니다.");
					}else System.out.println("계좌 잔액이 부족합니다.");
				}else if (identifier == 2) {
					System.out.print("출금할 금액을 입력하세요 : ");
					int outMoney = scan.nextInt();
					// 잔액과 비교
					int charge = dbMoney2 - outMoney;
					if (charge >= 0) {
						dbMoney2 -= outMoney;
						System.out.println(outMoney + " 출금합니다. 잔액은 " + dbMoney2 + "입니다.");
					}else System.out.println("계좌 잔액이 부족합니다.");
				}else System.out.println("로그인 후 이용하세요.");
			}
			// 이체
			else if (sel == 5) {
				if (identifier == 1) {
					System.out.print("이체할 계좌를 입력하세요 : ");
					int sendAcc = scan.nextInt();
					if (sendAcc == dbAcc2) {
						System.out.print("이체할 금액을 입력하세요 : ");
						int sendMoney = scan.nextInt();
						int charge = dbMoney1 - sendMoney;
						// 잔액 비교
						if (charge >= 0) {
							dbMoney1 -= sendMoney;
							dbMoney2 += sendMoney;
							System.out.println("이체가 완료되었습니다. 잔액은 " + dbMoney1 + "원 입니다.");
						}else System.out.println("계좌 잔액이 부족합니다.");
					}else System.out.println("계좌번호를 확인하세요.");
				}else if (identifier == 2) {
					System.out.print("이체할 계좌를 입력하세요 : ");
					int sendAcc = scan.nextInt();
					if (sendAcc == dbAcc1) {
						System.out.print("이체할 금액을 입력하세요 : ");
						int sendMoney = scan.nextInt();
						int charge = dbMoney2 - sendMoney;
						// 잔액 비교
						if (charge >= 0) {
							dbMoney2 -= sendMoney;
							dbMoney1 += sendMoney;
							System.out.println("이체가 완료되었습니다. 잔액은 " + dbMoney2 + "원 입니다.");
						}else System.out.println("계좌 잔액이 부족합니다.");
					}else System.out.println("계좌번호를 확인하세요.");
				}else System.out.println("로그인 후 이용하세요.");
			}
			// 조희
			else if (sel == 6) {
				if (identifier == 1) System.out.println(dbAcc1 + " 계좌의 잔액은 " + dbMoney1 + "원 입니다.");
				else if (identifier == 2) System.out.println(dbAcc2 + " 계좌의 잔액은 " + dbMoney2 + "원 입니다.");
				else System.out.println("로그인 후 이용하세요.");
			}
			// 종료
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
