package step4_01.string;
/*
 *  문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  - 학생 정보와 성적이 담긴 데이터
 * 	student => 1.id 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 * */
public class StringEx20_테스트문제풀이 {

	public static void main(String[] args) {
			
		String[][] students = {
								{"제임스 고슬링" , "신촌" , "1001"}, 
								{"스티브워즈니악", "강남" , "1002" },
								{"데니스리치" , "대치" , "1003"}, 
								{"팀버너스리" , "강동" , "1004"}
							   };
		String[][] score = {
				{"번호" , "과목" , "점수"},
				{"1001" , "국어" , "20"},
				{"1002" , "국어" , "50"},
				{"1003" , "국어" , "60"},
				{"1004" , "국어" , "17"},
				{"1001" , "수학" , "65"},
				{"1002" , "수학" , "15"},
				{"1003" , "수학" , "80"},
				{"1004" , "수학" , "70"},
				{"1001" , "영어" , "43"},
				{"1002" , "영어" , "90"},
				{"1003" , "영어", "30"},
				{"1004" , "영어", "70"}
		};
		
		int[] totalScore = new int[4];
		
		for (int i = 0; i < score.length; i++) {
			if (score[i][0].equals("1001")) {
				totalScore[0] += Integer.parseInt(score[i][2]);
			}
			else if (score[i][0].equals("1002")) {
				totalScore[1] += Integer.parseInt(score[i][2]);
			}
			else if (score[i][0].equals("1003")) {
				totalScore[2] += Integer.parseInt(score[i][2]);
			}
			else if (score[i][0].equals("1004")) {
				totalScore[3] += Integer.parseInt(score[i][2]);
			}
		}
		
		int maxIdx = 0;
		int maxScore = 0;
		
		for (int i = 0; i < totalScore.length; i++) {
			if (totalScore[i] > maxScore) maxIdx = i;
		}
		
		System.out.println("총점이 1등인 학생은 " + students[maxIdx][0] + "이고 총점은 " + totalScore[maxIdx] + "입니다.");
	}
}