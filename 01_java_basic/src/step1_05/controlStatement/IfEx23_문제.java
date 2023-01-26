package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 *    ???
 */ 

public class IfEx23_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = rm.nextInt(10)+1;
		int b = rm.nextInt(10)+1;
		int c = rm.nextInt(4)+1;
		int ans = 0;
		if (c == 1) ans = a + b;
		else if (c == 2) ans = a - b;
		else if (c == 3) ans = a * b;
		else ans = a % b;
		
		System.out.println(a + " ? " + b + " = " + ans);
		System.out.println("연산자 기호는 무엇인가요?");
		System.out.println(" 1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지");
		int logic = sc.nextInt();
		
		if (logic == c) System.out.println("PASS");
		else System.out.println("FAIL");
		
		sc.close();
		
	}

}
