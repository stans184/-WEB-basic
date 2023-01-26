package step1_02.variable;
// 1/16 12:37 ~ 12:45
public class VariableEx03_문제 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		double tax = 3.3;
		int income = 2000000;
		System.out.println("세금 : " + income*tax*0.01);
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int[] score = {100,88,92};
		int scoreSum = 0;
		for (int subject : score) {
			scoreSum += subject;
		}
		System.out.println("평균은 : " + (double)scoreSum/score.length);
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int height = 7;
		int width = 3;
		int triSpace = height * width / 2;
		System.out.println("밑변이 " + width + " 이고 높이가 " + height + " 인 삼각형의 넓이는 " + triSpace);
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int timeMin = time/60;
		int timeSec = time%60;
		System.out.println(timeMin + " 분 " + timeSec + " 초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int coin = 800;
		int fiveCount = coin/500;
		int hundCount = (coin - fiveCount*500)/100;
		System.out.println("500짜리는 " + fiveCount + "개, 100짜리는 " + hundCount);
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 

	}

}