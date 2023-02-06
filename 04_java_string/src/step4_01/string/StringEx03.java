package step4_01.string;
/* 
 * # 문자열 관련 메서드
 * 				 method == function == 기능
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 첫번째 위치를 반환한다.  (반환타입은 int)
 * 3. 문자열.charAt(?번째)      				: 문자열의 ?번째에 포함된 데이터를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 */
public class StringEx03 {

	public static void main(String[] args) {
		
		String str = "megaitacademy";
		System.out.println(str);
		System.out.println("\n=======================================");
		
		// [1] length() : 문자열의 길이
		System.out.println(str.length());
		int strLength = str.length();
		System.out.println(strLength);
		if (str.length() == strLength) System.out.println("SAME");
		System.out.println("\n=======================================");
		
		// [2] indexOf("글자") : 글자가 포함된 첫번째 인덱스 확인
		System.out.println(str.indexOf('m'));
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('g'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("it"));
		System.out.println(str.indexOf("my"));
		System.out.println("\n=======================================");
		
		// [3] charAt(index) : 문자 한개 추출 (인덱싱)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(11));
		
		char ch = str.charAt(4);				// chatAt method 의 return 값은 char
												// 추후 비교하는 예시에서 혼동되지 않도록 주의
		System.out.println(ch);
		// 마지막 글자 뽑아내기
		
		try {
			System.out.println(str.charAt(strLength));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(str.charAt(strLength - 1));
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println("\n=======================================");
		
		// [4] substring() : 문자 여러개 추출 (슬라이싱)
		// 4-1) substring(index1이상, index2미만)
		System.out.println(str.substring(4, 6));
		
		String subS = str.substring(2, 4);
		System.out.println(subS);
		
		// 4-2) substring(index1부터 끝까지)
		System.out.println(str.substring(6));
		System.out.println(str.substring(strLength - 4));
		System.out.println("\n=======================================");
		
		// [5] split("구분자") : 구분자로 잘라내기 && 포함되어 있는 문자로 해야함 && 구분자는 출력되지 않음

		String[] splitTest = str.split("a");
		for (String word : splitTest) System.out.print(word + " ");
		System.out.println();
		
		String testUrl = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=s23+%ED%88%AC%EA%B3%A0&oquery=%EC%82%BC%EC%84%B1%EC%A0%84%EC%9E%90&tqi=h9x3HwprvTVssC%2BveZsssssstPl-233964";
		String[] splitUrl = testUrl.split("&");
		
		for (String url : splitUrl) System.out.println(url);
		System.out.println("\n=======================================");
		
		// [6] : 문자열 비교 : compareTo()		문자열 줄세우기, DB에서 order by ~ 로 주로 사용
		
		String str1 = "ac";
		String str2 = "zc";
		String str3 = "ab";
		
		System.out.println(str1.compareTo(str2));		// -3	왼쪽 기준이 오른쪽보다 작을 경우 음수가 반환된다, 해당하는 숫자는 ASCII 코드에서의 차이
		System.out.println(str1.compareTo(str3));		//  0   두 값이 같으면 0, 앞자리에서 값이 같으면 바로 뒷자리에서 비교
		System.out.println(str2.compareTo(str3));		//  3	왼쪽 기준이 오른쪽보다 크면 양수가 반환
	}
}