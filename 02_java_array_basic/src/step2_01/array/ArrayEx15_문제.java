package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */
public class ArrayEx15_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int cnt  = 0;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			int tempRan = rm.nextInt(9) + 1;
			int temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}
		
		int gameCnt = 0;
		
		while (gameCnt < 5) {
			
			System.out.println(Arrays.toString(front));
			System.out.println(Arrays.toString(back));
			
			System.out.print("Enter the number1 : ");
			int inIdx1 = sc.nextInt() - 1;
			int outNum1 = front[inIdx1];
			
			System.out.print("Enter the number1 : ");
			int inIdx2 = sc.nextInt() - 1;
			int outNum2 = front[inIdx2];
			
			if (outNum1 == outNum2) {
				back[inIdx1] = outNum1;
				back[inIdx2] = outNum1;
				gameCnt += 1;
			}
			
		}
		System.out.println("Game Finished");
		sc.close();
	}
	
}
