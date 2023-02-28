package step8_01.technique;

/*# 클래스의 형변환 (업다운 캐스팅)
 
 	- 부모클래스는 객체를 생성 할때 부모클래스에 있는 자원만 생성된다. 
    - 자녀클래스는 객체를 생성 할때 부모클래스와 자녀클래스의 자원이 모두 생성된다.
    - 부모클래스 = new 자녀클래스 (O)
    - 자녀클래스 = new 부모클래스 (X)
*/	

class Base{
	
	Base(){System.out.println("BASE class");}
	
	void baseMethod() {System.out.println("BASE method");}
}

class Sub extends Base{
	
	Sub(){System.out.println("SUB class");}
	
	void subMethod() {System.out.println("SUB method");}
}

public class TechniqueEx11 {

	public static void main(String[] args) {

		Base b1 = new Base();				// 부모 클래스 객체 생성
		b1.baseMethod();
		
		System.out.println("\n===========================\n");
		
		Sub s1 = new Sub();					// 자녀 클래스 객체 생성
		s1.baseMethod();					// 부모의 method 사용 (부모 클래스의 상속으로 인한 사용 가능)
		s1.subMethod();						// 자녀의 method 사용

		System.out.println("\n===========================\n");
		
//		Sub b2 = new Base();				// 부모 클래스는 자녀 클래스로 변환 불가, 자녀가 부모의 요소들을 포함
		
		Base s2 = new Sub();				// 자녀클래스는 부모의 타입으로 선언 가능 ( Up casting )
		s2.baseMethod();					// 부모 타입으로 선언되어 있으므로, 부모의 요소들만 사용 가능
		
		Sub s3 = (Sub) s2;					// 부모 타입으로 만들어진 자녀 클래스를 다시 자녀 클래스로 ( Down Casting )
		s3.baseMethod();
		s3.subMethod();

		System.out.println("\n===========================\n");
		
		// [참고] instanceof : 형변환이 가능한지 확인하는 메서드
		if (s1 instanceof Base) System.out.println("형변환 가능1");
		else					  System.out.println("형변환 불가1");
		
		System.out.println("\n===========================\n");
		
		if (b1 instanceof Sub) System.out.println("형변환 가능2");
		else					  System.out.println("형변환 불가2");
	}
}