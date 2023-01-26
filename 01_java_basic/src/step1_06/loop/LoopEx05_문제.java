package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기  버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜        라 : " + colaPrice + "원");
		
		int i = 0;
		int totalPrice = 0;
		int bulCount = 0;
		int shrimpCount = 0;
		int colaCount = 0;
		
		while (i < 5) {
			System.out.print("메뉴 선택 ? ");
			int menuChoice = sc.nextInt();
			
			if (menuChoice == 1) {
				totalPrice += bulgogiBurgerPrice;
				bulCount += 1;
			}
			else if (menuChoice == 2) {
				totalPrice += shrimpBurgerPrice;
				shrimpCount += 1;
			}
			else if (menuChoice == 3) {
				totalPrice += colaPrice;
				colaCount += 1;
			}
			i += 1;
		}
		
		System.out.println("총 금액 : " + totalPrice);
		
		System.out.print("현금 입력 ? ");
		int youCash = sc.nextInt();
		int returnCash = youCash - totalPrice;
		
		if (youCash < totalPrice) {
			System.out.println("금액이 모자랍니다.");
		}else {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기  버거 : " + bulCount + "개");
			System.out.println("2. 새우    버거 : " + shrimpCount + "개");
			System.out.println("3. 콜        라 : " + colaCount + "개");
			System.out.println("4. 총   금   액 : " + totalPrice + "원");
			System.out.println("5. 잔        돈 : " + returnCash + "원");
		}
		
		sc.close();
	}

}
