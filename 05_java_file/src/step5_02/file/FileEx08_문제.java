package step5_02.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//# 파일 컨트롤러[3단계] : 장바구니

public class FileEx08_문제 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[]	ids = {"qwer", "javaking", "abcd"};
		String[]	pws = {"1111",   "2222", "3333"};
		String[]  items = {"사과", "바나나", "딸기"};
		
		final int MEMBER_CNT = ids.length;
		int[][] wishList = new int[MEMBER_CNT][3];

		String fileName = "wishList.txt";
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
//		int count = 0;
		int log = -1;
		
		while (true) {
			System.out.println("===================");
			if (log != -1) System.out.println("상태 : " + ids[log] + "님 로그인 중");
			else System.out.println("상태 : 로그아웃");
			System.out.println("===================");
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				if (log == -1) {
					System.out.print("아이디를 입력하세요 : ");
					String inId = sc.next();
					int inIdx = -1;
					
					for (int i = 0; i < ids.length; i++) {
						if (inId.equals(ids[i])) inIdx = i;
					}
					
					if (inIdx == -1) System.out.println("아이디를 확인하세요.");
					else {
						System.out.print("비밀번호를 입력하세요 : ");
						String inPw = sc.next();
						
						if (!inPw.equals(pws[inIdx])) System.out.println("비밀번호를 확인하세요.");
						else {
							log = inIdx;
							System.out.println(ids[log] + "님 환영합니다.");
						}
					}
				}else System.out.println(ids[log] + "님 로그아웃 후 이용해주세요.");
			}
			else if (sel == 2) {
				if (log == -1) System.out.println("로그인 되어있지 않습니다.");
				else {
					System.out.println(ids[log] + "님 로그아웃 되었습니다.");
					log = -1;
				}
			}
			else if (sel == 3) {
				if (log == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.println("---상품 리스트---");
					for (int i = 0; i < items.length; i++) {
						System.out.println("[" + (i+1) + "] " + items[i]);
					}
					System.out.println("--------------");
					System.out.print("장바구니에 담을 과일을 고르세요 : ");
					int selProduct = sc.nextInt();
					
					if (selProduct == 1) {
						System.out.println("사과 추가되었습니다.");
						wishList[log][selProduct-1] += 1;
					}
					else if (selProduct == 2) {
						System.out.println("바나나 추가되었습니다.");
						wishList[log][selProduct-1] += 1;
					}
					else if (selProduct == 3) {
						System.out.println("딸기 추가되었습니다.");
						wishList[log][selProduct-1] += 1;
					}
				}
			}
			else if (sel == 4) {
				if (log == -1) System.out.println("로그인 후 이용하세요.");
				else {
					System.out.println(ids[log] + "님의 장바구니입니다.");
					
					for (int i = 0; i < wishList[log].length; i++) {
						if (i == 0) System.out.println(" 사과 : " + wishList[log][i]);
						else if (i == 1) System.out.println("바나나 : " + wishList[log][i]);
						else if (i == 2) System.out.println(" 딸기 : " + wishList[log][i]);
					}
				}
			}
			else if (sel == 5) {
				System.out.println("장바구니를 저장합니다.");
				
				try {
					
					fw = new FileWriter(fileName);
					
					for (int i = 0; i < wishList.length; i++) {
						for (int j = 0; j < wishList[i].length; j++) {
							fw.write(wishList[i][j] + "/");
						}
						fw.write("\n");
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {fw.close();} catch (Exception e2) {e2.printStackTrace();}
				}
			}
			else if (sel == 6) {
				System.out.println("장바구니를 불러옵니다.");
				
				try {
					
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					
					int k = 0;
					
					while (true) {
						
						String wish = br.readLine();
						if (wish == null) break;
						
						String[] wishSplit = wish.split("/");
						for (int i = 0; i < wishSplit.length-1; i++) {
							wishList[k][i] = Integer.parseInt(wishSplit[i]);
						}
						k += 1;
					}
					for (int i = 0; i < wishList.length; i++) {
						System.out.println(ids[i] + "님 장바구니 내역입니다.");
						for (int j = 0; j < wishList.length; j++) {
							if (j == 0) System.out.println(" 사과 : " + wishList[i][j]);
							else if (j == 1) System.out.println("바나나 : " + wishList[i][j]);
							else if (j == 2) System.out.println(" 딸기 : " + wishList[i][j]);
						}
					}
					System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {br.close();} catch (Exception e2) {e2.printStackTrace();}
					try {fr.close();} catch (Exception e2) {e2.printStackTrace();}
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