package step1_03.operator;

public class OperatorEx07_정답예시 {
	
	public static void main(String[] args) {
		
		// 예) 3의 배수이면서 짝수이면
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);
		
		
		
		// 문제 1) 3과목의 평균이 60점 이상이면 (단 어느 한 과목이라도 50점 미만이 아니어야한다.)
		int kor = 100;
		int eng = 87;
		int math = 41;
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println(avg >= 60 && kor >= 50 && eng >= 50 && math >= 50);

		
		
		// 문제 2) 키가 150cm이상이고 몸무게가 30kg 이상이면
		int height = 149;
		int weight = 30;
		System.out.println(height >= 150 && weight >= 30);
		


	}
}
