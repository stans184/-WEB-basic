package step1_03.operator;
// 연산자의 우선순위
public class OperatorEx10 {

	public static void main(String[] args) {

		// 예시 1) 
		System.out.println(20 + 10 / 3.0); 			// 23.3
		
		// 예시 2)
		int q2 = 3 + 7;
		System.out.println(q2); 					// 10
		
		// 예시 3)
		System.out.println(7 == 3 + 1); 			// f
		
		// 예시 4)
		System.out.println(12 > 3 && 7 == 1); 		// f
		
		// 예시 5)
		System.out.println(7 == 1 + 6 && 12 > 3 );  // t
		
	}
}