package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 파일 출력 (File Output, File Load)

public class FileEx02 {

	public static void main(String[] args) {
		
		String fileName = "ex01.txt";
		
		File file = new File(fileName);						//	파일 객체 생성
		FileReader fr = null;								//	파일 읽어오기
		BufferedReader br = null;							//	텍스트 읽어오기
		
		if (file.exists()) {								//	exists() 파일이 존재하면 true, FileNotFoundException 과 역할이 겹침
															//	try ~ catch 를 설정한다면, 생략 가능
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = br.readLine();				//	readLine() text 한 줄을 읽어온다, IOException 이 발생할 수 있음, 자료형은 String
				System.out.println(data);					//	read 하고나서 커서는 이후 라인에서 대기
				System.out.println();
				
				System.out.println(br.readLine());
				System.out.println();
				
				// 전체 텍스트를 읽는 예시
				while (true) {
					data = br.readLine();
					if (data == null) {						//	readLine() 은 읽어올 데이터가 없으면 null 을 반환한다
						System.out.println("File 내용을 모두 읽었습니다.");
						break;
					}
					System.out.println(data);
					System.out.println();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {										//  나중에 생성한 객체를 먼저 close, stack 생각하면됨
				if (br != null) try {br.close();} catch (IOException e) {e.printStackTrace();}
				if (fr != null) try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
		}else System.out.println("File not found");
	}
}