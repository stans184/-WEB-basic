package step1_05.controlStatement;

import java.util.Scanner;
/*
 * # 달력 일수 출력
 * 
 * 키보드로 월을 입력받아서 월에 해당하는 일수를 화면에 출력
 * 
 * 참고)
 * 1월  : 31일
 * 2월  : 28일
 * 3월  : 31일
 * 4월  : 30일
 * 5월  : 31일
 * 6월  : 30일
 * 7월  : 31일
 * 8월  : 31일
 * 9월  : 30일
 * 10월 : 31일
 * 11월	: 30일
 * 12월 : 31일
 * 
 * */
// 1/25 14:11 ~ 14:15
public class IfEx27_문제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력: ");
		int getMonth = sc.nextInt();
		
		int judgeMonth = 0;
		
		if (getMonth == 2) {
			judgeMonth = 2;
		}else if (getMonth%2 == 1) {
			judgeMonth = 1;
		}else judgeMonth = 3;
		
		switch (judgeMonth) {
		case 2:
			System.out.println("28일");
			break;
		case 1:
			System.out.println("31일");
			break;
		case 3:
			System.out.println("30일");
			break;
		default:
			System.out.println("1 ~ 12 월 중에서 입력하세요 ");
			break;
		}
		
	
		sc.close();

	}

}
