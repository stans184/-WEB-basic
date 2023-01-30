package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {

		// 배열 사용 예시 1
		// 데이터의 양을 알고 있는 경우는, CPU 과사용을 막을 수 있지만
		// 데이터의 양이 모호하거나 지속적으로 변하는 경우는 배열 사용이 유리하지 않다
//		String[] test1 = new String[3];
//		double[] test2 = new double[5];
//		char[] test3 = new char[3];
//		boolean[] test4 = new boolean[10];
		
		// 배열 사용 예시 2, 축약형 (생성시에만 가능)
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		String[] arr2 = {"john", "paul", "jack", "charile"};
		char[] arr3 = {'a', 'b', 'c'};
		boolean[] arr4 = {true, false, false};
		
		// 배열 사용 예시 3, 타 문법과의 조합
		int[] arr5 = new int[100];
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i+1;
		}
		
		// 출력
		for (int i : arr1) System.out.print(i + " ");
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
		System.out.println();
		
		for (char i : arr3) System.out.print(i + " ");
		System.out.println();
		
		// 배열이 익숙해진 이후에 사용
		// (import) Arrays.toString(배열명)
		// 출력 결과
		// [true, false, false]
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
	}

}