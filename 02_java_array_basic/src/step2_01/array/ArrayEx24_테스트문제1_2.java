package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};
		System.out.print("Enter the target Number : ");
		int targetNum = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] != targetNum) {
				e[cnt] = d[i];
			}else cnt -= 1;
			cnt += 1;
		}
		
		System.out.println(Arrays.toString(e));

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		System.out.print("Enter the number : ");
		int targetVal = sc.nextInt();
		int valCnt = 0;
		
		for (int i = 0; i < f.length; i+=2) {
			if (f[i] != targetVal) {
				g[valCnt] = f[i];
				g[valCnt + 1] = f[i + 1];
				valCnt += 2;
			}
		}
		
		System.out.println(Arrays.toString(g));
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		System.out.print("Enter the number to insert : ");
		int insertNum = sc.nextInt();
		
		for (int i = 0; i < h.length-1; i++) {
			h[i] = h[i+1];
		}
		h[h.length-1] = insertNum;
		
		System.out.println(Arrays.toString(h));
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		System.out.println("Enter the number : ");
		int frontInsert = sc.nextInt();
		
		for (int j = i.length-1; j >= 1; j--) {
			i[j] = i[j-1];
		}
		i[0] = frontInsert;
		
		System.out.println(Arrays.toString(i));
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};
		int cnt12 = 0;
		
		for (int k2 = j.length-1; k2 >= 0; k2--) {
			k[cnt12] = j[k2];
			cnt12 += 1;
		}

		System.out.println(Arrays.toString(k));
		
		sc.close();
	}

}
