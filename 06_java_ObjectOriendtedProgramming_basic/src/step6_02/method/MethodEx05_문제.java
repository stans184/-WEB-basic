package step6_02.method;

import java.util.Arrays;
import java.util.Scanner;

class NumList{

	void test1() {
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println("1부터 5까지의 합은 " + total + "입니다.");
	}
	
	void test2() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int maxNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the number : ");
			arr[i] = sc.nextInt();
			if (maxNum < arr[i]) maxNum = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(maxNum);
		sc.close();
	}
}

public class MethodEx05_문제 {

	public static void main(String[] args) {

			NumList nl = new NumList();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			nl.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			nl.test2();
	}
}