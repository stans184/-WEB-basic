package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		String[] words = {"java", "mysql", "jsp", "spring"};
		int[] rmCheck = new int[4];
		String[] newWords = new String[4];
		
		// 4번되면 끝
		int outCnt = 0;
		
		// ex45 참고해서 만듦
		for (int i = 0; i < rmCheck.length; i++) {
			rmCheck[i] = rm.nextInt(4);
			for (int j = 0; j < i; j++) {
				if (rmCheck[i] == rmCheck[j]) i -= 1;
			}
		}
		
		// 섞어서 다시 저장
		for (int i = 0; i < newWords.length; i++) {
			newWords[i] = words[rmCheck[i]];
		}
		
		while (outCnt < 4) {
			System.out.print((outCnt + 1) + "번째 문제 : ");
			String inWord = sc.next();
			
			if (newWords[outCnt].equals(inWord)) {
				System.out.println("정답");
				outCnt += 1;
			}
			else System.out.println("오답");
		}
		
		System.out.println("Progrma Exit !!");
		
		sc.close();
	}
}