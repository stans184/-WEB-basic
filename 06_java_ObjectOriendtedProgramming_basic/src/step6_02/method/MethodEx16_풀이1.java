package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */
class CardGame{
	
	Scanner sc = new Scanner(System.in);
	Random rm = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int ansCnt;
	
	void shuffleCard() {
		for (int i = 0; i < 10000; i++) {
			int rNum = rm.nextInt(front.length);
			int tmp = front[0];
			front[0] = front[rNum];
			front[rNum] = tmp;
		}
	}
	
	void showCard() {
		System.out.print("before\t: ");
		System.out.println(Arrays.toString(front));
		System.out.print("after\t: ");
		System.out.println(Arrays.toString(back));
	}
	
	void selectCard(int num1, int num2) {
		if (front[num1] == front[num2] && num1 != num2) {
			back[num1] = back[num2] = front[num1];
			ansCnt += 1;
		}
	}
	
	void run() {
		shuffleCard();
		while (true) {
			if (ansCnt == 5) {
				System.out.println("Game Exit");
				break;
			}
			showCard();
			System.out.print("Select card 1 : ");
			int card1 = sc.nextInt();
			System.out.print("Select card 2 : ");
			int card2 = sc.nextInt();
			
			selectCard(card1-1, card2-1);
		}
	}
}

public class MethodEx16_풀이1 {

	public static void main(String[] args) {
		CardGame cg = new CardGame();
		cg.run();
	}
}
