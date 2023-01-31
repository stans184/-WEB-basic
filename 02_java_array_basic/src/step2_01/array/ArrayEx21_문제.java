package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 */

public class ArrayEx21_문제 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while(elementCnt < 5) {
			
			for(int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.print("Select Menu : ");
			selectMenu = sc.nextInt();
			
			if (selectMenu == 3) {
				
				System.out.print("Enter the position to insert : ");
				int inPos = sc.nextInt();
				
				if (inPos > elementCnt || inPos < 0) {
					System.out.println("Cannot insert that position");
				}
				else {
					System.out.print("Enter tne number to insert : ");
					int inNum = sc.nextInt();
					
					for (int i = elementCnt; i > inPos; i-=1) {
						arr[i] = arr[i-1];
					}
					
					arr[inPos] = inNum;
					elementCnt += 1;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));

		sc.close();
	}
}
