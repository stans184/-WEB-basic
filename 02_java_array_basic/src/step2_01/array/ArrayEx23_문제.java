package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = sc.nextInt();
			
			if		(selectMenu == 1) {
				System.out.print("Enter Account Number : ");
				int inAcc = sc.nextInt();
				boolean accCheck = true;
				
				for (int i = 0; i < accs.length; i++) {
					if (inAcc == accs[i]) {
						accCheck = false;
						System.out.println("Already has same Account");
					}
				}
				
				if (accCheck) {
					if (accsCnt == 5) {
						System.out.println("Account memory full, please delete");
					}else {
						accs[accsCnt] = inAcc;
						accsCnt += 1;
						
						System.out.print("Enter Account PW : ");
						int inPw = sc.nextInt();
						pws[accsCnt] = inPw;
					}
				}
				System.out.print("Account List : ");
				System.out.println(Arrays.toString(accs));
			}
			else if (selectMenu == 2) {
				System.out.print("Enter Account Number : ");
				int inAcc = sc.nextInt();
				int checkIdx = 0;
				
				for (int i = 0; i < accs.length; i++) {
					if (inAcc == accs[i]) checkIdx = i;
				}
				
				System.out.print("Enter Account PW : ");
				int inPw = sc.nextInt();
				
				if (inPw == pws[checkIdx]) {
					System.out.println("Account WithDrawal");
					
					for (int i = checkIdx; i < accs.length-1; i++) {
						accs[i] = accs[i+1];
					}
					for (int i = checkIdx; i < pws.length-1; i++) {
						pws[i] = pws[i+1];
					}
					accs[accs.length-1] = 0;
					pws[pws.length-1] = 0;
					accsCnt -= 1;
				}else System.out.println("Wrong PW");
				
				System.out.print("Account List : ");
				System.out.println(Arrays.toString(accs));
			}
			else if (selectMenu == 3) {
				System.out.println("Program Exit");
				isRun = false;
			}
			
		}
		sc.close();
	}
}
