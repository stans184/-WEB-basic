package step4_01.string;

import java.util.Scanner;
/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	  문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */
public class StringEx15_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = sc.next();
		
		int charCount = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 65 && text.charAt(i) <= 122) charCount += 1;
		}
		
		if (charCount == 0) System.out.println("숫자만 있다.");
		else if (charCount < text.length()) System.out.println("숫자와 문자가 섞여있다.");
		else if (charCount == text.length()) System.out.println("문자만 있다.");
		
		sc.close();
	}

}
