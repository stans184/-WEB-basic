package step8_01.technique;

/*  # 추상화 
 * 
 *   - 부모클래스를 상속받은 자식클래스에게 반드시 구현해야하는 메서드를 잊지않고 만들도록 '강제'하는 클래스
 *   - abstract 키워드를 클래스 앞에 붙여주어 추상클래스를 생성한다.
 *   - abstract 키워드를 메서드 앞에 붙이고, '{}' 가 아닌 ';'로 마무리해서 method 생성
 *   - 추상메서드는 추상클래스 안에서 선언만 하고 실질적인 메소드의 구현은 상속받은 자녀클래스에서 진행
 *   - 다중 상속 불가능
 *   - 추상 클래스 객체 생성 불가
 * */

// 일반 클래스
class Parent1{
	
}

// 일반 클래스를 상속받은 클래스
class Child1 extends Parent1{
	
}

// 추상 클래스
abstract class Parent2{
	
	// 추상 class에서는 일반 멤버변수 및 method 도 사용이 가능하다
	int testVar;
	void test99() {
		System.out.println(testVar);
	}
	
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
	abstract void test5();
}

// 추상 클래스를 상속받은 클래스1
class Child2 extends Parent2{

	@Override
	void test1() {}

	@Override
	void test2() {}

	@Override
	void test3() {}

	@Override
	void test4() {}

	@Override
	void test5() {}
	
}

//추상 클래스를 상속받은 클래스2
class Child3 extends Parent2{

	@Override
	void test1() {}

	@Override
	void test2() {}

	@Override
	void test3() {}

	@Override
	void test4() {}

	@Override
	void test5() {}
	
}

public class TechniqueEx09 {

	public static void main(String[] args) {
		
		new Parent1();
		new Child1();
		// new Parent2();  abstract class 는 instance 생성 불가
		
		// abstract class 를 받은 class
		int a = new Child2().testVar;
		new Child3().test5();
		
	}
}