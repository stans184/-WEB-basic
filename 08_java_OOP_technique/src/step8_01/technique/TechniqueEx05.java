package step8_01.technique;

/* # SingleTon design pattern
 * 
 *  - 객체를 1번만 생성하고 싶을 때 사용하는 기법
 *  
 *  - 싱글턴 패턴을 만드는 방법
 *    1) private 기본 생성자를 만든다.
 *    2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
 *	  3) instance를 반환할 getter를 만들어준다.	  
 * */

class SingletonTest{
	
//	1) private 기본 생성자를 만든다. ( default constructor 방지를 위해)
	private SingletonTest() {}

//	2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
//		-> 프로그램이 실행되자마자 instance 가 생성되어서, 여러곳에서 동일한 instance를 사용하기 위해
	private static SingletonTest instance = new SingletonTest();

//	3) instance를 반환할 getter를 만들어준다.
//		-> static으로 생성된 instance를 불러오기 위해, static method로 정의
	public static SingletonTest getInstance() {return instance;}
	
//	테스트 변수
	String testStr = "test context";
	
//	테스트 method
	void testMethod() {System.out.println("test method");}
}

class ClassTest{}

public class TechniqueEx05 {

	public static void main(String[] args) {
		
		// private 생성자로 인해 default constructor 안됨
		// new SingletonTest();
		
		// 주소가 모두 같음, static으로 프로그램이 실행되자마자 만들어진 동일한 객체
		System.out.println(SingletonTest.getInstance());
		System.out.println(SingletonTest.getInstance());
		System.out.println(SingletonTest.getInstance());
		System.out.println();
		
		// 싱글턴 클래스.instance.변수
		SingletonTest.getInstance().testStr += " singtleton test";
		System.out.println(SingletonTest.getInstance().testStr);
		// 싱글턴 클래스.instance.method()
		SingletonTest.getInstance().testMethod();
		System.out.println();
		
		// 모두 다른 객체가 생성됨, 주소가 다 다름
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
	}
}