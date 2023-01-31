package step2_01.array;
/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 */

import java.util.Scanner;

public class ArrayEx17_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[9];
		
		int playerCnt = 1;
		
		System.out.println("Player 1 : [O], Player 2 : [X]");
		
		for (int i = 0; i < game.length; i++) {
			if (playerCnt == 1) {
				System.out.print("[p1]인덱스 입력 : ");
				int p1In = sc.nextInt() - 1;
				
				if (game[p1In] != 2) game[p1In] = 1;
				
				playerCnt += 1;
			}
			else if (playerCnt == 2) {
				System.out.print("[p2]인덱스 입력 : ");
				int p2In = sc.nextInt() - 1;
				
				if (game[p2In] != 1) game[p2In] = 2;
				
				playerCnt -= 1;
			}
		}
		
		// 승리자 판별
		int winner = 0;
		// (1,2,3) (4,5,6) (7,8,9) (1,4,7) (2,5,8) (3,6,9) (1,5,9) (3,5,7)
		// 0 1 2
		// 3 4 5
		// 6 7 8
		for (int i = 0; i <= 6; i+=3) {
			if (game[i] == game[i+1] && game[i] == game[i+2]) {
				if (game[i] == 1) winner = 1;
				else if (game[i] == 2) winner = 2;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (game[i] == game[i+3] && game[i] == game[i+6]) {
				if (game[i] == 1) winner = 1;
				else if (game[i] == 2) winner = 2;
			}
		}
		
		if (game[0] == game[4] && game[4] == game[8]) {
			if (game[0] == 1) winner = 1;
			else if (game[0] == 2) winner = 2;
		}		
		
		if (game[2] == game[4] && game[4] == game[6]) {
			if (game[2] == 1) winner = 1;
			else if (game[2] == 2) winner = 2;
		}		
		
		// 게임 종료된 테이블 출력
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 1) System.out.print("[O]");
			else System.out.print("[X]");
			if ((i+1)%3 == 0) System.out.println();
		}
		System.out.println();
		
		if (winner == 1) System.out.println("Winner is Player 1");
		else if (winner == 2) System.out.println("Winner is Player 2");
		else System.out.println("DRAW");
	}
		
}
