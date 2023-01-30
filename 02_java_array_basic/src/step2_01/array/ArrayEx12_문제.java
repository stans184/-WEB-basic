package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */
// 1/30 14:22 ~ 15:00
public class ArrayEx12_문제 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.print("인덱스1 입력 : ");
		int idx1 = sc.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = sc.nextInt();
		
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
		
		System.out.println(Arrays.toString(arr));
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		System.out.print("값1 입력 : ");
		int inVal1 = sc.nextInt();
		System.out.print("값2 입력 : ");
		int inVal2 = sc.nextInt();
		
		int targetIdx1 = 0;
		int targetIdx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == inVal1) {
				targetIdx1 = i;
			}
			if (arr[i] == inVal2) {
				targetIdx2 = i;
			}
		}
		
		int tmp2 = arr[targetIdx1];
		arr[targetIdx1] = arr[targetIdx2];
		arr[targetIdx2] = tmp2;
		
		System.out.println(Arrays.toString(arr));
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] studentId = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번1 입력 : ");
		int inId1 = sc.nextInt();
		System.out.print("학번2 입력 : ");
		int inId2 = sc.nextInt();
		
		int targetidx3 = 0;
		int targetidx4 = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (inId1 == studentId[i]) {
				targetidx3 = i;
			}
			if (inId2 == studentId[i]) {
				targetidx4 = i;
			}
		}
		
		int tmp3 = scores[targetidx3];
		scores[targetidx3] = scores[targetidx4];
		scores[targetidx4] = tmp3;
		
		System.out.println(Arrays.toString(scores));
		
		sc.close();
	}
	
}
