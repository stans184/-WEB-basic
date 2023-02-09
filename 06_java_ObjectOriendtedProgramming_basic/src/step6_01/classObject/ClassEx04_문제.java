package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ScoreEx04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	int total;
	
	public int getTotal() {
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	}
	
	public double getAvg() {
		return (double) total/scores.length;
	}
	
	public int getPassCnt() {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) cnt += 1;
		}
		return cnt;
	}
	
	public int getScore(int idx) {
		if (idx < 0 || idx >5) return 0;
		else return scores[idx];
	}
	
	public int getIdx(int checkScore) {
		int idx = -1;
		for (int i = 0; i < scores.length; i++) {
			if (checkScore == scores[i]) idx = i;
		}
		return idx;
	}
	
	public int getIdxByStudentId(int id) {
		int idx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (id == hakbuns[i]) idx = i;
		}
		return idx;
	}
	
	public int topIdx() {
		int idx = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[idx] < scores[i]) idx = i;
		}
		return idx;
	}
}

public class ClassEx04_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		ScoreEx04 score = new ScoreEx04();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for (int i = 0; i < score.scores.length; i++) {
			score.scores[i] = rm.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (score.scores[i] == score.scores[j]) i -= 1;
			}
		}
		System.out.println(Arrays.toString(score.scores));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		System.out.println("총점 = " + score.getTotal());
		System.out.println("평균 = " + score.getAvg());
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		System.out.println("60점 이상 학생은 " + score.getPassCnt() + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스를 입력하세요 : ");
		int idx = sc.nextInt();
		System.out.println("성적 : " + score.getScore(idx));
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적을 입력하세요 : ");
		int inScore = sc.nextInt();
		System.out.println("인덱스 : " + score.getIdx(inScore));
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번을 입력하세요 : ");
		int inStudentId = sc.nextInt();
		System.out.println("성적 : " + score.getScore(score.getIdxByStudentId(inStudentId)));
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번을 입력하세요 : ");
		int inStudentId2 = sc.nextInt();
		System.out.println("성적 : " + score.getScore(score.getIdxByStudentId(inStudentId2)));
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		System.out.println(score.hakbuns[score.topIdx()] + " : " + score.scores[score.topIdx()]);
		sc.close();
	}
}