package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */
// 1/31 12:11 ~ 12:48
public class ArrayEx16_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		
//		 1~4 까지 수를 랜덤으로 생성하고, 중복없이 저장하는 코드 짜야함
		// 숫자를 만들고
		// 이미 있는 숫자인지 검사하고
		// 있으면 숫자 재생성
		// 없으면 배열에 입력
		// 못함, 나중에 다시
		// boolean 배열을 통해서
		
		int i = 0;
		while (i < arr.length) {
			
			int r = rm.nextInt(4);
			
			if(!isCheck[r]) {
				isCheck[r] = true;
				arr[i++] = r + 1;
			}
			
		}

		
		System.out.println(Arrays.toString(arr));
		
		int checkNum = 1;
		boolean isDone = true;
		
		while (isDone) {
			System.out.print("Enter the number : ");
			int inNum = sc.nextInt() - 1;
			
			if (arr[inNum] == checkNum) {
				arr[inNum] = 9;
				checkNum += 1;
			}else {
				System.out.println("Wrong Position");
			}
			
			if (checkNum == 5) isDone = false;
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Done");
		
		sc.close();
		
		
	}
	
}
