package step1_05.controlStatement;

import java.util.Random;
/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
import java.util.Scanner;
// 1/18 13:42 ~ 13:43
public class IfEx14_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("Enter number : ");
		int ans = sc.nextInt();
		
		if (ans == coin) {
			System.out.println("PASS");
		}
		if (ans != coin) {
			System.out.println("FAIL");
		}

		sc.close();
	}

}
