package step3_01.arrayAdvance;
/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	goal = 4
 * 		x = 1	goal = 2
 * 		x = 2	goal = 1
 * 		x = 3	goal = 3
 * 		x = 4	goal = 0
 */
// step 1 >  분석
// step 2 >  모방, copy
// step 3 >  안보고
import java.util.Scanner;

public class ArrayEx41_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 사다리 구성, 1은 좌우랑 이어져 있고, 0은 안 이어져 있음
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		// 현재 위치
		int x = 0; int y = 0;
		
		// 사다리 출력
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {		// 특수문자 : ㅂ + 한자
				// 0 이면 그냥 아래로 내리긋는 형상
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");
				}
				// 1 이면 위치에 따라 좌 혹은 우측으로 뻗어있는 형상
				else if (ladder[i][j] == 1) {
					if (j != 0 && ladder[i][j-1] == 1) {
						System.out.print("─┤ ");
					}
					else if (j != ladder[i].length - 1 && ladder[i][j+1] == 1){
						System.out.print(" ├─");
					}
				}
			}
			System.out.println();
		}
		// 시작위치 입력
		System.out.print("0~4 입력 : ");
		x = sc.nextInt();
		// ladder 배열이 아래로 내려와있는 만큼 움직여야 함
		for (int i = 0; i < ladder.length; i++) {
			// 0 이면 그냥 아래로 꽂기, y 값 증가
			if (ladder[y][x] == 0) {
				y++;
			}
			// 1 이면 위치에 따라 좌로 혹은 우로 움직이고, 아래로 내려감
			else if (ladder[y][x] == 1) {
				if (x != 0 && ladder[y][x-1] == 1) {
					x--;
				}
				else if(x != 4 && ladder[y][x+1] == 1) {
					x++;
				}
				y++;
			}
		}
		
		System.out.println("destination = " + x);
		//System.out.println("y = " + y);

		sc.close();

	}

}
