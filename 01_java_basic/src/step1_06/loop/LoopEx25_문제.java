package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */
// 1/25 13:25 ~ 13:27
public class LoopEx25_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maxNum = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int inNum = sc.nextInt();
			
			if (inNum >= maxNum) {
				maxNum = inNum;
			}
			
		}
		
		System.out.println("가장 큰 수는 " + maxNum + " 입니다.");
		
		sc.close();
	}

}
