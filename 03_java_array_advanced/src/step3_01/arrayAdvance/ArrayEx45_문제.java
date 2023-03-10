package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx45_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];	
		int[] temp = new int[maxNum*maxNum];
		int size = 50;	
		int win = 0;
		
		// 중복을 제거한 랜덤숫자를 임시 저장
		for (int i=0; i < temp.length; i++) {
			// 랜덤넘버를 만들고
			temp[i] = rm.nextInt(size) + 1;
			// 그 이전까지 들어간 숫자들 중에서
			for (int j = 0; j < i; j++) {
				// 같은 숫자가 있는지 검사하고
				if (temp[i] == temp[j]) {
					// 같은 숫자가 있으면 다시 랜덤넘버를 만들어야 하니까
					// 그 순서로 다시 돌아간다
					i--;
				}
			}
		}
		
		// 중복을 제거한 랜덤숫자를 빙고판에 대입
		int k = 0;
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				bingo[i][j] = temp[k];
				k++;
			}
		}
		
		
		
		while (true) {
			System.out.println("=============== BINGO GAME ===============");
			System.out.print("\t");
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] == 0) {
						System.out.print(bingo[i][j] + "\t");
					}
					else {
						System.out.print("O\t");
					}
				}
				System.out.println("\n");
			}

			if (win == 1) {
				System.out.println("게임종료");
				break;
			}
			
			System.out.print("y좌표 입력 : ");
			int meY = sc.nextInt();
			System.out.print("x좌표 입력 : ");
			int meX = sc.nextInt();
			
			if (mark[meY][meX] == 0) {
				mark[meY][meX] = 1;
			}
			
			// 가로검사
			for (int i = 0; i < maxNum; i++) {
				int cnt = 0;
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] == 1) {
						cnt++;
					}
				}
				if (cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// 세로검사
			for (int j = 0; j < maxNum; j++) {
				int cnt = 0;
				for (int i = 0; i < maxNum; i++) {
					if (mark[i][j] == 1) {
						cnt++;
					}
				}
				if (cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// 대각선 검사
			int cnt = 0;
			for (int i = 0; i < maxNum; i++) {
				if (mark[i][i] == 1) {
					cnt++;
				}
			}
			if (cnt == 5) {
				win = 1;
			}
			
			cnt = 0;
			for (int i = 0; i < maxNum; i++) {
				if (mark[i][(maxNum-1)-i] == 1) {
					cnt++;
				}
			}
			if (cnt == 5) {
				win = 1;
			}
			
		}

		sc.close();
	}

}
