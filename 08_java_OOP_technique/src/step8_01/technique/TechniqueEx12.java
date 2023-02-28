package step8_01.technique;

import java.util.ArrayList;
import java.util.HashMap;

/*	# 다형성 ( polymorphism )    >> `method overriding`
	
	- 다형성이란 하나의 메소드가 서로 다른 클래스에서 실행 가능한 것
	- 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스를 가져야 한다.
	- 부모 클래스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 하여 사용해야 한다.
	- 부모 클래스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.
	?? 자식 클래스에 추가된 method 가 있다면?
		> 안됨, 다형성은 동일한 타입으로 선언되었지만, 다른 형태를 가진 놈들을 동일한 method로 사용하기 위한 것
		> 정확히 안되는게 맞나?
		
	?? interface랑 차이가 뭐지
		> 용도가 다름, interface 는 객체의 틀을 제공하는것이 메인
		> 그런데 동일한 기능을 할 수 있음에도 굳이 다형성을 가지는 부모-자녀 클래스를 만들어서 사용하는 이유는?
		> 지금까지 찾은 기능중 유일한 차이점은, interface는 final 변수만 가능하다는 것
		> 상속을 주고받는 클래스로 다형성을 구성하면, 변수는 바뀔 수 있음
		> 다형성이라는 커디란 카테고리 안에 interface가 들어가있다고 생각하면 어느정도 이해됨
		> 다형성을 구현하는 수단 중 하나라는 것
		> 다중 상속의 이점을 버릴 수는 없기에, 인터페이스를 통해 다중 상속을 지원
	
	?? 그럼 마지막 질문 다형성이 필요한 순간에 interface를 사용하면 어떻게 되나?
		> 다형성의 사용 이유부터 다시 확인해보고 질문 정리
*/

// 부모클래스
class Shape{
	void draw() {}		// 자녀 클래스가 상속받아 사용할 method 정의
}

// 자녀클래스
class Line extends Shape{
	
	@Override
	void draw() {System.out.println("draw line");}
}

class Circle extends Shape{
	
	@Override
	void draw() {System.out.println("draw circle");}
}

class Rectangle extends Shape{
	
	@Override
	void draw() {System.out.println("draw rectangle");}
}

public class TechniqueEx12 {

	public static void main(String[] args) {
		
		// 부모클래스 타입으로 배열을 생성하고, 자녀클래스로 요소들을 추가
		Shape[] shape = {new Line(), new Circle(), new Rectangle()};
		
		for (Shape sp : shape) sp.draw();
		
//		draw line
//		draw circle
//		draw rectangle
		
		// 참고자료 1)  ->  모든 class 는 object class 를 상위 class 로 갖는다, 따라서 Object 의 하위가 모두 들어감
		ArrayList<Object> test1 = new ArrayList<Object>();
		test1.add(100);
		test1.add("문자열");
		test1.add(true);
		test1.add(new Circle());
		
		// 참고자료 2)
		HashMap<String, Object> test2 = new HashMap<String, Object>();
		test2.put("data1", 100);
		test2.put("data2", "context");
		test2.put("data3", true);
	}
}