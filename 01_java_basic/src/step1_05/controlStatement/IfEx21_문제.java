package step1_05.controlStatement;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		int num = rm.nextInt(50) + 1;
		
		System.out.println(num);
		
		int numBig = num/10;
		int numSmall = num%10;
		
		int cnt = 0;
		
		if (numBig == 3 || numBig == 6 || numBig == 9) {
			cnt += 1;
		}
		if (numSmall == 3 || numSmall == 6 || numSmall == 9) {
			cnt += 1;
		}
		
		if (cnt == 2) System.out.println("짝짝");
		else if (cnt == 1) System.out.println("짝");
		else System.out.println(num);
	
		
	}

}
