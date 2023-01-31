package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소, 객체의 주소

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = var1;				// 데이터를 대입
		
		var1 = 7;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		// 다름
		
		int[] arr1 = {87,45,23,45,23,56,11};
		int[] temp = arr1;				// 주소값을 전달, 링크
										// 데이터의 양이 많을 때, 여러 class에서 굳이 data를 복사하지 않고
										// 데이터가 들어있는 메모리의 링크를 주고받는다
										// 선언된 두 배열은 같은 메모리에 접근해서 동작하게 된다

		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("temp = " + Arrays.toString(temp));
		
		arr1[0] = 0;
		arr1[6] = 0;
		temp[1] = 0;
		temp[2] = 0;
		
		System.out.println("arr1 = " + arr1);
		System.out.println("temp = " + temp);
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("temp = " + Arrays.toString(temp));
		// arr1만 바깟는데 temp도 같이 바뀜?
		// temp를 바까도 arr1 같이 바뀜
		
	}

}
