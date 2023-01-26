package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;
/*
 * # 로그인[3단계]
 * 
 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */
// 1.18 12:48 ~ 12:50
public class IfEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rm = new Random();
		
		int dbId = 1234;
		int dbPw = 1111;
		System.out.print("Enter ID ");
//		int inId = scan.nextInt();
		int inId = rm.nextInt(1235);
		System.out.println(inId);
		
		if (inId == dbId) {
			System.out.print("Enter PW ");
//			int inPw = scan.nextInt();
			int inPw = rm.nextInt(9999);
			System.out.println(inPw);
			if (inPw == dbPw) {
				System.out.println("LOGIN SUCCESS");
			}
			if (inPw != dbPw) {
				System.out.println("FAIL, check PW");
			}
		}
		if (inId != dbId) {
			System.out.println("FAIL, check ID");
		}
		
		scan.close();
	}

}
