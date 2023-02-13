package step1_05.controlStatement;
/*
 *  # 조건문 if 
 * 
 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  
 *  	조건식이 true일때 실행할 명령어;
 *  
 *  }
 * */
public class IfEx01 {
	public static void main(String[] args) {
		
		if (true) { // if문에 속한 명령어는 들여쓰기
			System.out.println("command 1");
			System.out.println("command 2");
			System.out.println("command 3");
		}
	
//		if (false) { // if문에 속한 명령어는 들여쓰기
//			System.out.println("command 4");
//			System.out.println("command 5");
//			System.out.println("command 6");
//		}
		
		int income = 2200000;
		// [option] if 안에 속한 명령어가 1줄이면 {} 생략 가능
		if (income >= 1000000 && income < 2000000 ) System.out.println("Tax Free");
		
		if (income >= 2000000 && income < 3000000 ) {
			System.out.println("Tax 10%");
		}
		
		if (income >= 3000000 && income < 4000000 ) {
			System.out.println("Tax 20%");
		}
		
	
	}
}
