package step4_01.string;

import java.util.Arrays;
import java.util.Random;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_문제 {

	public static void main(String[] args) {
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		boolean[] checker = {false, false, false, false};
		String[] newTmp = new String[4];
		Random rm = new Random();
		int outCnt = 0;
		
		// 셔플로 섞는거부터 구현해야함
		while (outCnt < 4) {
			int num = rm.nextInt(4);
			if (checker[num] != true) {
				checker[num] = true;
				newTmp[num] = words[num];
				outCnt += 1;
			}
		}
		
		System.out.println(Arrays.toString(newTmp));
		
		
	}

}