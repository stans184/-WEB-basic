package step6_02.method;

import java.util.Random;
import java.util.Scanner;
/*
4	5	7	

1	2	8	

3	6	9
*/
class NumGame{
	
	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	
	int[][] front = new int[3][3];
	int[][] back = new int[3][3];
	int ansCnt=1;
	
	void generateMap() {
		int k = 1;
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) front[i][j] = k++;
		}
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) back[i][j] = k++;
		}
	}
	
	void shuffle() {
		for (int i = 0; i < 500; i++) {
			int rNumx = rm.nextInt(front.length);
			int rNumy = rm.nextInt(front.length);
			int tmp = front[rNumx][rNumy];
			front[rNumx][rNumy] = front[0][0];
			front[0][0] = tmp;
			int rNum2x = rm.nextInt(back.length);
			int rNum2y = rm.nextInt(back.length);
			int tmp2 = back[rNum2x][rNum2y];
			back[rNum2x][rNum2y] = back[0][0];
			back[0][0] = tmp2;
		}
	}
	
	void showMap() {
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) System.out.print(front[i][j] + "\t");
			System.out.println();
		}
	}
	
	void enterAns(int num1, int num2) {
		try {
			if (ansCnt == front[num1][num2]) {
				if (ansCnt < 10) {
					front[num1][num2] = back[num1][num2];
					ansCnt += 1;
				}
				else {
					front[num1][num2] = 0;
					ansCnt += 1;
				}
			}
		} catch (Exception e) {System.out.println(e);}
	}
	
	void run() {
		generateMap();
		shuffle();
		while (true) {
			showMap();
			if (ansCnt == 19) {
				System.out.println("Game End");
				break;
			}
			System.out.print("Enter x position : ");
			int xp = sc.nextInt()-1;
			System.out.print("Enter y position : ");
			int yp = sc.nextInt()-1;
			
			enterAns(yp, xp);
		}
	}
}

public class MethodEx18_풀이1 {

	public static void main(String[] args) {
		NumGame ng = new NumGame();
		ng.run();
	}
}