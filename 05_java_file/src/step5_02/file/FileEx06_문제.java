package step5_02.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[1단계] : 벡터

public class FileEx06_문제 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[]	vector = null;
		int elementCnt = 0;
		
		String fileName = "vector.txt";
		
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		while (true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if		(sel == 1) {
				if (elementCnt == 0) {
					System.out.print("추가할 벡터를 입력하세요 : ");
					int inVec = sc.nextInt();
					
					vector = new int[elementCnt+1];
					vector[elementCnt] = inVec;
					elementCnt += 1;
					
				}
				else {
					System.out.print("추가할 벡터를 입력하세요 : ");
					int inVec = sc.nextInt();
					
					int[] tmp = new int[elementCnt + 1];
					tmp[elementCnt] = inVec;
					
					for (int i = 0; i < vector.length; i++) {
						tmp[i] = vector[i];
					}
					
					vector = tmp;
					elementCnt += 1;
				}
				
				System.out.print("vector = ");
				System.out.println(Arrays.toString(vector));
			}
			else if (sel == 2) {
				System.out.print("삭제할 벡터를 입력하세요 : ");
				int delVec = sc.nextInt();
				int delIdx = -1;
				
				for (int i = 0; i < vector.length; i++) {
					if (delVec == vector[i]) delIdx = i;
				}
				
				if (delIdx == -1) System.out.println("값을 확인하세요");
				else {
					int[] tmp = new int[elementCnt-1];
					
					for (int i = 0; i < delIdx; i++) {
						tmp[i] = vector[i];
					}
					
					for (int i = delIdx; i < vector.length-1; i++) {
						tmp[i] = vector[i+1];
					}
					
					vector = tmp;
					elementCnt -= 1;
				}
				
				System.out.print("vector = ");
				System.out.println(Arrays.toString(vector));
			}
			else if (sel == 3) {
				System.out.println("text 파일로 저장합니다.");
				
				try {
					
					fw = new FileWriter(fileName);
					
					for (int i = 0; i < vector.length; i++) {
						fw.write(vector[i]+ "");
						if (i != vector.length -1) fw.write("\n");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (fw != null) try {fw.close();} catch (Exception e) {e.printStackTrace();}
				}
			}
			else if (sel == 4) {
				System.out.println("저장된 vector text를 불러옵니다.");
				
				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					
					int[] tmp = new int[elementCnt];
					
					int i = 0;
					
					while (true) {
						String data = br.readLine();
						if (data == null) break;
						
						tmp[i++] = Integer.parseInt(data);
					}
					
					vector = tmp;
					
					System.out.print("vector = ");
					System.out.println(Arrays.toString(vector));
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (br != null) try {br.close();} catch (Exception e) {e.printStackTrace();}
					if (fr != null) try {fr.close();} catch (Exception e) {e.printStackTrace();}
				}
			}
			else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}