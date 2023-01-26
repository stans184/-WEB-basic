package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */
// 1/25 12:38 ~ 12:42
public class LoopEx22_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rm.nextInt(51);
		int score = 100;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("임의의 숫자 num 을 맞추세요 (0 ~ 50 사이) ");
			int ans = sc.nextInt();
			
			if (ans == num) {
				System.out.println("정답입니다. 현재 점수는 " + score + " 입니다.");
				break;
			}
			else if (ans > num) {
				System.out.println("DOWN");
				score -= 5;
			}
			else if (ans < num) {
				System.out.println("UP");
				score -= 5;
			}
				
		}
		
		System.out.println("0점이 되어 종료합니다");
		
		sc.close();
	}

}
