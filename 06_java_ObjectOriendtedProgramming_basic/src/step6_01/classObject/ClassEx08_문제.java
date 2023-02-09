package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Arrays;
import java.util.Scanner;

class MoveGame{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	int playerIdx = getPlayer();
	
	public int getPlayer() {
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) playerIdx = i;
		}
		return playerIdx;
	}
	
	public void movePlayer(int num) {
		game[playerIdx] = 0;
		playerIdx += num;
		game[playerIdx] += 2;
	}
	
	public void punch() {
		if (game[playerIdx -1] == 1) {
			game[playerIdx-1] = 0;
			movePlayer(-1);
		}
		else if (game[playerIdx + 1] == 1) {
			game[playerIdx+1] = 0;
			movePlayer(1);
		}
	}
}

public class ClassEx08_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MoveGame mg = new MoveGame();
		
		while (true) {
			System.out.println();
			System.out.println(Arrays.toString(mg.game));
			System.out.println();
			System.out.print("Enter direction ( 1 - left, 2 - right, 3 - punch, 4 - exit : ");
			int dir = sc.nextInt();
			
			if (dir == 1) {
				if (mg.playerIdx == 0) {
					mg.movePlayer(mg.game.length-1);
				}
				else {
					if (mg.game[mg.playerIdx-1] == 1) {
						System.out.println("WALL!, you want to 3 - punch ? ");
						int inPunch = sc.nextInt();
						if (inPunch == 3) mg.punch();
						else continue;
					}
					else mg.movePlayer(-1);
				}
			}
			else if (dir == 2) {
				if (mg.playerIdx == mg.game.length-1) {
					mg.movePlayer(-(mg.game.length-1));
				}
				else {
					if (mg.game[mg.playerIdx+1] == 1) {
						System.out.println("WALL!, you want to 3 - punch ? ");
						int inPunch = sc.nextInt();
						if (inPunch == 3) mg.punch();
						else continue;
					}
					else mg.movePlayer(+1);
				}
			}
			else if (dir == 4) {
				System.out.println("GAME END");
				break;
			}
			else System.out.println("Wrong direction");
		}
		sc.close();
	}
}