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
public class ArrayEx43_문제 {

	public static void main(String[] args) {
		
		// 한 변의 크기를 미리 선언
		int size = 5;
		// 달팽이 게임이 진행될 map 선언
		int[][] map = new int[5][5];
		// 숫자가 들어있는지 보기 위한 boolean code
		boolean[][] check = new boolean[5][5];
		
		// x,y로 현재 position 확보
		int x = 0;
		int y = 0;
		// 넣는 숫자의 변수는 num
		int num = 1;
		int dir = 1;		// 1(오른쪽) 2(하) 3(왼쪽) 4(상)
		
		// 초기값, map[0][0] = 1
		map[y][x] = num;
		check[y][x] = true;
		
		// 25번 진행
		for(int i = 0; i < 24; i++) {
			
			// 임시 변수로 대입하고
			int yy = y;
			int xx = x;
			// 방향에 맞춰서 이동하고
			if      (dir == 1)  xx = xx + 1;
			else if (dir == 2)  yy = yy + 1;
			else if (dir == 3) 	xx = xx - 1;
			else if (dir == 4) 	yy = yy - 1;
			// 사각형의 끝에 걸린다면
			if (size <= xx || xx < 0 || size <= yy || yy < 0 || check[yy][xx] == true) {
				
				// 달팽이의 방향은 오른쪽 > 아래 > 왼쪽 > 위 이므로
				// 끝에 도달하면 방향을 바까줌
				dir = dir + 1;
				// 방향이 다 돌면 오른쪽으로 옮김
				if (dir == 5) 		dir = 1;
				// 방향을 바꾸고 나서 위치를 변경하는 큐
				yy = y;
				xx = x;
				
				if 		(dir == 1) 	xx = xx + 1;
				else if (dir == 2) 	yy = yy + 1;
				else if (dir == 3) 	xx = xx - 1;
				else if (dir == 4) 	yy = yy - 1;
				
			}
			// 숫자를 하나 늘리고
			num++;
			// 이동시켯던 위치를 대입해서
			y = yy;
			x = xx;
			// 그 숫자를 넣어줌
			map[y][x] = num;
			// 숫자가 들어가 있는지 여부를 표시하는 boolean array
			check[y][x] = true;
			
//			System.out.println("y =  " + y + ", x = " + x);
			
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		

	}

}
