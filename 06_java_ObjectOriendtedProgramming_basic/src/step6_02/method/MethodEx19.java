package step6_02.method;
/* # 메서드 오버로딩(overloading) , 메서드 중복정의
 * 
 *  1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 *  같은 이름으로 만들어진 여러개의 메서드를 사용할 수 있는 기법  [ 메서드 오버라이딩과 헷갈림 주의 ]
 */
class MethodOverloadingEx{

	int add(int num1, int num2) {return num1 + num2;}
	
	int add(int a, int b, int c) {return a+b+c;}
	
	double add(double x, double y) {return x+y;}
	
	int add(int[] data) {
		int sum = 0;
		for (int num : data) sum += num;
		return sum;
	}
}

public class MethodEx19 {

	public static void main(String[] args) {

		MethodOverloadingEx moe = new MethodOverloadingEx();
		System.out.println(moe.add(12, 3));
		System.out.println(moe.add(12, 3.15));
		System.out.println(moe.add(1,2,3));
		System.out.println(moe.add(3.14, 7.42));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(moe.add(arr));
		
		// Method overloading example
		System.out.println(1);
		System.out.println("word");
		System.out.println(true);
		
		String str = "abcdefg";
		str.substring(1);
		str.substring(1, 4);
	}
}