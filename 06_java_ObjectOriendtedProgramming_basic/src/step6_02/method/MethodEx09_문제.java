package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex09 {

	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	
	//문제 1)
	// void return 이지만 int, double 과 같은 자료형과는 달리
	// array 의 link 값을 전달해주는 것이기 때문에
	// array 의 element 가 변한다
	void setRandomValuesinArray(int [] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rm.nextInt(100) + 1;
			for (int j = 0;j < i;j ++) {
				if (scores[j] == scores[i]) i -= 1;
			}
		}
		System.out.print("scores = ");
		System.out.println(Arrays.toString(scores));
	}
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		double avg = 0;
		
		for (int num : scores) {
			sum += num;
		}
		
		avg = (double) sum / scores.length;
		
		System.out.println("총점(" + sum + ") 평균(" + avg + ")");
	}
	//문제 3)
	void printWinner (int [] scores) {
		int passCnt = 0;
		for (int i : scores) {
			if (i >= 60) passCnt += 1;
		}
		System.out.println("합격 : " + passCnt + "명");
	}
	//문제 4)
	void printScore1 (int [] scores, int idx) {
		System.out.println("인덱스 입력 : " + idx + ", 성적 : " + scores[idx] + "점");
	}
	//문제 5)
	void printScore2 (int [] scores, int score) {
		int checkIdx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (score == scores[i]) checkIdx = i;
		}
		if (checkIdx == -1) System.out.println("인덱스 범위를 확인하세요.");
		else System.out.println("성적 입력 : " + score + ", 인덱스 : " + checkIdx);
	}
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores, int id) {
		int checkIdx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (id == hakbuns[i]) checkIdx = i;
		}
		
		if (checkIdx == -1) System.out.println("없는 학번입니다.");
		else System.out.println(hakbuns[checkIdx] + "학생의 성적은 " + scores[checkIdx] + "점 입니다.");
	}
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		int topIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[topIdx] < scores[i]) topIdx = i;
		}
		System.out.println("1등은 " + hakbuns[topIdx] + "번(" + scores[topIdx] + "점)");
	}
}

public class MethodEx09_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex09 test = new Ex09();
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		test.setRandomValuesinArray(scores);
		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		test.printSumAndAverage(scores);
		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		test.printWinner(scores);
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.print("Enter the index : ");
		int inIdx = sc.nextInt();
		test.printScore1(scores, inIdx);
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.print("Enter the score : ");
		int inScore = sc.nextInt();
		test.printScore2(scores, inScore);		
		// 문제6) 학번을 입력받아 성적 출력하는 메서드
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.print("Enter the StudentId : ");
		int inId = sc.nextInt();
		test.printScore3(hakbuns, scores, inId);
		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		test.printNumberOne(hakbuns, scores);
		sc.close();
	}
}