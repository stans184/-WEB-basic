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
			
			for (int z = 0; z < game.length; z++) {
				if (game[z] == 1) System.out.print("[O]");
				else if (game[z] == 2) System.out.print("[X]");
				else System.out.print("[ ]");
				if ((z+1)%3 == 0) System.out.println();
			}
			// 승리자 판별
			int winner = 0;
			
			for (int k = 0; k <= 6; k+=3) {
				if (game[k] == game[k+1] && game[k] == game[k+2]) {
					if (game[k] == 1) winner = 1;
					else if (game[k] == 2) winner = 2;
				}
			}
			
			for (int k = 0; k < 3; k++) {
				if (game[k] == game[k+3] && game[k] == game[k+6]) {
					if (game[k] == 1) winner = 1;
					else if (game[k] == 2) winner = 2;
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
			
			if (winner == 1) {
				System.out.println("Winner is 'Player 1'");
				break;
			}
			else if (winner == 2) {
				System.out.println("Winner is 'Player 2'");
				break;
			}
		}
		
		
		sc.close();
	}
		
}
