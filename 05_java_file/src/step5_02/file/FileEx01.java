package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 파일 입력 (File Input)
   파일 입출력은 try, catch구문 없이 사용하지 못하도록 강제성 부여
   파일이 생성되는 기본적인 위치는 현재 자바파일과 같은 프로젝트 폴더(위치변경가능)
   소스를 실행한 후 프로젝트를 선택 한 뒤 F5(Refresh)를 누르면 생성된 파일을 확인할 수 있다.
*/
/*	- write메서드를 통해서 파일에 데이터 입력이 가능하다.

	1) 문자열 데이터 형식만 가능하다.
	2) 개행기능이 없기 때문에 \n를 의도적으로 작성해야 한다.
	3) write메소드를 여러번 사용하지 않고 데이터를 미리 +=로 만들어 놓고 한번만 write메소드를 사용하는 것을 권장한다.
*/

public class FileEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while (true) {
			System.out.print("Enter some sentence : ");
			String inStr = sc.nextLine();
			
			if (inStr.equals("end")) break;
			str += inStr;								// \n 개행은 인풋이 안됨, + "\n" 더하기로 넣어줘야 함
		}
		
		System.out.println("str = " + str);
		
		FileWriter fw = null;
		String fileName1 = "ex01.txt";
		String fileName2 = "ex01_02.txt";
		
		try {
			
			fw = new FileWriter(fileName1);				// 파일을 생성하는 기능의 객체, 동일한 이름이 있다면 덮어쓰기됨 (주의)
			
			fw.write(str);								// write method 는 개행 기능이 없으므로, \n 을 꼭 넣어줘야함
			fw.write("\n개행은 인풋이 안되나?");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {										// file control 에서 close는 필수, 객체 종료 / try 구문에서 error 발생해도 닫을 수 있게 finally 에서 close
			if (fw != null) try {fw.close();} catch (IOException e) {
				e.printStackTrace();
				System.out.println("File not opened");
			} 										
			System.out.println("Sentence added, program exit");
		}
		
		// 아니면
		
		try (FileWriter fw2 = new FileWriter(fileName2)){
			fw2.write(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}