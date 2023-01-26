package step1_03.operator;
/*
 * # 삼항 연산자 
 * 
 * [ 형식 ]
 * 
 *  조건식 ? 참일때의 결과값 : 거짓일때의 결과값
 * */

public class OperatorEx09 {

	public static void main(String[] args) {
		
		// 예시 1)
		int totalGrade = 75;
		System.out.println(totalGrade >= 60 ? "PASS" : "FALSE" );
		System.out.println(totalGrade < 60 ? "FALSE" : "PASS" );
		
		// 예시 2)
		char result = totalGrade >= 60 ? 'P' : 'F';
		System.out.println(result);
	}

}



