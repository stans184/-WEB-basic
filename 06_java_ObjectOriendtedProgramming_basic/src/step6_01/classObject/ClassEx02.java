package step6_01.classObject;
/*
 * # 클래스의 범위 (scope, lifecycle)
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 *       
 *      - class 앞에 public 이 붙어있으면 모든 곳에서 접근 가능
 *      - 아무것도 안 붙는 default 상태는 해당 project 에서만 접근 가능
 *      
 * */

class Product{
	
	String code = "0x";					// member 변수는 선언하면서 initial 이 된다
	String name;
	int price;
	int deliveryCost = 3000;
	
}

public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		
		Product pd1 = new Product();
		Product pd2 = new Product();
		Product pd3 = new Product();
		
		Member member10 = new Member();
	}
}