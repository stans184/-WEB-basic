package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;
/*
 *	# 관리비
*/
public class ArrayEx40_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		for (int i = 0; i < apt.length; i++) {
			int sum = 0;
			for (int j = 0; j < apt[i].length; j++) {
				sum += pay[i][j];
			}
			System.out.print(sum + " ");
		}
		System.out.println();
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("Enter apt address : ");
		int inNum = sc.nextInt();
		
		int idx1 = -1;
		int idx2 = -1;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (inNum == apt[i][j]) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		
		System.out.println("maintenance cost : " + pay[idx1][idx2]);
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int maxCost = pay[0][0];
		
		int tarIdx1 = -1;
		int tarIdx2 = -1;
		
		// 가장 많이 나온 집 다시 해보기
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (maxCost < pay[i][j]) {
					tarIdx1 = i;
					tarIdx2 = j;
				}
			}
		}
		
		System.out.println("가장 많이 나온 집 : " + apt[tarIdx1][tarIdx2]);
		
		int minCost = pay[0][0];
		
		tarIdx1 = -1;
		tarIdx2 = -1;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (minCost > pay[i][j]) {
					tarIdx1 = i;
					tarIdx2 = j;
				}
			}
		}
		
		System.out.println("가장 적게 나온 집 : " + apt[tarIdx1][tarIdx2]);
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		for (int i = 0; i < pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		System.out.println();
		
		System.out.print("Enter house number to swap : ");
		int swap1 = sc.nextInt();
		System.out.print("Enter house number to swap : ");
		int swap2 = sc.nextInt();
		
		int sw1Idx1 = -1;
		int sw1Idx2 = -1;
		int sw2Idx1 = -1;
		int sw2Idx2 = -1;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (swap1 == apt[i][j]) {
					sw1Idx1 = i;
					sw1Idx2 = j;
				}
				if (swap2 == apt[i][j]) {
					sw2Idx1 = i;
					sw2Idx2 = j;
				}
			}
		}
		
		int tmp = pay[sw1Idx1][sw1Idx2];
		pay[sw1Idx1][sw1Idx2] = pay[sw2Idx1][sw2Idx2];
		pay[sw2Idx1][sw2Idx2] = tmp;
		
		for (int i = 0; i < pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		System.out.println();
		
		sc.close();
	}

}
