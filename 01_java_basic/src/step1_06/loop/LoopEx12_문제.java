package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */
//1/20 14:25 ~ 14:27
public class LoopEx12_문제 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 50) {
			
			int numBig = i/10;
			int numSmall = i%10;
			
			int cnt = 0;
			
			if (numBig == 3 || numBig == 6 || numBig == 9) {
				cnt += 1;
			}
			if (numSmall == 3 || numSmall == 6 || numSmall == 9) {
				cnt += 1;
			}
			
			if (cnt == 0) {
				System.out.print(i + " ");
			}else if (cnt == 1) {
				System.out.print("짝 ");
			}else {
				System.out.print("짝짝 ");
			}
			
			i += 1;
		}
		
	}

}
