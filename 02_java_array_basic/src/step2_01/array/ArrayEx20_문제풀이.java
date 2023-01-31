package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삭제
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 , 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx20_문제풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int elementCnt = 5;
		int selectMenu = 0;
		
		while (elementCnt > 0) {
			System.out.print("Select Menu : ");
			selectMenu = sc.nextInt();
			
			if (selectMenu == 2) {
				System.out.print("Enter the number to delete : ");
				int delNum = sc.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < arr.length; i++) {
					if (delNum == arr[i]) { 
						delIdx = i;
					}
				}
				
				if (delIdx == -1) {
					System.out.println("Not Exist");
				}else {
					elementCnt -= 1;
					
					for (int i = delIdx; i <= elementCnt-1; i++) {
						arr[i] = arr[i+1];
					}
					System.out.println();
					for (int i = 0; i < elementCnt; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("Deleted All");
		
		sc.close();
	}

}
