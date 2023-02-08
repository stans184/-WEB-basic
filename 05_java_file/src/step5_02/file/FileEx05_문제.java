package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

//# 파일 로드하기 : 연습문제

public class FileEx05_문제 {

	public static void main(String[] args) {
		
		
		// 4번 연습문제에서 작성된 테스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3];			// 20000, 30000 , 40000
		
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			int j = 0;

			while (true) {
				
				String data = br.readLine();
				
				if (data == null) break;
				
				String[] dataSplit = data.split("/");
				
				names[j] = dataSplit[0];
				pws[j] = dataSplit[1];
				moneys[j] = Integer.parseInt(dataSplit[2]);
				
				j += 1;
				
			}
			
		} catch (Exception e) {
		} finally {
			if (br != null) try {br.close();} catch (Exception e) {e.printStackTrace();}
			if (fr != null) try {fr.close();} catch (Exception e) {e.printStackTrace();}
		}
		System.out.print("names\t= ");
		System.out.println(Arrays.toString(names));
		System.out.print("pws\t= ");
		System.out.println(Arrays.toString(pws));
		System.out.print("money\t= ");
		System.out.println(Arrays.toString(moneys));
		
	}
}