package step1_05.controlStatement;
/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/

import java.util.Random;
import java.util.Scanner;

public class IfEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		System.out.println("가위바위보 - 하나빼기");
		System.out.println("0 : 가위 , 1 : 바위 , 2 : 보");
		System.out.print("왼손 ? ");
		int meLeft = sc.nextInt();
		System.out.print("오른손 ? ");
		int meRight = sc.nextInt();
		
		int comLeft = rm.nextInt(3);
		int comRight = rm.nextInt(3);
		
		int meFinal = 0;
		int comFinal = 0;
		
		System.out.println("Computer Done !");
		System.out.println("어느 손을 낼 건가요 ? (0 : Left, 1 : Right)");
		int meChoice = sc.nextInt();
		if (meChoice == 0) meFinal = meLeft;
		else if (meChoice == 1) meFinal = meRight;
		
		int comChoice = rm.nextInt(2);
		if (comChoice == 0) comFinal = comLeft;
		else if (comChoice == 1) comFinal = comRight;
		
		if (comFinal == meFinal) {
			System.out.println("draw");
		}
		else if (meFinal < comFinal) {
			if (meFinal == 0 && comFinal == 2) {
				System.out.println("You Win");
			}else {
				System.out.println("You lose");
			}
		}
		else {
			System.out.println("win");
		}
		
		sc.close();
		
	}

}

//
//* # 가위바위보 게임
//* 
//*   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
//*   
//*   0 : 가위 , 1 : 바위 , 2 : 보
//*/
//
//public class IfEx18_문제 {
////1/18 14:40 ~ 14:42
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		Random rm = new Random();
//		
//		int com = rm.nextInt(3);	// 랜덤으로 저장
//		System.out.println("plz input number : 0 : 가위 , 1 : 바위 , 2 : 보 ");
//		int me = sc.nextInt();		// 키보드로 입력받아 저장
//		
//		if (com == me) {
//			System.out.println("draw");
//		}
//		else if (me < com) {
//			if (me == 0 && com == 2) {
//				System.out.println("win");
//			}else {
//				System.out.println("lose");
//			}
//		}
//		else {
//			System.out.println("win");
//		}