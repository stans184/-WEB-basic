package step1_06.loop;

import java.util.Iterator;

/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_문제 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j <= 5; j++) System.out.print(j+ " ");
			System.out.println();
			for (int j = 10; j >= 6; j--) System.out.print(j+ " ");
			System.out.println();
			for (int j = 11; j <= 15; j++) System.out.print(j+ " ");
			System.out.println();
			for (int j = 20; j >= 15; j--) System.out.print(j+ " ");
			System.out.println();
			for (int j = 20; j <= 25; j++) System.out.print(j+ " ");
			System.out.println();
		}

	}

}
