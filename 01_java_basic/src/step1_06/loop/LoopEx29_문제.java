package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */
public class LoopEx29_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for (int i = 2; i <= num; i++) {
			
			int cnt = 0;				//	 소수 판별을 위한 변수 선
			
			for (int j = 2; j < i; j++) {
				if (i%j == 0) cnt += 1;
			}
			if (cnt == 0) System.out.print(i + " ");
		}
		
		sc.close();
		
	}
	
}