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


public class LoopEx04_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int i = 0;
		int score = 0;
		
		while (i < 5) {
			int num1 = rm.nextInt(9) +1;
			int num2 = rm.nextInt(9) +1;
			int ans = num1 * num2;
			
			System.out.print(num1 + " * " + num2 + " = ? ");
			int yourAns = sc.nextInt();
			
			if (yourAns == ans) {
				score += 20;
			}
			
			i += 1;
		}
		
		System.out.println("점수는 " + score);
		
		sc.close();
	}

}
