package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔   돈		1200
 */

import java.util.Scanner;

class Receipt {
	private String name = "Burger-King";		// 가게 이름
	
	int[] arPrice   = {			   250,		  380,			  150,    100};
	String[] arMenu = {"Cheese Burger", "Whopper", "French-Fried", "Coke"};
	
	int[] arCount = new int[4];
	
	int totalPrice = 0;
	
	void orderCnt(int num) {
		arCount[num-1] += 1;
		totalPrice +=  arPrice[num-1];
	}
	
	String getTotalPrice() {
		return "$"+totalPrice;
	}
	
	String getName() {
		return name;
	}
	
}

public class ClassEx10_문제 {

	public static void main(String[] args) {
		
		Receipt burgerKing = new Receipt();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\t" + burgerKing.getName());
			System.out.println("----------------------");
			System.out.println("1. Cheease Burger : $250");
			System.out.println("2. Whopper        : $380");
			System.out.println("3. French-Fried   : $150");
			System.out.println("4. Coke           : $100");
			System.out.println("5. Quit\n");
			System.out.print("Select the menu : ");
			int selMenu = sc.nextInt();
			
			if (selMenu == 1) burgerKing.orderCnt(selMenu);
			else if (selMenu == 2) burgerKing.orderCnt(selMenu);
			else if (selMenu == 3) burgerKing.orderCnt(selMenu);
			else if (selMenu == 4) burgerKing.orderCnt(selMenu);
			else if (selMenu == 5) {
				System.out.println("Order End, Total Price : " + burgerKing.getTotalPrice());
				break;
			}
			else System.out.println("Wrong menu number, please re-check");
		}
		
		System.out.println();
		System.out.print("Enter the money : ");
		int getMoney = sc.nextInt();
		
		System.out.println();
		System.out.println("\tReceipt\t");
		System.out.println("----------------------");
		System.out.println("Item\t\tQty\t\tPrice");
		for (int i = 0; i < burgerKing.arMenu.length; i++) {
			int price = burgerKing.arPrice[i] * burgerKing.arCount[i];
			System.out.println(burgerKing.arMenu[i] + "\t" + burgerKing.arCount[i] + "\t" + price);
		}
		System.out.println("----------------------");
		System.out.println("Total\t\t" + burgerKing.getTotalPrice());
		System.out.println("Received\t\t" + getMoney);
		System.out.println("----------------------");
		int returnMoney = getMoney - burgerKing.totalPrice;
		if (returnMoney < 0) System.out.println("You need to pay more!");
		else System.out.println("return\t\t" + returnMoney);
		
		sc.close();
	}
}