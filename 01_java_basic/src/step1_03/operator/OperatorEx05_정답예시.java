package step1_03.operator;

public class OperatorEx05_정답예시 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1)  15가 3의 배수이면
        
        int q1 = 15;
        System.out.println(q1 % 3 == 0);
        
        
        
        //문제2) 100이 짝수이면
   
        int q2 = 100;
        System.out.println(q2 % 2 == 0);
        
        
        
        //문제3) 1000원짜리 지폐가 3장 이상이면
        
        int money = 178600;
        System.out.println((money % 5000 / 1000) >= 3);


	}

}
