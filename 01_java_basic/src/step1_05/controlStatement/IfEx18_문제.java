package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_문제 {
// 1/18 14:40 ~ 14:42
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int com = rm.nextInt(3);	// 랜덤으로 저장
		System.out.println(com);
		System.out.println("plz input number : 0 : 가위 , 1 : 바위 , 2 : 보 ");
		int me = sc.nextInt();		// 키보드로 입력받아 저장
		
		if (com == me) {
			System.out.println("draw");
		}
		else if (me < com) {
			if (me == 0 && com == 2) {
				System.out.println("win");
			}else {
				System.out.println("lose");
			}
		}
		else {
			System.out.println("lose");
		}
		
		sc.close();
	}

}
