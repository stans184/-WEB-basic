package step4_01.string;

import java.util.Scanner;
/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */
public class StringEx12_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] wishList = new int[MAX_SIZE][4];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;
		
		while(true) {
			
			if (identifier != -1) {
				System.out.println("=====================");
				System.out.println(ids[identifier] + "님 환영합니다.");
				System.out.println("=====================");
			}
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				if (identifier != -1) System.out.println("로그아웃 후 이용하세요.");
				else {
					System.out.print("Id를 입력하세요 : ");
					String inId = sc.next();
					
					for (int i = 0; i < ids.length; i++) {
						if (inId.equals(ids[i])) identifier = i;
					}
					
					System.out.print("PW를 입력하세요 : ");
					String inPw = sc.next();
					
					if (inPw.equals(pws[identifier])) System.out.println(ids[identifier] + "님 로그인 되었습니다.");
					else {
						System.out.println("비밀번호를 확인하세요.");
						identifier = -1;
					}
				}
			}
			else if (sel == 2) {
				System.out.println("로그아웃 되었습니다.");
				identifier = -1;
			}
			else if (sel == 3) {
				if (identifier == -1) System.out.println("로그인 후 이용하세요.");
				else {
					
					while (true) {
						System.out.println("[1] 사과 [2] 바나나 [3] 딸기 [4] 뒤로가기");
						System.out.print("구매를 원하는 제품을 입력하세요 : ");
						int wishNum = sc.nextInt();
						
						if (wishNum == 4) {
							System.out.println("쇼핑을 종료합니다.");
							break;
						}
						else if (wishNum == 1) {
							wishList[identifier][wishNum] += 1;
						}
						else if (wishNum == 2) {
							wishList[identifier][wishNum] += 1;
						}
						else if (wishNum == 3) {
							wishList[identifier][wishNum] += 1;
						}
					}
				}
			}
			else if (sel == 4) {
				if (identifier == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.println(ids[identifier] + "님 장바구니");
					for (int i = 1; i < wishList[identifier].length; i++) {
						if (wishList[identifier][i] != 0) {
							if (i == 1) System.out.println("사과 : " + wishList[identifier][i] + "개");
							else if (i == 2) System.out.println("바나나 : " + wishList[identifier][i] + "개");
							else if (i == 3) System.out.println("딸기 : " + wishList[identifier][i] + "개");
						}
					}
				}
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}