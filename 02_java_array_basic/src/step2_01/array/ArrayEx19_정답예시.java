package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 *
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx19_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[1]추가");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1)  {
				
				System.out.print("추가 할 값 입력 : ");
				int data = scan.nextInt();
				
				if (elementCnt == 5) {
					System.out.println("더이상 추가 할 수 없습니다.");
					continue;
				}
				
				arr[elementCnt] = data;
				elementCnt++;
				
			}
			
		}
		
	}
	
}
