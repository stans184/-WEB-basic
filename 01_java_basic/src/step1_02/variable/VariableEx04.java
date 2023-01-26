package step1_02.variable;
//# 변수의 생명 주기 (life cycle, scope)
public class VariableEx04 {

	public static void main(String[] args) {
		
		int x = 12;
		if (true) {
			int y = 3;
			System.out.println(x);
			System.out.println(y);
//			System.out.println(z); error
		}
		
		if (true) {
			int z = 7;
			System.out.println(x);
//			System.out.println(y); error
			System.out.println(z);
		}
		
		System.out.println(x);
//		System.out.println(y); error
//		System.out.println(z); error
		
	}

}
