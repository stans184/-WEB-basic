package step4_01.string;

import java.util.Scanner;
/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */
public class StringEx17_문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		text = text.substring(0, text.length() - 1);
		
		String[] spText = text.split(" ");
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = sc.next();
		
		for (int i = 0; i < spText.length; i++) {
			if (word.equals(spText[i])) {
				System.out.print("바꿀 단어를 입력하세요 : ");
				String chWord = sc.next();
				spText[i] = chWord;
			}
		}
		
		for (int i = 0; i < spText.length; i++) {
			if (i == spText.length -1) System.out.print(spText[i] + ".");
			else System.out.print(spText[i] + " ");
		}
		sc.close();
	}
}