package step1_04.input;

import java.util.Scanner;
// 1/17 13:14 ~ 13:17
public class InputEx02_문제풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print("정수 a를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("정수 b를 입력하세요 : ");
		int b = scan.nextInt();
		System.out.println("a와 b의 합은 "+ (a+b) + " 입니다.");
		System.out.println();
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num%2 == 1);
		System.out.println();
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		System.out.println(score >= 60 && score <= 100);
		
		scan.close();
	}
	
}