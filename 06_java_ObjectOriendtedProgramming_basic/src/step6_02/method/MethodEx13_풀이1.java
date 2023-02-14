package step6_02.method;
/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */

import java.util.Arrays;
import java.util.Random;

class OMR{
	int[] answer = {1, 3, 4 ,2, 5};
	int[] me = new int[5];
	char[] ansCard = new char[5];
	int ansCnt;
	
	void makeAnswer() {
		Random rm = new Random();
		
		for (int i = 0; i < me.length; i++) {
			me[i] = rm.nextInt(5) + 1;
		}
	}
	
	void showAnswer() {
		System.out.print("Answer\t: ");
		System.out.println(Arrays.toString(answer));
		
		System.out.print("me\t: ");
		System.out.println(Arrays.toString(me));
	}
	
	void checkAnswer() {
		for (int i = 0; i < answer.length; i++) {
			if (me[i] == answer[i]) {
				ansCard[i] = 'O';
				ansCnt += 1;
			}
			else ansCard[i] = 'X';
		}
		
		System.out.print("Check\t: ");
		System.out.println(Arrays.toString(ansCard));
		System.out.println("Score\t: " + ansCnt*20);
	}
	
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
		System.out.println("test finished");
	}
}

public class MethodEx13_풀이1 {

	public static void main(String[] args) {
		
		OMR omr = new OMR();
		omr.run();
		
	}
}