package step4_01.string;

// 문자열 관련 데이터 형변환(Casting)

public class StringEx04 {

	public static void main(String[] args) {

		// [1] 문자열 > 숫자 형변환
		String birthYear = "2023";
		System.out.println(birthYear + 1);							//	20231
		// 형태를 바꿔줌
		int nBirthYear = Integer.parseInt(birthYear);				//	Integer.parseInt("문자열"); method 사용
		System.out.println(nBirthYear + 1);							//  2024
		
		System.out.println("\n================");
		// [2] 숫자 > 문자열 형변환
		
		// 2-1) + "" 사용											//	제일 쓰기 쉬워서, 가장 많이 사용
		int salary = 3000000;										//  javascript 에서도 동일한 방법으로 사용
		String str1 = salary + "";
		System.out.println(str1 + 50000);							//	300000050000
		
		// 2-2) Integer.toString(숫자) 사용							//  Integer.parseInt <> Integer.toString 참고하기 쉬움
		String str2 = Integer.toString(salary);
		System.out.println(str1.equals(str2));						//	true
		
		// 2-3) String.valueOf(숫자) 사용							//  잘안씀
		String str3 = String.valueOf(salary);
		System.out.println(str1.equals(str3));						//	true
		
		// 참고) 구글에서 ASCII 코드표 검색 (65 : 'A' , 97 : 'a' 상식적으로 외우기)
		
		// 문자 > 숫자
		
		// 숫자 > 문자
		
	}
}