package step3_01.arrayAdvance;
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
public class ArrayEx43_풀이1 {
// 23.02.02 62번줄에서 Out of Bound error 발생, 도저히 모르겠어서 일단 넘어감, 나중에 다시할때 확인
	public static void main(String[] args) {
		
		int[][] map = new int[5][5];
		boolean[][] check = new boolean[5][5];
		
		int x = 0;
		int y = 0;
		
		int num = 1;
		int dir = 1;
		
		map[y][x] = num;
		check[y][x] = true;
		
		for (int i = 0; i < 24; i++) {
			
			int xp = x;
			int yp = y;
			
			if (dir == 1) xp += 1;
			else if (dir == 2) yp += 1;
			else if (dir == 3) xp -= 1;
			else if (dir == 4) yp -= 1;
			// if 조건식이 잘못걸림
			if (xp < 0 || xp > 4 || yp < 0 || yp > 4 || check[yp][xp] == true) {
				dir += 1;
				if (dir == 5) dir = 1;
				
				xp = x;
				yp = y;
				
				if (dir == 1) xp += 1;
				else if (dir == 2) yp += 1;
				else if (dir == 3) xp -= 1;
				else if (dir == 4) yp -= 1;
			}
			
			x = xp;
			y = yp;
			
			System.out.println(i +  " = " + x + ", " + y);
			
			num += 1;
			map[y][x] = num;
			check[y][x] = true;
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print("\t" + map[i][j]);
			}
			System.out.println();
		}
	}
}