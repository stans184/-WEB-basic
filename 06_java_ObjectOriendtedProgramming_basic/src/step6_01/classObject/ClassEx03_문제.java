package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Score{
	
	int total;
	
	int[] arr = {87, 100, 11, 72, 92};
	
	public int getTotal() {
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	public int get4Multi() {
		int mul4 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%4 == 0) mul4 += arr[i];
		}
		return mul4;
	}
	
	public int get4Cnt() {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%4 == 0) cnt += 1;
		}
		return cnt;
	}
	
	public int getEvenCnt() {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) cnt += 1;
		}
		return cnt;
	}
}

public class ClassEx03_문제 {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		System.out.println(score.getTotal());
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		System.out.println(score.get4Multi());
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		System.out.println(score.get4Cnt());
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		System.out.println(score.getEvenCnt());
	}
}