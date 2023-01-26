package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가) 1 ! 여기서부터는 직접 값을 지정하는 것이 아닌 계산식으로 요금 계산
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가) 2
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가) 3
 * ... 
 * 1, 2 > 50*1   0, 1
 * 3, 4 > 50*2   1, 2
 * 5, 6 > 50*3   2, 3
 * 
 * 
 * 
 */

public class IfEx22_문제 {
// 1/19 12:17 ~ 12:27
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정거장 수 ? ");
		int stop = sc.nextInt();
		
		int pay = 0;
		
		if (stop <= 5) {
			pay = 500;
		}
		else if (stop > 5 && stop <= 10) {
			pay = 600;
		}
		else {
			if (stop%2 == 0) {
				pay = 600 + 50*(stop-10)/2;
			}
			else {
				pay = 600 + 50*((stop-10)/2 +1);
			}
		}
		
		System.out.println("요금은 " + pay);
		sc.close();
	}

}
