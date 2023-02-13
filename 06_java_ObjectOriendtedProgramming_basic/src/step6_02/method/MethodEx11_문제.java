package step6_02.method;

class Ex11_1{
	
	int test1(int[] arr) {
		int total = 0;
		for (int num : arr) {
			total += num;
		}
		return total;
	}
	int test2(int[] arr) {
		int sum4 = 0;
		for (int i : arr) {
			if (i%4 == 0) sum4 += i;
		}
		return sum4;
	}
	int test3(int[] arr) {
		int cnt4 = 0;
		for (int i : arr) {
			if (i%4 == 0) cnt4 += 1;
		}
		return cnt4;
	}
	int test4(int[] arr) {
		int cntEven = 0;
		for (int i : arr) {
			if (i%2 == 0) cntEven += 1;
		}
		return cntEven;
	}
}

public class MethodEx11_문제 {

	public static void main(String[] args) {

			Ex11_1 e = new Ex11_1();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) arr의 요소들의 전체 합 리턴
			// 정답 1) 362
			int tot = e.test1(arr);
			System.out.println("tot = " + tot);
			
			// 문제 2) arr의 요소들의 4의 배수의 합 리턴
			// 정답 2) 264
			tot = e.test2(arr);
			System.out.println("tot = " + tot);
			
			// 문제 3) arr의 요소들의 4의 배수의 개수 리턴
			// 정답 3) 3
			int cnt = e.test3(arr);
			System.out.println("cnt = " + cnt);
			
			// 문제 4) arr의 요소들의 짝수의 개수 리턴
			// 정답 4) 3
			cnt = e.test4(arr);
			System.out.println("cnt = " + cnt);

	}
}