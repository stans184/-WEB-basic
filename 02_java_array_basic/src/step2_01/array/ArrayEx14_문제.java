package step2_01.array;

import java.util.Scanner;
   


/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		int player = 0;
		
		while (true) {
			// player 현재 위치 출력 방식 
			// __________옷____
			for (int num : game) {
				if (num == 2) System.out.print("P");
				else System.out.print("_");
			}
			System.out.println();
			
			System.out.print("Left (1), Right (2), Exit (3) -> ");
			int destination = sc.nextInt();
			
			if (destination == 3) {
				System.out.println("Exit");
				break;
			}
			else if (destination == 1) {
				// 현재 p 위치를 파악하고
				for (int i = 0; i < game.length; i++) {
					if (game[i] == 2 && (i-1) >= 0) {
						game[i] = 0;
						game[i-1] = 2;
						break;
					}
				}
				
				// index 하나 뺀 위치에다가 P를 넣고
				// 원래 P 위치는 0으로 대체
			}
			else if (destination == 2) {
				for (int i = 0; i < game.length; i++) {
					if (game[i] == 2 && (i+1) <= 14) {
						game[i] = 0;
						game[i+1] = 2;
						break;
					}
				}
			}
		}
		
		sc.close();
	}
	
}
