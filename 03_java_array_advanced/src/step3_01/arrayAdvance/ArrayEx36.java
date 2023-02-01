package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

// 2차원 배열

public class ArrayEx36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row Number : ");
		int rowNum = sc.nextInt();
		System.out.print("Enter the Col Number : ");
		int colNum = sc.nextInt();
		
		int[][] arr = new int[rowNum][colNum];			// 앞에 있는게 row, 뒤에가 col
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1)*10 + j;
			}
		}
		
		System.out.println();
		// array memory address
		System.out.println("arr : " + arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);	// address
			System.out.println("arr[" + i + "] : " + Arrays.toString(arr[i])); // value
		}
		System.out.println();
		
		// 2차원 배열은 2차원이 기준, 따라서 length 를 구하면 row 의 수를 반환
		// 따라서 2차원 배열의 column 의 길이를 원하면, 임의의 row의 length
		// 각 array element 의 data 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

//		<중요> 2차원 배열을 다룰 경우, 각 파라미터가 어떤 데이터 타입을 가지고 있는지
//		정확하게 이해해야 함
//		arr;		// address
//		arr[0];		// address
//		arr[0][0];	// value
		
		int[][] tmp1 = arr;
		int[] tmp2 = arr[0];
		int tmp3 = arr[0][0];
		
		System.out.println(tmp1);
		System.out.println(tmp2);
		System.out.println(tmp3);
		
		sc.close();
	}
}