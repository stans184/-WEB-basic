package step3_01.arrayAdvance;

import java.util.Scanner;

// 빙글빙글 도는 문제
/*
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 */
// 한번에 풀림, 풀이는 다음에
public class ArrayEx42_문제복기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int Rock = 99;
		int[][] map = {
				{1,    2,   3,   4,   5,6},
				{20,Rock,Rock,Rock,Rock,7},
				{19,Rock,Rock,Rock,Rock,8},
				{18,Rock,Rock,Rock,Rock,9},
				{17,Rock,Rock,Rock,Rock,10},
				{16,  15,  14,  13,  12,11}
		};
		
		int playerPosition = 1;
		
		while (true) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == playerPosition) 	System.out.print("P");
					else if (map[i][j] == Rock) 		System.out.print("ㅁ");
					else 								System.out.print("_");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("Enter the number (1~3) : ");
			int mv = sc.nextInt();
			
			playerPosition += mv;
			
			playerPosition %= 21;
		}
	}

}
