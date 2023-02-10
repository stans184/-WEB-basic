package step6_02.method;

class NumbLIst {
	
	void printEvenOrOdd(int x) {
		if (x%2 == 0) System.out.println(x + "는 짝수입니다.");
		else System.out.println(x + "는 홀수입니다.");
	}
	void getAvgBetweenValues(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		double avg = (double) sum / (y-x);
		System.out.println(x + "부터 " + y + "까지 합의 평균은 " + avg + "입니다.");
	}
	void printPrimeNums(int primeNumber) {
		for (int i = 2; i <= primeNumber; i++) {
			int divideCnt = 0;
			for (int j = 2; j < i; j++) {
				if (i%j == 0) divideCnt += 1;
			}
			if (divideCnt == 0) System.out.print(i + " ");
		}
	}
}

public class MethodEx07_문제 {

	public static void main(String[] args) {
		
			NumbLIst e = new NumbLIst();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
	}
}