package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

class NumToNum{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
	int ansCnt;
	
	void generate() {
		Random rm = new Random();
		
		for (int i = 0; i < front.length; i++) {
			front[i] = rm.nextInt(SIZE) + 1;
			for (int j = 0; j < i; j++) {
				if (front[i] == front[j]) i -= 1;
			}
		}
		
		for (int i = 0; i < back.length; i++) {
			back[i] = rm.nextInt(SIZE) + 1;
			for (int j = 0; j < i; j++) {
				if (back[i] == back[j]) i -= 1;
			}
		}
	}
	
	void show() {
		for (int i = 0; i < SIZE; i++) {
			System.out.print(front[i] + "\t");
			if ((i+1)%3 == 0) System.out.println();
		}
	}
	
	void ansCheck(int num) {
		if (front[num-1] == (ansCnt+1)) {
			front[num-1] = back[num-1];
			ansCnt += 1;
		}
	}
}

public class ClassEx13_문제 {

	public static void main(String[] args) {

		NumToNum toNum = new NumToNum();
		Scanner sc = new Scanner(System.in);
		
		toNum.generate();
		toNum.show();
		System.out.println();
		toNum.ansCheck(8);
		toNum.show();
		
//		while (true) {
//			
//		}
		
		sc.close();
	}
}