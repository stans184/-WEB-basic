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
public class ArrayEx35_copyCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] score = null;
		int elementCnt = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			if (elementCnt != 0) System.out.println(Arrays.toString(score));
			
			System.out.println();
			System.out.println("[Vector Controller]");
			System.out.println("[1] Add");
			System.out.println("[2] Delete (by index)");
			System.out.println("[3] Delete (by value)");
			System.out.println("[4] Insert");
			System.out.println("[0] Quit");
			
			System.out.print("Select the Menu : ");
			int selMenu = sc.nextInt();
			
			if (selMenu == 1) {
				
				System.out.print("Enter the Number to input : ");
				int inNum = sc.nextInt();
				
				if (elementCnt == 0) score = new int[elementCnt + 1];
				else if (elementCnt > 0) {
					int[] temp = score;
					score = new int[elementCnt + 1];
					
					for (int i = 0; i < temp.length; i++) {
						score[i] = temp[i];
					}
				}
				score[elementCnt] = inNum;
				elementCnt += 1;
			}
			
			else if (selMenu == 2) {
				
				if (elementCnt == 0) {
					System.out.println("score Array empty!");
				}
				else if (elementCnt > 0) {
					System.out.print("Enter the index to delete : ");
					int delIdx = sc.nextInt();
					
					if (delIdx < 0 || delIdx > elementCnt-1) {
						System.out.println("Wrong position, please re-check");
					}
					else {
						int[] temp = score;
						score = new int[elementCnt-1];
						
						for (int i = 0; i < delIdx; i++) {
							score[i] = temp[i];
						}
						for (int i = delIdx; i < temp.length-1; i++) {
							score[i] = temp[i+1];
						}
						elementCnt -= 1;
					}
				}
			}
			else if (selMenu == 3) {
				if (elementCnt == 0) System.out.println("score Array empty!");
				else if (elementCnt > 0) {
					System.out.print("Please Enter the number to delete : ");
					int delNum = sc.nextInt();
					
					int delIdx = -1;
					for (int i = 0; i < score.length; i++) {
						if (delNum == score[i]) delIdx = i;
					}
					
					if (delIdx == -1) System.out.println(delNum + " is not in score Array.");
					else {
						int[] temp = score;
						score = new int[elementCnt-1];
						
						for (int i = 0; i < delIdx; i++) {
							score[i] = temp[i];
						}
						for (int i = delIdx; i < temp.length-1; i++) {
							score[i] = temp[i+1];
						}
						elementCnt -= 1;
					}
				}
			}
			else if (selMenu == 4) {
				if (elementCnt == 0) {
					System.out.println("score Array empty!");
					System.out.print("Enter the Number to insert : ");
					int inNum = sc.nextInt();
					
					score = new int[elementCnt + 1];
					score[elementCnt] = inNum;
					elementCnt += 1;
				}
				else if (elementCnt > 0) {
					System.out.print("Enter the Index to insert : ");
					int inIdx = sc.nextInt();
					
					if (inIdx < 0 || inIdx > elementCnt-1) {
						System.out.println("Wrong position, please re-check");
					}
					
					else {
						System.out.print("Enter the Number to insert : ");
						int inNum = sc.nextInt();
						
						int[] temp = score;
						score = new int[elementCnt+1];
						int k=0;
						for (int i = 0; i < score.length; i++) {
							if (i != inIdx) {
								score[i] = temp[k];
								k += 1;
							}
						}
						score[inIdx] = inNum;
						elementCnt += 1;
					}
				}
			}
			else if (selMenu == 0) {
				isRun = false;
				System.out.println("Program Exit!!");
			}
			else System.out.println("Please re-check menu number!");
			System.out.println();
		}
		sc.close();
	}

}
