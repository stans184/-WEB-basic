package step5_01.exception;
/*  # finally 
 * 
 *  예외발생과 상관없이 무조건 실행할 명령어를 작성한다.
 *  주로 외부모듈과의 컨넥션을 종료할때 사용한다.
 * */
public class ExceptionEx02 {

	public static void main(String[] args) {
			
		int[] testArr = new int[5];
			
		try {
			
			System.out.println(testArr[0] / 0);
			
		} catch (Exception e) {
			System.out.println(e + " OCCURED");
		} finally {
			System.out.println("Program End");
		}
	}
}