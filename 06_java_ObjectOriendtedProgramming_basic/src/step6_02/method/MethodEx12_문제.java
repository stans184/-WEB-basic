package step6_02.method;

import java.util.Arrays;

class Ex12_1 {
	
	// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
	int myABS(int param) {
		if (param >= 0) return param;
		else return -param;
	}
	
	// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
	boolean checkEmailValidation(String email) {
		if (email.split("@").length > 1) return true;
		else return false;
	}
	
	// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
	String getFileExtention(String fileName) {
		String[] splitName = fileName.split("\\.");						// split 을 할때, 몇몇 문자들은 \\ 을 붙여줘야 동작한다. 사례는 구글링 ㄱ
		if (splitName.length > 1) {
			return splitName[1];
		}
		else return null;
	}
	
	// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
	int myPow(int param1 , int param2) {
		int result = 1;
		for (int i = 1; i <= param2; i++) {
			result *= param1;
		}
		return result;
	}
	
	// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
	int myIndexOf(String data , String word) {
		return data.indexOf(word);
	}
	
	// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
	// 문자열을 문자 배열로 저장) > 문자열.toCharArray()
	// 예시)                      > char[] 변수 = 문자열.toCharArray();
	char myCharAt(String data , int index) {
		char[] test = data.toCharArray();
		return test[index];
	}
	
	// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
	String mySubString1(String data , int startIndex) {
		char[] test = data.toCharArray();
		String result = "";
		for (int i = startIndex; i < test.length; i++) {
			result += test[i];
		}
		return result;
	}
	
	// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
	String mySubString2(String data , int startIndex , int endIndex) {
		char[] test = data.toCharArray();
		String result = "";
		for (int i = startIndex; i < endIndex; i++) {
			result += test[i];
		}
		return result;
	}
	
	// 지금은 split method 를 썼는데, 안쓰고 하는거 해보기
	// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
	String[] mySplit(String data , String sep) {
		return data.split(sep);
	}
}

public class MethodEx12_문제 {

	public static void main(String[] args) {

		Ex12_1 e = new Ex12_1();
		
		// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
		System.out.println(e.myABS(3));   // 3
		System.out.println(e.myABS(-3));  // 3 
		System.out.println(e.myABS(12));  // 12 
		System.out.println(e.myABS(-12)); // 12
		System.out.println();
		
		// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
		System.out.println(e.checkEmailValidation("qwer1234@naver.com"));    // true
		System.out.println(e.checkEmailValidation("qwer1234"));    			 // false
		System.out.println(e.checkEmailValidation("abcde@gmail.com"));    	 // true
		System.out.println(e.checkEmailValidation("abcde"));    			 // false
		System.out.println();
		
		// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
		System.out.println(e.getFileExtention("1.jpg"));  			// jpg   
		System.out.println(e.getFileExtention("캡처.png"));  		// png  
		System.out.println(e.getFileExtention("수업자료.txt"));  		// txt  
		System.out.println(e.getFileExtention("프로젝트 제안서.pdf"));  // pdf   
		System.out.println();
		
		// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
		System.out.println(e.myPow(3, 2));	// 9
		System.out.println(e.myPow(4, 2));	// 16
		System.out.println(e.myPow(5, 3));	// 125
		System.out.println(e.myPow(7, 3));	// 343
		System.out.println();
		
		// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
		System.out.println(e.myIndexOf("just do it!", "j"));  // 0
		System.out.println(e.myIndexOf("just do it!", "s"));  // 2
		System.out.println(e.myIndexOf("just do it!", "i"));  // 8
		System.out.println(e.myIndexOf("just do it!", "!"));  // 10
		System.out.println();
		
		// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
		// 문자열을 문자 배열로 저장) > 문자열.toCharArray()
		// 예시)                      > char[] 변수 = 문자열.toCharArray();
		System.out.println(e.myCharAt("just do it!", 0));    // j
		System.out.println(e.myCharAt("just do it!", 2));    // s
		System.out.println(e.myCharAt("just do it!", 8));    // i
		System.out.println(e.myCharAt("just do it!", 10));   // !
		System.out.println();
		
		// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
		System.out.println(e.mySubString1("200107-1234567", 2));    // 0107-1234567
		System.out.println(e.mySubString1("200107-1234567", 4));	// 07-1234567
		System.out.println(e.mySubString1("200107-1234567", 7));	// 1234567
		System.out.println(e.mySubString1("200107-1234567", 10));	// 4567
		System.out.println();
		
		// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
		System.out.println(e.mySubString2("200107-1234567", 0 , 2)); // 20
		System.out.println(e.mySubString2("200107-1234567", 2 , 4)); // 01
		System.out.println(e.mySubString2("200107-1234567", 4 , 6)); // 07
		System.out.println(e.mySubString2("200107-1234567", 0 , 6)); // 200107
		System.out.println();
		
		// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
		System.out.println(Arrays.toString(e.mySplit("a,b,c", ",")));		  // [a, b, c]
		System.out.println(Arrays.toString(e.mySplit("a,b,c,e,f,g", ",")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("a/b/c/e/f/g", "/")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("goodsCd=1 & goodsNm=스마트 TV & goodsPrice=3000000 & orderQty=1 & ordererId=qwer1234", "&")));  // [goodsCd=1 ,  goodsNm=스마트 TV ,  goodsPrice=3000000 ,  orderQty=1 ,  ordererId=qwer1234]
		
	}
}