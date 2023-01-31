package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */


public class ArrayEx19_문제풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			System.out.print("Select menu : ");
			selectMenu = sc.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("Enter the number to add : ");
				int addNum = sc.nextInt();
				
				if (elementCnt == 5) {
					System.out.println("Cannot Add, Full memory");
					break;
				}
				
				arr[elementCnt] = addNum;
				elementCnt += 1;
				
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
		sc.close();
	}
	
}
