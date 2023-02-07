package step5_01.exception;
/* # 예외 (Exception) 처리
 * 
 * 심각한 오류를 발생시킬수 있는 내용 자바와 외부 모듈과의 컨넥션을 맺는 경우는 try , catch구문을 사용 한다.
 * 
 * try   : 오류가 나지 않을 경우 정상적으로 실행 될 명령어
 * catch : try{} 안의 명령어가 실행되는 중 오류가 발생할 경우 분기되는 명령어
 * Exception 의 종류는 여러가지, 직접 지정해줄 수도 있고, 전체적으로 포괄하는 Exception 을 써도 되고
 * 전부 포괄하는 Exception 을 쓰면 안되나? case by case
 *  - try없이 catch구문이 단독으로 올 수 없고 , catch구문 없이 try구문이 단독으로 올 수 없다.
 * */
public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int[] testArr = new int[5];
		
		try {
			System.out.println(testArr[0]);
//			System.out.println(testArr[999]);
			System.out.println(testArr[0] / 0);
			
			System.out.println("ORDER");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace(); 													// stackTrace > error 발생 지점 출력
			System.out.println("array out of bound error occured");
		} catch (ArithmeticException e2) {
			System.out.println(e2);
			e2.printStackTrace(); 													// stackTrace > error 발생 지점 출력
			System.out.println("arithmetic error occured");
		} catch (Exception ea) {
			System.out.println(ea);
			System.out.println("error occured");
		}
	}
}