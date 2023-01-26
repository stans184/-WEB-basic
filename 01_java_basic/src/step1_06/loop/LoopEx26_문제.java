package step1_06.loop;
/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */
// 1/25 13:27 ~ 13:32
public class LoopEx26_문제 {

	public static void main(String[] args) {
		
		int numOfTen = 0;
		int numOfOne = 0;
		
		for (int i = 1; i <= 50; i++) {
			
			int count = 0;
			
			numOfTen = i/10;
			numOfOne = i%10;
			
			if (numOfTen == 3 || numOfTen == 6 || numOfTen == 9) count += 1;
			if (numOfOne == 3 || numOfOne == 6 || numOfOne == 9) count += 1;
			
			if (count == 0) System.out.print(i + " ");
			else if (count == 1) System.out.print("짝 ");
			else System.out.print("짝짝 ");
			
		}
		

	}

}
