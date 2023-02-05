package step3_01.arrayAdvance;
// 빙글빙글 도는 문제
import java.util.Scanner;
/*
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 */
public class ArrayEx42_문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// road 변수는 변경하기 싫다?
		// final 을 통해 고정 변수로 입력
		final int ROAD = 20;
		// 돌아가야 하는 길을 map array 를 통해 표현, 번호순서대로 따라가면 됨
		int[][] map = {
			{0,   1,  2,  3, 4},	
			{15, 20, 20, 20, 5},
			{14, 20, 20, 20, 6},
			{13, 20, 20, 20, 7},
			{12, 11, 10,  9, 8}
		};
		// player 의 현재위치를 나타냄
		int player = 0;
		// 무한반복
		while(true) {
			
			// 화면출력
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					// road, 못가는 길은 고정된 final int 로 표기하고,항상 일정한 데이터를 출력
					if (map[i][j] == ROAD) 		  	System.out.print("■ ");
					// player 가 있는 위치를 확인해서 p로 출력
					else if (map[i][j] == player) 	System.out.print("P ");
					// player 가 없는 길은 동일하게 표기
					else 							System.out.print("□ ");
				}
				System.out.println();
			}
			System.out.println();

			
			// 입력받기
			System.out.print("1~3을 입력하세요 : ");
			int move = sc.nextInt();
			// 입력된 값을 player 위치에다가 더하
			player += move;
			// 1~15 까지가 길이니까, 16으로 나눈 값으로 player data 를 수정하면 그게 player 의 위치가 됨
			player %= 16;
			
		}
	}

}
