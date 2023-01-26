package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */
// 1/20 12:50 ~ 13:07
public class LoopEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("입금할 금액을 입력하세요 : ");
				int inMoney = scan.nextInt();
				myMoney += inMoney;
				System.out.println(myAcc + " 계좌 잔액은 " + myMoney + "입니다.");
			}
			else if (selectMenu == 2) {
				System.out.print("출금할 금액을 입력하세요 : ");
				int outMoney = scan.nextInt();
				int charge = myMoney - outMoney;
				if (charge < 0) System.out.println("잔액이 부족합니다.");
				else {
					System.out.println(outMoney + "만큼 출금합니다, 잔액은 " + charge + "입니다.");
					myMoney -= outMoney;
				}
			}
			else if (selectMenu == 3) {
				System.out.print("송금할 계좌를 입력하세요 : ");
				int inAcc = scan.nextInt();
				if (inAcc == yourAcc) {
					System.out.print("송금할 금액을 입력하세요 : ");
					int sendMoney = scan.nextInt();
					int charge = myMoney - sendMoney;
					if (charge < 0) System.out.println("잔액이 부족합니다.");
					else {
						System.out.println(sendMoney + " 만큼 송금합니다, 잔액은 " + charge + "입니다.");
						myMoney -= sendMoney;
						yourMoney += sendMoney;
						System.out.println(yourAcc + " 계좌의 잔액은 " + yourMoney + "입니다.");
					}
				}else System.out.println("계좌번호를 확인하세요.");
			}
			else if (selectMenu == 4) {
				System.out.println("잔액을 조회합니다.");
				System.out.println(myAcc + " 계좌의 잔액은 " + myMoney + " 입니다.");
				System.out.println(yourAcc + " 계좌의 잔액은 " + yourMoney + " 입니다.");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
