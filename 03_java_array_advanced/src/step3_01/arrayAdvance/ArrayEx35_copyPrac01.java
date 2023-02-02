package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;
/*
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 */
public class ArrayEx35_copyPrac01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = null;
		int elementCnt = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			if (elementCnt != 0) System.out.println(Arrays.toString(numbers));
			
			System.out.println();
			System.out.println("[Vector Controller]");
			System.out.println("[1] Add");
			System.out.println("[2] Delete (by index)");
			System.out.println("[3] Delete (by value)");
			System.out.println("[4] Insert");
			System.out.println("[0] Quit");
			
			System.out.print("Select menu : ");
			int selMenu = sc.nextInt();
			
			if (selMenu == 1) {
				
				System.out.print("Enter the number to add : ");
				int inNum = sc.nextInt();
				
				if (elementCnt == 0) numbers = new int[elementCnt + 1];
				else {
					int[] tmp = numbers;
					numbers = new int[elementCnt + 1];
					
					for (int i = 0; i < tmp.length; i++) {
						numbers[i] = tmp[i];
					}
				}
				
				numbers[elementCnt] = inNum;
				elementCnt += 1;
			}
			else if (selMenu == 2) {
				System.out.print("Enter the index to delete : ");
				int delIdx = sc.nextInt();
				
				if (delIdx < 0 || delIdx > elementCnt-1) {
					System.out.println("Index to delete is Out of range");
				}
				else {
					int[] tmp = numbers;
					numbers = new int[elementCnt - 1];
					
					for (int i = 0; i < delIdx; i++) {
						numbers[i] = tmp[i];
					}
					for (int i = delIdx; i < tmp.length-1; i++) {
						numbers[i] = tmp[i+1];
					}
					
					elementCnt -= 1;
				}
			}
			else if (selMenu == 3) {
				System.out.print("Enter the number to delete : ");
				int delNum = sc.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < numbers.length; i++) {
					if (delNum == numbers[i]) delIdx = i;
				}
				
				if (delIdx == -1) System.out.println("No identical number exist");
				else {
					int[] tmp = numbers;
					numbers = new int[elementCnt - 1];
					
					for (int i = 0; i < delIdx; i++) {
						numbers[i] = tmp[i];
					}
					for (int i = delIdx; i < tmp.length-1; i++) {
						numbers[i] = tmp[i+1];
					}
					
					elementCnt -= 1;
				}
			}
			else if (selMenu == 4) {
				
				if (elementCnt == 0) {
					System.out.println("numbers array is empty");
					System.out.println("if you want to insert, please select menu 1");
				}
				else {
					System.out.print("Enter the index to insert : ");
					int inIdx = sc.nextInt();
					
					if (inIdx < 0 || inIdx > elementCnt-1) {
						System.out.println("Index to insert is Out of range");
					}
					else {
						System.out.print("Enter the number to insert : ");
						int inNum = sc.nextInt();
						
						int[] tmp = numbers;
						numbers = new int[elementCnt + 1];
						
						int k = 0;
						for (int i = 0; i < numbers.length; i++) {
							if (i != inIdx) {
								numbers[i] = tmp[k];
								k += 1;
							}
						}
						numbers[inIdx] = inNum;
						elementCnt += 1;
					}
				}
			}
			else if (selMenu == 0) {
				isRun = false;
				System.out.println("Program Exit!!");
			}
			else System.out.println("Wrong menu number, please re-check");
		}
		
		sc.close();
	}

}
