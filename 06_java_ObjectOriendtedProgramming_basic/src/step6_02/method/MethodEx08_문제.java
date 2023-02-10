package step6_02.method;

class Ex08 {
	
	void printSum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("arr 배열의 총합은 " + sum + " 입니다.");
	}
	void printSumMultiple4(int[] arr) {
		int sum4 = 0;
		for (int num : arr) {
			if (num%4 == 0) sum4 += num;
		}
		System.out.println("arr 배열에서 4의 배수의 총합은 " + sum4 + "입니다.");
	}
	void printCountMultiple4(int[] arr) {
		int cnt4 = 0;
		for (int i = 0; i < arr.length;i++) {
			if (arr[i]%4 == 0) cnt4 += 1;
		}
		System.out.println("arr 배열에서 4의 배수의 개수는 " + cnt4 + "입니다.");
	}
}

public class MethodEx08_문제 {

	public static void main(String[] args) {
		
		Ex08 example08 = new Ex08();
		
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		example08.printSum(arr);
		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		example08.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		example08.printCountMultiple4(arr);
	}
}