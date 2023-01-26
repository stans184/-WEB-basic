package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_문제 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		int i = 1;
		int sum = 0;
		int cnt = 0;
		while (i <= 10) {
			if (i < 3 || i >= 7) {
				System.out.println(i);
				sum += i;
				cnt += 1;
			}
			i += 1;
		}
		
		System.out.println();
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		System.out.println(sum);
		System.out.println();
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		System.out.println(cnt);
		System.out.println();
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
		int j = 1;
		sum = 0;
		while (j <= 5) {
			sum += j;
			j += 1;
		}
		
		System.out.println(sum);

	}

}
