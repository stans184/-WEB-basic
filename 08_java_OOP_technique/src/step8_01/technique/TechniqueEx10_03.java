package step8_01.technique;

import java.util.*;

/*  # 인터페이스 타입 객체 생성
 * 
 *  - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체 생성 가능
 *  - 인터페이스를 자료형으로 구현할 경우 프로그램은 더욱 유연해진다.
 * 
 *   [ 방법 ]
 * 
 *   인터페이스 변수명 = new 클래스명();
 *  
 *   [ 예시 ]
 *  
 *   List<Object> temp1 = new ArrayList<Object>();
 *   List<Object> temp2 = new Vector<Object>();
 *   
 *   Map<Object,Object> temp3 = new HashMap<Object, Object>();
 *   Map<Object,Object> temp4 = new TreeMap<Object, Object>();
 * */

interface Person{
	public void walk();
}

class Children implements Person{

	@Override
	public void walk() {System.out.println("children walk");}
}

class Student implements Person{

	@Override
	public void walk() {System.out.println("Student walk");}
}

class Adult implements Person{

	@Override
	public void walk() {System.out.println("Adult walk");}
}

public class TechniqueEx10_03 {

	public static void main(String[] args) {
		
		Children c1 = new Children();
		Student s1 = new Student();
		Adult a1 = new Adult();
		
		// instance type 을 interface 로 선언 가능
		Person c2 = new Children();
		Person s2 = new Student();
		Person a2 = new Adult();
		
		Person[] testArr1 = {c2, s2, a2};
		
		System.out.println(c2 instanceof Person);
		
		for (Person person : testArr1) person.walk();
		
//		children walk
//		Student walk
//		Adult walk
		
		ArrayList<Person> testArr2 = new ArrayList<Person>();
		testArr2.add(c2);
		testArr2.add(s2);
		testArr2.add(a2);
		
		for (Person person : testArr2) {
			person.walk();
		}
		
		// 예시 1)
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new LinkedList<Integer>();
		
		// 예시 2)
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new TreeMap<String, String>();
	}
}