package step3_01.arrayAdvance;

import java.util.Scanner;

// #오목

public class ArrayEx44_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 오목판의 사이즈
		int size = 10;
		// 오목판을 초기화
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		// 플레이어가 놓는 위치 초기화
		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;
		// 누구의 순서인지
		int turn = 0;
		// 누가 이겼는지
		int win = 0;
		
		while (true) {
			
			// 전체화면 출력
			System.out.println(" ==== OMOK GAME ====");
			System.out.print("  ");
			// x 방향으로 좌표를 표기
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			// y 방향으로 좌표를 표기하면서 오목판을 보여줌
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
				for (int j = 0; j < size; j++) {
					System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}

			// 승리 판정내면서 게임 종료
			if (win == 1) {
				System.out.println("p1승리");
				break;
			} 
			else if (win == 2) {
				System.out.println("p2승리");
				break;
			}

			
			// 바둑알 두기
			if (turn % 2 == 0) {
				System.out.println("[p1차례]");
				System.out.print("Y좌표 입력 : ");
				p1Y = sc.nextInt();
				System.out.print("X좌표 입력 : ");
				p1X = sc.nextInt();
				if (omok[p1Y][p1X] == 0) {
					omok[p1Y][p1X] = 1;
					turn += 1;
				}
			} 
			else if (turn % 2 == 1) {
				System.out.println("[p2차례]");
				System.out.print("Y좌표 입력 : ");
				p2Y = sc.nextInt();
				System.out.print("X좌표 입력 : ");
				p2X = sc.nextInt();
				if (omok[p2Y][p2X] == 0) {
					omok[p2Y][p2X] = 2;
					turn += 1;
				}
			}

			// 가로검사
			for (int i = 0; i < size; i++) {
				// 4개가 같은 수여야 하니 10 개중 4개를 묶을 수 있는 6개로 나눠서 반복
				for (int j = 0; j < size - 4; j++) {
					// 가로방향으로 i 부터 i+3 까지 증가하면서 같은 값은지 확인
					if (omok[i][j] == 1 && omok[i][j + 1] == 1 && omok[i][j + 2] == 1 && omok[i][j + 3] == 1 && omok[i][j + 4] == 1) win = 1;				
					if (omok[i][j] == 2 && omok[i][j + 1] == 2 && omok[i][j + 2] == 2 && omok[i][j + 3] == 2 && omok[i][j + 4] == 2) win = 2;					
				}
			}

			// 세로검사
			// 4개가 같은 수여야 하니, 10개 - 4개 한 6개에서 반복
			for (int i = 0; i < size - 4; i++) {
				// 10개의 가로 방향으로 하나씩 옮겨가면서
				for (int j = 0; j < size ; j++) {
					// 세로 방향으로 i 부터 i+3 까지 증가하면서 같은 값인지 확인
					if (omok[i][j] == 1 && omok[i + 1][j] == 1 && omok[i + 2][j] == 1 && omok[i + 3][j] == 1 && omok[i + 4][j] == 1) win = 1;				
					if (omok[i][j] == 2 && omok[i + 1][j] == 2 && omok[i + 2][j] == 1 && omok[i + 3][j] == 1 && omok[i + 4][j] == 1) win = 2;				
				}
			}

			// 대각선 검사
			// 왼쪽 위에서 오른쪽 아래로
			// 대각선 검사도 4개가 동일값이어야 하니, 가로 세로 모두 6개로 범위를 한정짓고
			for (int i = 0; i < size - 4; i++) {
				for (int j = 0; j < size - 4; j++) {
					// i*j 부터 i+3*j+3 까지 검사
					if (omok[i][j] == 1 && omok[i + 1][j + 1] == 1 && omok[i + 2][j + 2] == 1 && omok[i + 3][j + 3] == 1 && omok[i + 4][j + 4] == 1)  win = 1;					
					if (omok[i][j] == 2 && omok[i + 1][j + 1] == 2 && omok[i + 2][j + 2] == 2 && omok[i + 3][j + 3] == 2  && omok[i + 4][j + 4] == 2) win = 2;				
				}
			}
			
			// 왼쪽 아래에서 오른쪽 위로
			// 대각선의 반대 방향으로 검사 9 ~ 4까지
			for (int i = 9; i > size - 7; i--) {
				for (int j = 0; j < size - 4; j++) {
					if (omok[i][j] == 1 && omok[i - 1][j + 1] == 1 && omok[i - 2][j + 2] == 1 && omok[i - 3][j + 3] == 1 && omok[i - 4][j + 4] == 1) win = 1;
					if (omok[i][j] == 2 && omok[i - 1][j + 1] == 2 && omok[i - 2][j + 2] == 2 && omok[i - 3][j + 3] == 2 && omok[i - 4][j + 4] == 2) win = 2;
				}
			}
		}
 
		sc.close();

	}

}
