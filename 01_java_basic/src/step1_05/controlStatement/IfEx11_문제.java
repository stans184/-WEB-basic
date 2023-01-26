package step1_05.controlStatement;

import java.util.Scanner;
/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */
// 1.18 12:50 ~ 13:00
public class IfEx11_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		System.out.print("주문번호를 입력하세요 ");
		int orderId = scan.nextInt();
		System.out.print("금액를 입력하세요 ");
		int cash = scan.nextInt();
		
		if (orderId == 1) {
			if (cash < price1) {
				System.out.println("need more cash " + (price1 - cash));
			}
			if (cash >= price1) {
				System.out.println("거스름돈은 " + (cash - price1) + " 입니다.");
			}
		}
		if (orderId == 2) {
			if (cash < price2) {
				System.out.println("need more cash " + (price2 - cash));
			}
			if (cash >= price2) {
				System.out.println("거스름돈은 " + (cash - price2) + " 입니다.");
			}
		}
		if (orderId == 3) {
			if (cash < price3) {
				System.out.println("need more cash " + (price3 - cash));
			}
			if (cash >= price3) {
				System.out.println("거스름돈은 " + (cash - price3) + " 입니다.");
			}
		}
		
		scan.close();


	}

}
