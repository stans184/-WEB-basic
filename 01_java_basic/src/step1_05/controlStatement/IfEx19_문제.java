package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_문제 {
// 1/18 14:42 ~ 14:46
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호를 입력하세요 ");
		int myAcc = scan.nextInt();
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		if (myAcc == yourAcc) {
			System.out.print("이체할 금액을 입력하세요 ");
			int deliMoney = scan.nextInt();
			if (deliMoney <= myMoney) {
				myMoney -= deliMoney;
				yourMoney += deliMoney;
				System.out.println("myMoney = " + myMoney + "원");
				System.out.println("yourMoney = " + yourMoney + "원");
			}
			else {
				System.out.println("잔액부족, 이체불가");
			}
		}else {
			System.out.println("Account missmatch");
		}
		
		scan.close();
		
	
	}

}
