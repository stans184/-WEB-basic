package step4_01.string;

import java.util.Scanner;

// ERP??

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * - 종료 -
 */
public class StringEx10_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		boolean isRun = true;
		String before = start;
		
		while (isRun) {
			System.out.print("입력 : ");
			String in = sc.next();
			
			if (in.equals("quit")) isRun = false;
			if (before.charAt(before.length()-1) != in.charAt(0)) System.out.println("끝말을 이어주세요");
			else before = in;
		}
		System.out.println("게임을 종료합니다.");
		
		sc.close();
	}
}