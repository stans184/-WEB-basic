package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;
/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * } 
 */
public class StringEx11_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";									// 초기값을 설정해주지 않으면, null로 들어가는데 이러면 String 을 더할 수 없음
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = sc.nextInt();
			
			if	    (sel == 1) {
				System.out.print("추가할 카테고리를 입력하세요 : ");
				String nCate = sc.next();
				
				items[itemCount][0] = nCate;
				itemCount += 1;
			}
			else if (sel == 2) {
				if (itemCount == 0) System.out.println("카테고리가 비어있습니다.");
				else {
					System.out.print("현재 카테고리입니다.\n[ ");
					for (int i = 0; i < itemCount; i++) {
						System.out.print(items[i][0] + " ");
					}
					System.out.println("]");
					
					System.out.print("세부 아이템을 추가할 카테고리를 입력하세요 : ");
					String pCate = sc.next();
					
					int selCate = -1;
					
					for (int i = 0; i < itemCount; i++) {
						if (items[i][0].equals(pCate)) selCate = i;
					}
					
					if (selCate == -1) System.out.println("없는 내역입니다.");
					else {
						System.out.print("추가할 아이템을 입력하세요 : ");
						String inItem = sc.next();
						
						items[selCate][1] += inItem + "/";
					}
				}
			}
			else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println(Arrays.toString(items[i]));
				}
				System.out.println();
			}
		}
	}
}