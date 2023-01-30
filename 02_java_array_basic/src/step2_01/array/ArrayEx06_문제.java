package step2_01.array;

import java.util.Scanner;


/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */


// 1/30 14:41 ~ 46 stop 52 start 54
public class ArrayEx06_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] studentId = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		boolean isExist = false;
		
		System.out.print("학번 입력 : ");
		int inId = sc.nextInt();
		for (int i = 0; i < studentId.length; i++) {
			if (inId == studentId[i]) {
				System.out.println("성적 : " + scores[i]);
				isExist = true;
			}
		}
		
		if (!isExist) System.out.print("해당 학번은 존재하지 않습니다.");
		
		sc.close();
	}
	
}
