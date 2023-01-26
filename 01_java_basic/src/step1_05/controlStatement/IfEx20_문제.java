package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */
// 1/19 12:11 ~ 12:13
public class IfEx20_문제 {

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in); 
		
		int target = rm.nextInt(101) + 100;
		int ans = (target%100)/10;
		
		System.out.print("Enter number ? ");
		int num = sc.nextInt();
		
		if (num == ans) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		sc.close();
	
	}

}
