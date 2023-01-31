package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */


public class ArrayEx22_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println("\n1 Add");
			System.out.println("2 Delete");
			System.out.println("3 Insert");
			System.out.println("4 Exit\n");
			System.out.print("Select the Menu : ");
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
				break;
				
			}
			
			else if (selectMenu == 2) {
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
	}
}
