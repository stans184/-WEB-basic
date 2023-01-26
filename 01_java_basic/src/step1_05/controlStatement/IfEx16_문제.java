package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_문제 {
// 1/18 13:45 ~ 13:47
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rm = new Random();
		int num = rm.nextInt(101);
		System.out.println("당첨된 숫자는 " + num);
		int ans = 1;
		
		if (num%2 == 0) ans = 2;
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		if (choice == ans) System.out.println("PASS");
		if (choice != ans) System.out.println("FAIL");
		
		scan.close();
	}

}
