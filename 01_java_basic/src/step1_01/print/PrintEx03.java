package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03 {
	
	public static void main(String[] args) {
		
		/* # 이스케이프 문자 ( escape sequence ) 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \" : 문자 자체 " (문법x)
		 */
		System.out.println("hello\nworld");
		System.out.println("hello\tworld");
		System.out.println("\"helloworld\"");			// "helloworld"
		System.out.println("hello\\.world");			// hello\.world
		System.out.println("C:\\program files\\java");	// C:\program files\java
		System.out.println("\n====================================\n");

		/* # 서식 문자 출력		C-lang style
		 *  1) %d : 정수		decimal
		 *  2) %f : 실수		float
		 *  3) %c : 단일 문자	character
		 *  4) %s : 문자열		string
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
		int num = 92;
		double pi = 3.141592;
		System.out.printf("%d", num);
		System.out.println();
		System.out.printf("%.2f", pi);
		System.out.println();
		System.out.printf("%.3f", pi);
		System.out.println();
		System.out.printf("%c", 'A');
		System.out.println();
		System.out.printf("%s", "this is earth");
		System.out.println();
		int total = 450;
		double avg = (double) total/4;
		System.out.printf("total score : %d, average : %.2f", total, avg);
//		web 으로 따지면 =>              front end           ,    back end
		System.out.println();
		System.out.printf("name : %s, age : %d, total : %d, avg : %.2f", "jack", 23, 180, 78.1234);
		System.out.println();
		System.out.println("\n====================================\n");

		/* # 시간 (TimeStamp)
		 *  1) new Date()
		 *   - 현재시간 정보를  생성한다.
		 *  	java.util.Date > 날짜 + 시간
		 *  	java.sql.Date  > 날짜
		 *  
		 *  2) System.currentTimeMillis()
		 *   - 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 *   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long으로 저장한다.
		 *   
		 * # 시간 출력 형식 SimpleDateFormat
		 *   - 날짜 및 시간 출력 서식 지정 방법은 SimpleDateFormat 객체를 사용하여 구현한다.
		 *   - SimpleDateFormat 변수명 = new SimpleDateFormat("날짜 및 시간 서식"); 형태로 객체를 생성한다.
		 *   - sdf.format(date); 메서드를 사용하여 날짜 표현식을 지정한다.
		 *   - 상세 서식은 구글에서 "simpleDateformat 형식"을 검색하여 사용한다.
		 *   - 중요)날짜타입 데이터에서 String 으로 데이터의 형이 변환된다.
		 *   - 데이터를 관리하고 조작할 때는 기존 타입으로
		 */
		Date time1 = new Date();
		System.out.println(time1);					// Mon Feb 13 14:05:32 KST 2023
		long time2 = System.currentTimeMillis();
		System.out.println(time2);					// 1676264945881

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		String date1 = sdf1.format(time1);
		String date2 = sdf1.format(time2);			// 2023.02.13
		System.out.println("yyyy.MM.dd : " + date1);
		System.out.println("yyyy.MM.dd : " + date2);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String date3 = sdf2.format(time2);			// 2023-02-13
		System.out.println("yyyy-MM-dd : " + date3);

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일, hh시 mm분 ss초");		// 분 - mm, 월 - MM
		String date4 = sdf3.format(time2);			// 2023년 02월 13일, 02시 17분 30초
		System.out.println("yyyy년 MM월 dd일, hh시 mm분 ss초 : " + date4);
		System.out.println("\n====================================\n");
		
		/* # 숫자 형식
		 *  1) DecimalFormat df = new DecimalFormat("숫자 서식");
		 *   - 숫자 서식은  "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여주어 표현한다.
		 *   - .format(숫자데이터); 메서드를 사용하여 숫자 출력형식을 지정한다.
		 *   - 상세 서식은 구글에서 "DecimalFormat 형식"을 검색하여 사용한다.
		 *   - 중요)숫자 타입에서 글자타입으로 데이터의 형이 변환된다.
		 * */
		int salary1 = 10000;
		int salary2 = 100000;
		int salary3 = 1000000;
		DecimalFormat df1 = new DecimalFormat("#,##0");		// 3번째에서 끊어라
		String numEx1 = df1.format(salary1);
		String numEx2 = df1.format(salary2);
		String numEx3 = df1.format(salary3);
		System.out.println(numEx1);
		System.out.println("$" + numEx2);					// 100,000
		System.out.println(numEx3+"원");
		
		DecimalFormat df2 = new DecimalFormat("#,###0");
		String numEx04 = df2.format(salary1);
		String numEx05 = df2.format(salary2);
		String numEx06 = df2.format(salary3);
		System.out.println(numEx04);
		System.out.println(numEx05);						// 10,0000
		System.out.println(numEx06);
		System.out.println("\n====================================\n");
	}
}