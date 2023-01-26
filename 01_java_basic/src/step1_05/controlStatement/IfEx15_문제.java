package step1_05.controlStatement;

import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */
public class IfEx15_문제 {
// 1/18 13:43 ~ 13:44
	public static void main(String[] args) {
	
		Random rm = new Random();
		
		int num = rm.nextInt(10);
		
		if (num <= 2) {
			System.out.println("PASS");
		}
		if (num > 2) {
			System.out.println("FAIL");
		}
		
	}

}
