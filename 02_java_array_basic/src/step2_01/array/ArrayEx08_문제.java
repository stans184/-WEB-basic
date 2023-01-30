package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */

// 1/30 12:48 ~ 12:51
public class ArrayEx08_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		char[] judge = new char[5];
		int score = 0;
		
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = rm.nextInt(5) + 1;
		}
		System.out.print("정답 : ");
		System.out.println(Arrays.toString(answer));
		System.out.print("답안 : ");
		System.out.println(Arrays.toString(hgd));
		
		for (int i = 0; i < hgd.length; i++) {
			if (hgd[i] == answer[i]) {
				judge[i] = 'O';
				score += 20;
			}else judge[i] = 'X';
		}
		System.out.print("정오표 : ");
		System.out.println(Arrays.toString(judge));
		System.out.println("성적 : " + score);
		
	}
	
}
