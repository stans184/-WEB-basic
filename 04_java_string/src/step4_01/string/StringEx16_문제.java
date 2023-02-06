package step4_01.string;

import java.util.Scanner;
/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */
public class StringEx16_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		text = text.toLowerCase().substring(0, text.length() - 1);
		
		String[] spText = text.split(" ");
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = sc.next();

		int checkWord = 0;
		
		for (String check : spText) {
			if (check.equals(word)) checkWord += 1;
		}
		
		if (checkWord != 0) System.out.println(true);
		else if (checkWord == 0) System.out.println(false);
		
		sc.close();
	}
}