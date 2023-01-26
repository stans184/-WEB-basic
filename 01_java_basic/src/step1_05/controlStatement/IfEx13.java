package step1_05.controlStatement;

import java.util.Random;
/*
 * 랜덤 라이브러리 ( if와 관련 x )
 *   [ 사용법 ] 
 *   
 *   Random 변수명  = new Random();
 *  
 *  1) Random 객체를 생성한다. (import포함)
 *  
 *  2) ran.nextInt(범위) 메서드를 사용하여 랜덤값을 구한다. 
 *  
 *     > nextInt(범위) '0'부터 ~ '범위-1' 사이의 난수가 생성 된다.
 *     > 범위의 시작은 0 부터이기 때문에 시작범위가 0 이 아닌 경우는 추가 작업이 필요하다. 
 *       
 *       예시) ran.nextInt(10) + 1;   > 1 ~ 10 까지 범위의 난수 생성
 *             ran.nextInt(51) + 50;  > 50 ~ 100 까지 범위의 난수 생성
 *             ran.nextInt(21) - 10;  > -10 ~ 10 까지 범위의 난수 생성
 *                
 *  - random객체는 close()메서드를 사용하지 않는다.
 * */
public class IfEx13 {
	public static void main(String[] args) {
		
		Random rm = new Random();
		
		// 0 ~ 9 사이의 랜덤값
		int num1 = rm.nextInt(10);
		System.out.println(num1);
		// 100 ~ 200 사이의 랜덤값
		int num2 = rm.nextInt(101) + 100;
		System.out.println(num2);
		// -3 ~ 3 사이의 랜덤값
		int num3 = rm.nextInt(7) - 3;
		System.out.println(num3);
	}
}