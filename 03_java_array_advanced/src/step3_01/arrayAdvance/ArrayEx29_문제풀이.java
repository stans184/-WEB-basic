package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
/*
 * # 숫자 야구 게임
 * 
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 2b
 * 1 5 6		: 1s
 * 1 3 7        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 */
public class ArrayEx29_문제풀이 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		
		int[] com = {1,7,3};
		int[] me  = new int[3];
		int gameCnt = 0;
		
		while (true) {
			int strikeCnt = 0;
			int ballCnt = 0;
			
			for (int i = 0; i < me.length; i++) {
				me[i] = rm.nextInt(9) + 1;
				for (int j = 0; j < i; j++) {
					if (me[j] == me[i]) i -= 1;
				}
			}
			
			System.out.println(Arrays.toString(me));
			
			for (int i = 0; i < me.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (me[i] == com[i] && i == j) strikeCnt += 1;
					else if (i != j && me[i] == com[j]) ballCnt += 1;
				}
			}
			gameCnt += 1;
			
			if (strikeCnt == 3) {
				System.out.println(strikeCnt + "s, 모두 정답입니다.");
				System.out.println(gameCnt + "회 만에 정답");
				break;
			}
			else if (strikeCnt == 0 && ballCnt == 0) {
				System.out.println("Nothing");
			}
			else {
				System.out.println(strikeCnt + "s " + ballCnt + "b");
			}
		}
	}
}