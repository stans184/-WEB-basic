package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */
public class LoopEx14_문제 {
// 1/25 14:25 ~ 14:26
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int maxNum = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the number : ");
			int inNum = scan.nextInt();
			
			if (inNum >= maxNum) {
				maxNum = inNum;
			}
		}
	
		scan.close();

	}

}

