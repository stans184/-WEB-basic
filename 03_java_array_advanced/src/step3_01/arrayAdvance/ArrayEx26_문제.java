package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */
public class ArrayEx26_문제 {

	public static void main(String[] args) {
	
		Random rm = new Random();
		
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			front[i] = rm.nextInt(SIZE) + 1;
			for (int j = 0; j < i; j++) {
				if (front[j] == front[i]) i -= 1;
			}
		}
		
		for (int i = 0; i < SIZE; i++) {
			back[i] = rm.nextInt(SIZE) + SIZE + 1;
			for (int j = 0; j < i; j++) {
				if (back[j] == back[i]) i -=1;
			}
		}
		
		System.out.print("front : ");
		System.out.println(Arrays.toString(front));
		System.out.print("back : ");
		System.out.println(Arrays.toString(back));
	}
}