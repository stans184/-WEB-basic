package step3_01.arrayAdvance;

import java.util.Arrays;
/*
 * # 달팽이
 * 
 * 1	2	3	4	5	
 * 16	17	18	19	6	
 * 15	24	25	20	7	
 * 14	23	22	21	8	
 * 13	12	11	10	9
 * 
 * 
 * 1) 오른쪽 방향으로 순서대로 숫자저장
 * 2) 아래쪽 방향으로 순서대로 숫자저장
 * 3) 왼쪽 방향으로 순서대로 숫자저장
 * 4) 윗쪽 방향으로 순서대로 숫자저장
 * 
 * 1)2)3)4) 반복
 */
public class ArrayEx43_문제복기 {

	public static void main(String[] args) {
		
		int[][] map = new int[5][5];
		boolean[][] check = new boolean[5][5];
		
		int x = 0;
		int y = 0;
		
		int num = 1;
		int direction = 1;
		
		map[y][x] = num;
		check[y][x] = true;
		
		for (int i = 0; i < 24; i++) {
			
			int moveX = x;
			int moveY = y;
			
			if (direction == 1) moveX += 1;
			else if (direction == 2) moveY += 1;
			else if (direction == 3) moveX -= 1;
			else if (direction == 4) moveY -= 1;
			
			if (moveX < 0 || moveX > 4 || moveY < 0 || moveY > 4 || check[moveY][moveX] == true) {
				direction += 1;
				if (direction == 5) direction = 1;
				
				moveX = x;
				moveY = y;
				
				if (direction == 1) moveX += 1;
				else if (direction == 2) moveY += 1;
				else if (direction == 3) moveX -= 1;
				else if (direction == 4) moveY -= 1;
			}
			
			num += 1;
			x = moveX;
			y = moveY;
			
//			System.out.println(i +  " = " + x + ", " + y);
			map[y][x] = num;
			check[y][x] = true;
		}
		
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
	}
}