package step1_02.variable;

public class VariableEx03_정답예시 {

	public static void main(String[] args) {
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double tax = salary * 0.033;
		System.out.println("세금 = " + tax + "원");
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int score1 = 100;
		int score2 = 88;
		int score3 = 92;
		int totalGrade = score1 + score2 + score3;
		double average = totalGrade / 3.0;
		System.out.println("평균 = " + average + "점");
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int width = 3;
		int height = 7;
		double triArea = width * height / 2.0;
		System.out.println("삼각형의 넓이 = " + triArea);
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int minutes = time / 60;
		int seconds = time % 60;
		System.out.println(minutes + "분 " + seconds + "초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 
        int money = 800;
        int count500Won = money / 500;
        int count100Won = (money % 500) / 100;
        System.out.println("500원의 개수 = " + count500Won);
        System.out.println("100원의 개수 = " + count100Won);		
		
	}

}
