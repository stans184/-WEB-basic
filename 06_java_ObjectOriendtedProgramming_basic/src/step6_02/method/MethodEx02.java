package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*  # method의 4가지 형태
 * 
 * 		- 입력값(parameter , 매개변수 , 인수 , 인자 , argument)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * */
class MethodType {
	// 입력값도 없고 결과값도 없는 경우
	void type00() {
		System.out.println("no return");
	}
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) throws IOException {	// 매개변수
		// method 내부 변수
		String data = "java OOP instance method test";
		
		FileWriter fw = new FileWriter(fileName);
		fw.write(data);
		fw.close();
	}
	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 3.141592;
	}
	// 입력값과 결과값이 모두 있는 경우
	int type11(String birth) {
		String bornYear = birth.substring(0, 4);
		int age = 2023 - Integer.parseInt(bornYear);
		return age;
	}
}

public class MethodEx02 {

	public static void main(String[] args) {
		
		MethodType mt = new MethodType();
		
		// 입력값도 없고 결과값도 없는 경우
		mt.type00();
		// 입력값은 있고 결과값은 없는 경우
		try {
			mt.type10("method_test.txt");
//			mt.type10(100);					// parameter type incorrection
//			mt.type10('C');
//			mt.type10();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 입력값은 없고 결과값은 있는 경우
		double pi = mt.type01();
		System.out.println(pi);
		// 입력값과 결과값이 모두 있는 경우
		int memgerAge = mt.type11("19900865");
		System.out.println("나이는 " + memgerAge + "입니다.");
	}
}