package step1_03.operator;

/*
 *  # 비교 연산자
 * 
 * 	1) 좌변이 우변보다 크다 		  >
 *  2) 좌변이 우변보다 크거나 같다 	  >=
 *  3) 좌변이 우변보다 작다 		  <
 *  4) 좌변이 우변보다 작거나 같다    <=
 *  5) 좌변이 우변과 같다		      ==
 *  6) 좌변이 우변과 다르다 	      !=
 * 
 *  [ 중요 ]  
 *  
 *  - 비교 연산자의 결과는 '항상' 참(true) 또는 거짓(false)이다.
 * */

public class OperatorEx04 {
	
	public static void main(String[] args) {
		System.out.println(10 > 3);
		System.out.println(10 >= 3);
		System.out.println(10 < 3);
		System.out.println(10 <= 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);
	}
	
}