package step6_01.classObject;

import java.util.Scanner;
/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */

class ScoreBoard{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};
	
	public void getAllScore() {
		for (int i = 0; i < arScore.length; i++) {
			System.out.println(arHakbun[i] + " 학생의 점수는 " + arScore[i]);
		}
	}
	
	public int getTopStudentIdx() {
		int supIdx = -1;
		for (int i = 0; i < arScore.length; i++) {
			if (arScore[0] < arScore[i]) supIdx = i;
		}
		return supIdx;
	}
	
	public int getBottomStudentIdx() {
		int botIdx = 0;
		for (int i = 0; i < arScore.length; i++) {
			if (arScore[botIdx] > arScore[i]) botIdx = i;
		}
		return botIdx;
	}
	
	public int getScore(int studentId) {
		int checkIdx = -1;
		for (int i = 0; i < arHakbun.length; i++) {
			if (studentId == arHakbun[i]) checkIdx = i;
		}
		if (checkIdx != -1) return arScore[checkIdx];
		else return -1;
	}
}

public class ClassEx05_문제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		ScoreBoard sb = new ScoreBoard();
		sb.name = "bojeong";
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			
			if		(choice == 1) {
				sb.getAllScore();
			}
			else if (choice == 2) {
				int studentIdx = sb.getTopStudentIdx();
				System.out.println("1등 학생은 " + sb.arHakbun[studentIdx] + "이며, 점수는 " + sb.arScore[studentIdx] + "입니다.");
			}
			else if (choice == 3) {
				int studentIdx = sb.getBottomStudentIdx();
				System.out.println("꼴찌 학생은 " + sb.arHakbun[studentIdx] + "이며, 점수는 " + sb.arScore[studentIdx] + "입니다.");
			}
			else if (choice == 4) {
				System.out.print("성적을 확인하고 싶은 학생의 학번을 입력하세요 : ");
				int checkId = sc.nextInt();
				int checkScore = sb.getScore(checkId);
				if (checkScore != -1) System.out.println(checkId + "학생의 점수는 " + sb.getScore(checkId) + "입니다.");
				else System.out.println("동일한 학생이 존재하지 않습니다.");
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}