package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)
// compareTo
public class StringEx13_문제 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		// 한번 돌린거로는 안나와서 2번 훑었는데,
		// 이거 정렬하는거 한번에 할수 있는 방법이 있을까
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < names.length-1; i++) {
				if (names[i].compareTo(names[i+1]) > 0) {
					String tmpS = names[i];
					names[i] = names[i+1];
					names[i+1] = tmpS;
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
	}
}