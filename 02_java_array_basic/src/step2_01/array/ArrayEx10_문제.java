package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */

// 1/30 13:38 ~ 13:45
public class ArrayEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		
		while (true) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			if (sel == 0) break;
			
			// 죄다 조건을 걸어서 분류하지 말고
			// 원하는 숫자가 나오면 cnt로 해서 세는 방식은?
			
			else if (sel == 1) {
				for (int i = 0; i < lotto1.length; i++) {
					if (lotto1[i] == 7) {
						if (i+1 < 7 && lotto1[i+1] == 7) {
							if (i+2 < 7 && lotto1[i+2] == 7) {
								System.out.println("당첨입니다!");
							}
						}
					}
				}
			}
			else if (sel == 2) {
				for (int i = 0; i < lotto2.length; i++) {
					if (lotto2[i] == 7) {
						if (i+1 < 7 && lotto2[i+1] == 7) {
							if (i+2 < 7 && lotto2[i+2] == 7) {
								System.out.println("당첨입니다!");
							}
						}
					}
				}
			}
			else if (sel == 3) {
				for (int i = 0; i < lotto3.length; i++) {
					if (lotto3[i] == 7) {
						if (i+1 < 7 && lotto3[i+1] == 7) {
							if (i+2 < 7 && lotto3[i+2] == 7) {
								System.out.println("당첨입니다!");
							}
						}
					}
				}
			}
								
			
		}
		
		scan.close();
		
	}
}
