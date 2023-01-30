package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */

// 1/30 12:46 ~ 12:48
public class ArrayEx07_문제 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int topScore = 0;
		int topId = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= topScore) {
				topScore = scores[i];
				topId = hakbuns[i];
			}
		}
		
		System.out.println(topId + "번 (" + topScore + "점)");
		
	}
	
}
