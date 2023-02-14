package step6_02.method;
/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */
import java.util.Random;
import java.util.Scanner;

class MoveGame{
	
	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	
	int[] position = new int[10];
	int player = -1;
	
	void generateGame() {
		player = rm.nextInt(10) + 1;
		position[player] = 8;
	}
	
	void showPosition() {
		for (int i = 0; i < position.length; i++) {
			if (position[i] == 0) System.out.print("_");
			else if (position[i] == 8) System.out.print("P");
		}
		System.out.println();
	}
	
	void moveLeft() {
		if (player == 0) System.out.println("Out of Bound!");
		else {
			position[player-1] = 8;
			position[player] = 0;
			player -= 1;
		}
	}
	
	void moveRight() {
		if (player == 9) System.out.println("Out of Bound!");
		else {
			position[player+1] = 8;
			position[player] = 0;
			player += 1;
		}
	}
	
	void run() {
		generateGame();
		while (true) {
			showPosition();
			System.out.println("1. Move Left");
			System.out.println("2. Move Right");
			System.out.println("3. Exit");
			int sel = sc.nextInt();
			
			if (sel == 1) moveLeft();
			else if (sel == 2) moveRight();
			else if (sel == 3) {
				System.out.println("Game Exit");
				break;
			}
			else System.out.println("Wrong number");
		}
	}
}

public class MethodEx15_풀이1 {

	public static void main(String[] args) {
		MoveGame mg = new MoveGame();
		mg.run();
	}
}
