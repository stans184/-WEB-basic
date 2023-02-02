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

public class ArrayEx41_문제복기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0)	System.out.print(" │ ");
				else if (ladder[i][j] == 1) {
					if (j != ladder[i].length - 1 && ladder[i][j+1] == 1) {
						System.out.print(" ├─");
					}
					else if (j != 0 && ladder[i][j-1] == 1) {
						System.out.print("─┤ ");
					}
				}
			}
		}
		System.out.println();
		int startPo = sc.nextInt();
		
		
		
	}
}
