package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

// # 소코반
// 장애물을 설치하고
// 목표물을 밀어내서 골 지점에 넣는 문제

public class ArrayEx47_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		// map size
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// 벽 설치
		System.out.print(">>>설치할 벽의 개수를 입력하세요 : ");
		wallCount = sc.nextInt();
		
		int temp = wallCount;
		while (temp != 0) {
			// map size 안에서 랜덤넘버를 뽑고
			int rY = rm.nextInt(SIZE);
			int rX = rm.nextInt(SIZE);
			// 해당 부분이 비어있다면
			if (map[rY][rX] == 0) {
				// 그곳에 벽을 넣고
				map[rY][rX] = WALL;
				// 넣어야 하는 벽의개수를 하나 줄임
				temp = temp - 1;
			}
		}
		
		// 공 설치
		while (true) {
			// 벽 끝에 있으면 플레이어가 밀어낼 수 없으니까 그 안의 범위에서 랜덤하게 위치를 뽑고
			int rY = rm.nextInt(SIZE - 2) + 1;
			int rX = rm.nextInt(SIZE - 2) + 1;
			// 그 부분이 비어있다면 공을 넣는다
			if(map[rY][rX] == 0) {
				map[rY][rX] = BALL;
				ballY = rY;
				ballX = rX;
				break;
			}
		}
		
		// 골대 설치
		while (true) {
			int rY = rm.nextInt(SIZE);
			int rX = rm.nextInt(SIZE);
			
			if (map[rY][rX] == 0) {
				map[rY][rX] = GOAL;
				goalY = rY;
				goalX = rX;
				break;
			}
		}
		
		// 화면 출력
//		for (int i = 0; i < SIZE; i++) {
//			for (int j = 0; j < SIZE; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 플레이어 배치
		while (true) {
			System.out.println(">>>플레이어의 위치를 선택하세요.");
			System.out.print("y좌표 입력 : ");
			pY = sc.nextInt();
			
			System.out.print("x좌표 입력 : ");
			pX = sc.nextInt();
			
			if (map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		
		// 게임 시작
		while (true) {
			// 화면 출력
			System.out.println("---------------");
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (map[i][j] == PLAYER) 	System.out.print("P ");
					else if(map[i][j] == WALL) 	System.out.print("! ");
					else if(map[i][j] == GOAL) 	System.out.print("G ");
					else if(map[i][j] == BALL) 	System.out.print("o ");
					else 						System.out.print("_ ");
				}
				System.out.println();
			}
			System.out.println("---------------");
			
			// 골대에 공을 넣으면 게임 종료
			if (ballY == goalY && ballX == goalX) {
				System.out.println("게임종료");
				break;
			}
			
			System.out.print("상(1)하(2)좌(3)우(4) 입력 : ");
			int move = sc.nextInt();
		
			// 현재위치 저장하기
			int yy = pY;
			int xx = pX;
			// input 값에따라 임의 위치로 빼논 값 변경
			if		(move == 1) yy--;
			else if (move == 2) yy++;
			else if (move == 3) xx--;
			else if (move == 4) xx++;
			
			// 벽 끝까지 닿거나, 벽을 만나거나, 골대를 만나면 예외처리
			if (SIZE <= xx || xx < 0) 					 	continue;
			if (SIZE <= yy || yy < 0) 					 	continue;
			if (map[yy][xx] == WALL || map[yy][xx] == GOAL) continue;
			
			// 공을 만나면
			if (map[yy][xx] == BALL) {
				// 공의 위치도 임의 값으로 백업하고
				int yyy = ballY;
				int xxx = ballX;
				// 입력한 값 = 진행하려는 값에 따라서 공의 위치도 이동, 밀어내기니까
				if		(move == 1) yyy--;
				else if (move == 2) yyy++;
				else if (move == 3) xxx--;
				else if (move == 4) xxx++;

				// 벽에 닿거나, 벽을 만나면 예외처리
				if (SIZE <= xxx || xxx < 0) continue;
				if (SIZE <= yyy || yyy < 0) continue;
				if (map[yyy][xxx] == WALL)  continue;
				
				// 공 이동시키기
				// 원래 있던데 0 으로 만들고
				map[ballY][ballX] = 0;
				// 예외로 빠지지 않은 새로운 위치값 넣어주고
				ballY = yyy;
				ballX = xxx;
				// 그 위치로 공 이동시키기
				map[ballY][ballX] = BALL;
			}
			
			// 캐릭터 이동시키기
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
			
		}

		sc.close();
		
	}

}
