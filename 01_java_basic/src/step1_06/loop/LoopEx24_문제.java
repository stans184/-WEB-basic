package step1_06.loop;

import java.util.Random;
/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */
// 1/25 13:10 ~ 13:23
public class LoopEx24_문제 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		
		int passStudent = 0;
		int topStudentId = 0;
		int topStudentScore = 0;
		int totalScore = 0;
		
		for (int i = 0; i < 10; i++) {
			int studentScore = rm.nextInt(100) + 1;
			totalScore += studentScore;
			
			if (studentScore >= 60) passStudent += 1;
			
			if (topStudentScore <= studentScore) {
				topStudentScore = studentScore;
				topStudentId = i + 1;
			}
		}
		
		System.out.println("전교생의 총점은 " + totalScore + "점 이고, 평균은 " + (totalScore/10) + "점 입니다.");
		System.out.println("합격자는 " + passStudent + "명 입니다.");
		System.out.println("1등의 번호는 " + topStudentId + " 이고, 성적은 " + topStudentScore + "점 입니다.");
		
	}

}
