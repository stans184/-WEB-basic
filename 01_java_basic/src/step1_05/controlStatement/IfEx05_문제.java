package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_문제 {
//1/17 14:20 ~ 14:22
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력하세요 ");
		int dbId = scan.nextInt();
		System.out.print("PW를 입력하세요 ");
		int dbPw = scan.nextInt();
		
		System.out.println("회원 가입되었습니다.");
		System.out.println();
		
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
