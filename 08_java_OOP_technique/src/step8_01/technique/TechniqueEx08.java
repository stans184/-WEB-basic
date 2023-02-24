package step8_01.technique;

/*  # this , super
 * 
 * 	- this  : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this()  : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod()  : 자신의 메서드 호출
 *    testMethod()		 : 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * */

class Parent{
	
	String name;
	int age;
	
	Parent() {
		this("noname", 1);
		System.out.println("(P-basic) parant class basic constructor");
	}
	
	Parent(String name, int age) {
		// this();					 이거까지 해버리면 빠져나올수가 없음
		this.name = name;
		this.age = age;
		System.out.println("(P-add) parant class detail constructor");
	}
	
	void testMethod() {System.out.println("(P) - test method");}
}

class Child extends Parent{
	
	// child 를 만드려면 부모 클래스인 parent 가 만들어져 있어야 부모 클래스의 variable, method 를 쓸 수 있으므로
	// child 만 생성해도, 부모 클래스의 생성자가 실행된다
	Child(){
		super();				// Parent(); 와 동일, 해당 코멘트가 있어도 없어도 부모클래스의 생성은 동일하다 (기본적으로 생략되어있음)
//		super("turing", 44);	// 부모 클래스에 여러 생성자가 있다면, 어떤 방식으로 부모클래스를 생성할 건지 정할 수 있다
		System.out.println("(C-basic) child class basic constuctor");
	}
	
	Child(String name, int age){
//		super();
		super("turing", 44);
//		this();
		System.out.println("(c-add) child class detail constructor");
	}
	
	@Override
	void testMethod() {System.out.println("(C) - test method");}
	
	void showMethod() {
		System.out.println(super.name);		// 부모 클래스의 변수
		System.out.println(super.age);
		super.testMethod();					// 부모 클래스의 메서드
		testMethod();						// 자녀 클래스의 메서드, this는 생략 가능
	}
}

public class TechniqueEx08 {

	public static void main(String[] args) {
		
		new Parent();
		System.out.println();
		new Parent("Jenny", 34);
		System.out.println();
		
		new Child();
		System.out.println();
		new Child("Pony", 12);
		System.out.println();
		
		(new Child("Pony", 12)).showMethod();
	}
}