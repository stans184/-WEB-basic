package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

// 1/30 12:26 ~ 12:29
public class ArrayEx04_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		
		int[] arr = new int[5];

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rm.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total = 0;
		for (int score : arr) {
			total += score;
		}
		double avg = (double) total / arr.length;
		System.out.println("총점(" + total + "), 평균(" + avg + ")");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int passCnt = 0;
		for (int score : arr) {
			if (score >= 60) {
				passCnt += 1;
			}
		}
		System.out.println(passCnt);

	}
	
}
