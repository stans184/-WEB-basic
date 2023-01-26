package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

// 1/20 14:10 ~ 14:20
public class LoopEx11_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		while (br < 31) {
			if (turn%2 == 0) {
				System.out.print("Enter P1 number : ");
				p1 = sc.nextInt();
				br += p1;
				turn += 1;
			}else {
				System.out.print("Enter P2 number : ");
				p2 = sc.nextInt();
				br += p2;
				turn += 1;
			}
		}
		
		if (turn%2 == 0) {
			System.out.println("Winner is P1");
		}else {
			System.out.println("Winner is P2");
		}
		
		sc.close();

	}

}
