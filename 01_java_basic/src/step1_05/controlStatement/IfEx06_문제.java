package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_문제 {
//1/17 14:22 ~ 14:26
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 a를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("숫자 b를 입력하세요 : ");
		int b = scan.nextInt();
		int ans = a*b;
		System.out.println("a x b = ?");
		System.out.print("정답을 입력하세요 : ");
		
		int ansIn = scan.nextInt();
		
		if (ansIn == ans) {
			System.out.println("정답");
		}
		if (ansIn != ans) {
			System.out.println("땡");
		}
		
		scan.close();
	}

}
