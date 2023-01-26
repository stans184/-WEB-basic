package step1_03.operator;
/*
 *  # 산술 연산자
 * 
 *  1) 더하기 연산 		+
 *  2) 빼기 연산 		-
 *  3) 곱하기 연산 		*
 *  4) 나누기 연산      / 
 *  5) 나머지 연산	    %
 *  
 *  [중요] 
 *  
 *  - 자바에서는 나누기 연산의 결과가 실수타입이 아니라 정수타입이다.
 *  - 의도적으로 실수 타입으로 형변환(casting)작업을 해주어야 한다.
 * */

public class OperatorEx02 {

	public static void main(String[] args) {
		
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		

		/*
		 *  [ 중요 ]
		 *  
		 *  정수 / 정수 = 정수
		 *  정수 / 실수 = 실수
		 *  실수 / 정수 = 실수
		 *  실수 / 실수 = 실수
		 *  
		 *  - 최소 1개이상 실수형태의 모습을 가지고 있어야 실수타입으로 결과를 얻을 수 있다.
		 *  - 프로그래밍 언어마다 약간씩 차이가 있다.
		 * */
		
		System.out.println();
		
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
		
		System.out.println((double)(10 / 3));
		System.out.println((double)10 / 3);
		System.out.println(10 / (double)3);
		
		int nameCode = 10;
		System.out.printf("%d", nameCode);
		
	
	}

}
