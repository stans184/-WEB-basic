package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 * 
 */
public class IfEx04_문제 {
// 1/17 14:08 ~ 14:10
	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력하세요 ");
		int inId = scan.nextInt();
		System.out.print("PW를 입력하세요 ");
		int inPw = scan.nextInt();
		
		if (inId == dbId && inPw == dbPw) {
			System.out.println("LOGIN SUCCESS");
		}
		if (inId != dbId || inPw != dbPw) {
			System.out.println("LOGIN FAIL");
		}
		
		scan.close();
	}

}
