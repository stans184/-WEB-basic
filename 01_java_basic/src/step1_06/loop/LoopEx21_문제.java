package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */
// 1/25 12:34 ~ 12:36
public class LoopEx21_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		
		for (int i = 0; i < 5 ; i++) {
			int a = rm.nextInt(10);
			int b = rm.nextInt(10);
			int multi = a*b;
			
			System.out.print(a + " 곱하기 " + b + " = ? ");
			int ans = sc.nextInt();
			if (ans == multi) {
				System.out.println("정답입니다.");
				score += 20;
			}else System.out.println("오답입니다.");
		}
		
		System.out.println("최종 점수는 "+ score + " 입니다.");
		
		sc.close();
		
	}

}
