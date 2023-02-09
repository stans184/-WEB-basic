package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

class OMR{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}


public class ClassEx06_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		OMR omr = new OMR();
		
		for (int i = 0; i < omr.hgd.length; i++) {
			omr.hgd[i] = rm.nextInt(5) + 1;
			for (int j = 0; j < i; j++) {
				if (omr.hgd[i] == omr.hgd[j]) i -= 1;
			}
		}
		System.out.println(Arrays.toString(omr.hgd));
		
		char[] checker = new char[5];
		
		for (int i = 0; i < checker.length; i++) {
			if (omr.answer[i] == omr.hgd[i]) checker[i] = 'O';
			else checker[i] = 'X';
		}
		
		System.out.println(Arrays.toString(checker));
		
		int score = 0;
		
		for (int i = 0; i < checker.length; i++) {
			if (checker[i] == 'O') score += 20;
		}
		
		System.out.println("성적 : " + score);
	}
}