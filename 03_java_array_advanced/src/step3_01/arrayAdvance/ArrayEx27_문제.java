package step3_01.arrayAdvance;

import java.util.Scanner;
/*
 * # 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */
public class ArrayEx27_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		
		while (true) {
			System.out.print("방향을 입력하세요 [ 1) 왼쪽 2) 오른쪽 3) 격]: ");
			int dir = sc.nextInt();
			
			if (dir == 1) {
				
			}
			
		}
	}
}