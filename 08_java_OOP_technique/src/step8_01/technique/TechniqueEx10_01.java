package step8_01.technique;

/*  # 인터페이스 (interface)
 *  
 *  - 인터페이스는 추상클래스보다 더 추상화된 구문
 *  - 실제 구현된 것이 전혀 없는 기본 설계도 (자바 8이후 부터 default 메서드 static 메서드추가)
 *  - 미리 정해진 규칙에 맞게 구현하도록 '표준', 'GuideLine'을 제시
 *  - 클래스는 인터페이스를 상속받을 수 없고 인터페이스는 클래스를 상속받을 수 없다.
 *  - 클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속시킬 수 있다 > 그러나 interface 간 implements 는 빈번하지 않다?
 *  - 클래스는 다중 상속을 안되지만 인터페이스는 다중구현을 허용한다.
 *  
 *  - [ 인터페이스의 요소 ]
 *    1) constant		 : 인터페이스에서 제공하는 지정된 데이터
 *    2) abstract method : 추상메서드는 interface 안에서 선언만 하고, 실질적인 구현은 상속받은 자녀클래스에서 진행 					 
 *    3) default method  : 인터페이스에서도 메서드 구현이 가능하지만 구현한 클래스에서는 강제성이 없다.
 *    4) static method   : 객체가 없어도 인터페이스 만으로도 사용이 가능한 메서드 						     
 * */

// 추상클래스
abstract class AA{
	int testVar; 				// 맴버변수
	abstract void test1();		// 추상 메서드
	void test2() {}				// 일반 메서드
}

// interface
interface BB{
	
	static final int A = 100;	// constant
	static final int B = 100;	// constant
	int C = 100;				// constant
	
	abstract void test3();		// abstract method
	void test4();				// abstract keyword 생략 가능, 뒤에 구현부를 없애야함
	
	// void test5() {}			// 일반 메서드는 선언 안됨
	default void test5() {		// 일반 메서드는 default 키워드를 붙여서 생성 가능
		System.out.println("Method_5");
	}
	
	static void test6() {		// static method, interface 이름으로 바로 실행이 가능함
		System.out.println("Static Method");
	}
}

interface CC{
	void test7();				// interface 에서는 abstract keyword 생략 가능, '{}' 대신 ';' 로 마무리 해야함
	void test8();
	void test9();
}

// interface 는 동시에 implements '구현' 가능
class DD implements BB, CC{		// interface 다중 구현 가능

	@Override
	public void test7() {}

	@Override
	public void test8() {}

	@Override
	public void test9() {}

	@Override
	public void test3() {}

	@Override
	public void test4() {}
	
}

// 상속받은 자녀 클래스에서도 interface implements 가능
class EE extends Parent1 implements BB, CC{
	
	@Override
	public void test7() {}

	@Override
	public void test8() {}

	@Override
	public void test9() {}

	@Override
	public void test3() {}

	@Override
	public void test4() {}
	
}

public class TechniqueEx10_01 {

	public static void main(String[] args) {
		
		
	}
}