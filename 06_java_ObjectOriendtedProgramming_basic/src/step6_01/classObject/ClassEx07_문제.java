package step6_01.classObject;
/*
 * # 영화관 좌석예매 : 클래스 + 변수
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

import java.util.Arrays;
import java.util.Scanner;

class Theater {

	int[] seat = new int[7];
	int money = 0;
	int bookCnt = 0;
	
	public void reservation(int num) {
		if (seat[num] == 0) {
			System.out.println(num + "번 자리 예매되었습니다.");
			seat[num] += 1;
			bookCnt += 1;
		}
		else System.out.println("해당 자리는 이미 예매되었습니다.");
	}
}

public class ClassEx07_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Theater theater = new Theater();
		
		while (true) {
			System.out.println();
			if (theater.bookCnt != 0) System.out.println(Arrays.toString(theater.seat));
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			if (theater.bookCnt == 7) {
				System.out.println("매진되었습니다.");
				System.out.println("영화관의 매출은 " + 12000*theater.bookCnt + "원 입니다.");
				break;
			}
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				if (theater.bookCnt < 7) {
					System.out.print("원하는 자리의 인덱스를 입력하세요 : ");
					int inIdx = sc.nextInt();
					
					theater.reservation(inIdx);
				}
			}
			else if (sel == 2) {
				System.out.println("판매가 종료되었습니다.");
				System.out.println("현재까지 매출은 " + 12000*theater.bookCnt + "원 입니다.");
				break;
			}
		}
		sc.close();
	}
}