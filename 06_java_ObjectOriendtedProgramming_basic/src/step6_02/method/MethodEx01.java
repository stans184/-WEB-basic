package step6_02.method;

import java.util.Arrays;

/*  # 클래스의 구성요소
 *  
 *  [1] 멤버변수, 필드, Property
 *  [2] 메서드
 * 
 *  # 메서드 
 *  
 *  - 클래스 기반 언어에서 클래스 내부에 정의되어 있다. 
 *  - 메서드는 프로그램이 실행되고 있을 때 클래스에서 생성된 인스턴스와 관련된 동작을 정의한다.
 *  
 *  [ 형태 ]
 * 
 * 	1) void : return 타입 (int , double , char , String , int[] , Product , ....)
 * 	2) printMenu  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  3) ()   : 입력인수 (파라메타 , 매개변수 , 아규먼트 , 인자)
 *  4) {}   : 메서드의 영역
 * */

class Washer{
	
	void wash() {
		System.out.println("빨래를 시작합니다.");
	}
	void dry() {
		System.out.println("건조를 시작합니다.");
	}
	void end() {
		System.out.println("동작이 종료됩니다.");
	}
}

class MethodEx {
	// method 정의
	void printMenu() {
		System.out.println("================");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 개인정보수정");
		System.out.println("5. 종료");
		System.out.println("================");
	}
}

public class MethodEx01 {
	
	public static void main(String[] args) {
		
		Washer drumWasher = new Washer();
		// instance method calling
		// 객체.메서드이름(); 형태로 호출하여 사용한다.
		drumWasher.wash();
		drumWasher.end();
		drumWasher.dry();
		drumWasher.end();
		
		MethodEx me = new MethodEx();
		
		me.printMenu();
		
		String test = "ywyw.ywywy";
		String[] test2 = test.split("\\.");
		System.out.println(Arrays.toString(test2));
		System.out.println(test2[0]);
		System.out.println(test2[1]);
	}
}