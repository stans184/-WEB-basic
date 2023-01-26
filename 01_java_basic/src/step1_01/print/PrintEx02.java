package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {

		// 다양한 데이터 출력
		
		// 1-1) 정수   : 소수점이 없는 수
		System.out.println(30000);
		// 1-2) 실수   : 소수점이 있는 수
		System.out.println(3.14);
		// 1-3) 문자   : 단일문자 ( 홑따옴표 , 싱글쿼테이션 , 싱글쿼터 )
		System.out.println('A');
		// 1-4) 문자열 : 글자 ( 쌍따옴표 , 더블쿼테이션 , 더블쿼터 )
		System.out.println("WEB CLASS");
		// 1-5) 불리언 : 참과거짓
		System.out.println(true);
		System.out.println(false);
		
		System.out.print("\n");
		
		System.out.println(!false);
		
		// 2. 복수의 데이터 출력 ( , 가 아닌 + 를 사용해야 된다. )
//		System.out.println(1,3,5);
		System.out.println(1 + 3 + 5);
		System.out.println(1 + " " + 3 + " " + 5);
		System.out.println(1 + ", " + 3 + ", " + 5);
				
		// 2-1) 문자열 + 문자열 = 문자열
		System.out.println("subject : " + "web development");
		// 2-2) 숫자 + 숫자 = 숫자
		System.out.println(100000+10000);
		// 2-3) 문자열 + 숫자 = 문자열
		System.out.println("Price : " + 100000);
		// 2-4) 숫자 + 문자열 = 문자열
		System.out.println(40 + "Percentage");
		// 응용
		System.out.println("pay : "+ 2000000 + 500000 + " dollars");
		System.out.println("pay : "+ (2000000 + 500000) + " dollars");
	}

}
