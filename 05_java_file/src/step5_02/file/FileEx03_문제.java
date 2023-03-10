package step5_02.file;

import java.io.FileWriter;

//# 파일 저장하기 : 연습문제1

public class FileEx03_문제 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";

		for (int i = 0; i < ages.length; i++) {
			data += names[i] + "/" + ages[i] + ",";
		}
		
		data = data.substring(0, data.length() - 1);
		
		try (FileWriter fw = new FileWriter(fileName)){
			fw.write(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}