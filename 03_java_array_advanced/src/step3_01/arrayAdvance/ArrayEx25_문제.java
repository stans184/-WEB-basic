package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */
public class ArrayEx25_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		int ansCnt = 0;
		
		while (ansCnt < 5) {
			int maxNum = 0;
			int maxIdx = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > maxNum) {
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.print("Enter the maximun number : ");
			int inNum = sc.nextInt();
			
			if (inNum == maxNum) {
				arr[maxIdx] = 0;
				ansCnt +=1 ;
			}else System.out.println("that is not maxinum number");
		}
		System.out.println("Program Exit!");
		sc.close();
	}
}