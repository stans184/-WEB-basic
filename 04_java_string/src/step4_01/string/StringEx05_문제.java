package step4_01.string;

public class StringEx05_문제 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 35세
		int birthYear = Integer.parseInt(19+jumin.substring(0, 2));
		int nowYear = 2023;
		int age = nowYear - birthYear + 1;
		
		System.out.println("나이 : " + age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		char sexCode = jumin.charAt(7);
		
		if (sexCode == '1') System.out.println("MAN");
		else if (sexCode == '2') System.out.println("WOMAN");
		
	}

}
