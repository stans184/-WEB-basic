package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] a = { 10, 4, 5, 3, 1 };
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		System.out.println("total = " + total);
		System.out.println("Avg = " + (double)total/a.length);
		
		
		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		System.out.print("Enter the number : ");
		int inNum = sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == inNum) System.out.print(inNum + " =>> " + i);
		}
		System.out.println();
		
		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1
		System.out.print("Enter target index : ");
		int inIdx =  sc.nextInt();
		System.out.println(inIdx + " ==> " +a[inIdx]);
		
		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10
		int maxNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxNum) maxNum = a[i];
		}
		System.out.println("Max number is " + maxNum);

		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		int oddCnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 1) oddCnt += 1;
		}
		System.out.println("Odd Count is " + oddCnt);
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < b.length; i++) {
			if (a[i]%2 == 1) b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
		
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		int cnt = 0;
		
		for (int i = 0; i < c.length; i++) {
			if (a[i]%2 == 1) {
				c[cnt] = a[i];
				cnt += 1;
			}
		}
		
		System.out.println(Arrays.toString(c));
		
	}

}
