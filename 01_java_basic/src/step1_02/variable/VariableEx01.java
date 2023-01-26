package step1_02.variable;

/*
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 * 
 * */

public class VariableEx01 {

	public static void main(String[] args) {
		
		// 1. 정수 : Integer (int)
		int memberAge = 20;
		System.out.println(memberAge);
		// 2. 실수 : double
		double memberWeight = 80.14;
		System.out.println(memberWeight);
		
		// 3. 문자 : character(char)
		char memberGenderEng = 'm';
		char memberGenderKor = '남';
		System.out.println(memberGenderEng);
		System.out.println(memberGenderKor);
		
		// 4. 문자열(글자) : String
		String subjectName = "web develpment";
		System.out.println(subjectName);
		
		// 5. 참과 거짓 : boolean
		boolean isMember = true;
		System.out.println(isMember);
		
//		 변수의 특징 (unique)
		int productPrice = 20000;
//		int goodsPrice = 25000; // 동일 명칭 변수 선언 불가
		
		productPrice = 22000;		// 재할당
		productPrice = 25000;		// 가장 최근에 할당한 값만 메모리에 남는다
		
		System.out.println(productPrice);
		
//		변수의 초기값			// 변수를 선언하고, initialize 하지 않으면 해당 memory point는 비어있지 않기 때문에 garbage data가 들어간다, 해당 변수는 사용불가능
//		int deliberyPrice;
//		System.out.println(deliberyPrice);
		
//		int tax = 0;			// 0으로 변수 initialize
//		int addTax = 0;
//		int totalPrice = 0;
		
	}

}