package step1_05.controlStatement;

import java.util.Scanner;
/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */
// 1.18 1:05 ~ 1:08
public class IfEx12_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number a ");
		int a = scan.nextInt();
		System.out.print("Enter number b ");
		int b = scan.nextInt();
		System.out.print("Enter number c ");
		int c = scan.nextInt();
		
		if (a >= b) {
			if (a >= c) System.out.println("Max number is " + a);
			if (a < c) System.out.println("Max number is " + c);
		}
		if (b > a) {
			if (b >= c) System.out.println("Max number is " + b);
			if (c > b) System.out.println("Max number is " + c);
		}
		
		scan.close();
		
	}

}
