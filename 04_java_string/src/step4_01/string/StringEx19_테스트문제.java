package step4_01.string;

import java.util.Arrays;
/*
 * 문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  학생 정보와 성적이 담긴 데이터 이다 
 * 	student => 1.이름 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 * */
public class StringEx19_테스트문제 {

	public static void main(String[] args) {
			
		String[][] students = {
								 {"제임스 고슬링" , "신촌" , "1001"}, 
								 {"스티브워즈니악" , "강남" , "1002"},
								 {"데니스리치" , "대치" , "1003"}, 
								 {"팀버너스리" , "강동" , "1004"}
							  };
		
		String[][] scores = {
								{"1001" , "100" , "20" , "30"},
								{"1002" , "10" , "60" , "60"},
								{"1003" , "23" , "63" , "31"},
								{"1004" , "45" , "30" , "35"},
							};
	
		int[] total = new int[4];
		
		for (int i = 0; i < total.length; i++) {
			for (int j = 1; j < scores[i].length; j++) {
				total[i] += Integer.parseInt(scores[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(total));
		
		int maxScore = 0;
		int maxStudent = 0;
		
		for (int i = 0; i < total.length; i++) {
			if (total[i] > maxScore) {
				maxScore = total[i];
				maxStudent = 1001 + i;
			}
		}
		
		for (int i = 0; i < students.length; i++) {
			if (students[i][2].equals(maxStudent + "")) {
				System.out.println("최고점을 맞은 학생은 " + students[i][0] + "이고, 점수는 " + maxScore + "점이다.");
			}
		}
		
		
	}
}