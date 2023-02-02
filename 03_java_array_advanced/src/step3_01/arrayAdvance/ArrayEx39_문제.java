package step3_01.arrayAdvance;

import java.util.Arrays;

/*
 *	# 2차원배열 기본문제[3단계]
*/
public class ArrayEx39_문제 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			garo[i] += sum;
		}
		
		System.out.println(Arrays.toString(garo));
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		
		for (int i = 0; i < arr[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			sero[i] = sum;
		}
		
		System.out.println(Arrays.toString(sero));

	}

}
