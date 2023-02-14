package step6_02.method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */
class MovieCenter{
	Scanner sc = new Scanner(System.in);
	
	String name = "MEGABOX";
	int[] seat = new int[10];
	int bookCnt;
	
	void showInfo() {
		System.out.println("======== " + name + " =========");
		System.out.println("seat status");
		System.out.print("[");
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) System.out.print("O ");
			else System.out.print("X ");
		}
		System.out.println("]");
		System.out.println("1. reservation");
		System.out.println("2. exit");
	}
	
	void book(int num) {
		if (seat[num] == 0) {
			seat[num] = 1;
			bookCnt += 1;
		}
		else System.out.println("Already reservation seat");
	}
	
	void checkIncome() {
		System.out.println("sales : " + bookCnt*12000);
	}
	
	void run() {
		while (true) {
			showInfo();
			
			if (bookCnt == 10) {
				System.out.println("All seat reserved");
				checkIncome();
				break;
			}
			System.out.print("Select the menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.print("Select seat number : ");
				int seatNum = sc.nextInt();
				book(seatNum-1);
			}
			else if (sel == 2) {
				System.out.println("Theater closed");
				checkIncome();
				break;
			}
		}
	}
}

public class MethodEx14_풀이1 {

	public static void main(String[] args) {
		
		MovieCenter mc = new MovieCenter();
		mc.run();
	}
}
