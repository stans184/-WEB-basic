package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계] (for문)
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */


public class LoopEx32_테스트문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int getNumber = sc.nextInt();
		int testNumber = getNumber;
		
		boolean isGo = true;
		
		while (isGo) {
			// 큰 소수르 찾아간다
			int cnt = 0;
			
			for (int i = 2; i < testNumber; i++) {
				if (testNumber%i == 0) cnt += 1;
			}
			
			if (cnt == 0) {
				System.out.println(getNumber + " 보다 큰 첫번째 소수는 " + testNumber);
				break;
			}
			
			testNumber += 1;
		}
		
		sc.close();
		
	}

}
