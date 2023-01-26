package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_문제 {

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rm.nextInt(100)+1;
		
		System.out.println(num);
		int score = 100;
		int ans = 0;
		
		while (true) {
			System.out.print("정답을 입력하세요 ");
			ans = sc.nextInt();
			
			if (ans == num) {
				System.out.println("정답입니다.");
				System.out.println("현재 점수는 " + score + "입니다.");
				break;
			}
			else {
				System.out.println("오답입니다.");
				score -= 5;
				System.out.println("현재 점수는 " + score + "입니다.");
				if (score == 0) {
					System.out.println("게임이 종료됩니다.");
					break;
				}
			}
			
		}
		
		sc.close();
		
	}

}
