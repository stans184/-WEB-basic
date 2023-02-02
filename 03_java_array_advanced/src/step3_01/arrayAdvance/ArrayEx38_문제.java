package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/
public class ArrayEx38_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("Enter index 1 : ");
		int idx1 = sc.nextInt();
		System.out.print("Enter index 2 : ");
		int idx2 = sc.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.print("Enter the number : ");
		int inNum = sc.nextInt();
		
		int inIdx1 = -1;
		int inIdx2 = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (inNum == arr[i][j]) {
					inIdx1 = i;
					inIdx2 = j;
				}
			}
		}
		System.out.println("Index 1 = " + inIdx1 + ", Index 2 = " + inIdx2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		int maxNum = 0;
		int bigIdx1 = -1;
		int bigIdx2 = -1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= maxNum) {
					bigIdx1 = i;
					bigIdx2 = j;
				}
			}
		}
		
		System.out.println(bigIdx1 + ", " + bigIdx2);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("Enter number to swap : ");
		int swapNum1 = sc.nextInt();
		System.out.print("Enter number to swap : ");
		int swapNum2 = sc.nextInt();
		
		int swap1po1 = -1;
		int swap1po2 = -1;
		int swap2po1 = -1;
		int swap2po2 = -1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == swapNum1) {
					swap1po1 = i;
					swap1po2 = j;
				}
				if (arr[i][j] == swapNum2) {
					swap2po1 = i;
					swap2po2 = j;
				}
			}
		}
		
		int tmp = arr[swap1po1][swap1po2];
		arr[swap1po1][swap1po2] = arr[swap2po1][swap2po2];
		arr[swap2po1][swap2po2] = tmp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		sc.close();
	}
}
