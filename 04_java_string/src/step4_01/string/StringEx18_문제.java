package step4_01.string;

import java.util.Random;
import java.util.Scanner;
/*
	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료 
*/
public class StringEx18_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int[] check = new int[size];  // 힌트 체크를 통해서 확인할수있다.
		
		while (true) {
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				if (check[i] == 0) System.out.print("*");
				else System.out.print(word.charAt(i));
			}
			System.out.println();
			System.out.print("영어단어를 입력하세요 >>> ");
			String me = sc.next();
			
			// 같은게 들어오면 벗겨지고
			// 틀리면 5점 깎고 랜덤으로 하나 벗기고
			// 다 벗겨지거나, 정답이면 종료
			if (me.equals(word)) {
				System.out.println("정답입니다.");
				System.out.println("현재 점수는 " + score + "입니다.");
				break;
			}
			else {
				System.out.println("오답입니다.");
				score -= 5;
				
				while (true) {
					int rnNum = rm.nextInt(size);
					if (check[rnNum] == 0) {
						for (int i = 0; i < word.length(); i++) {
							if (word.charAt(i) == word.charAt(rnNum)) check[i] += 1;
						}
						check[rnNum] += 1;
						break;
					}
				}
			}
			
			int out = 0;
			
			for (int i = 0; i < check.length; i++) {
				if (check[i] != 0) out += 1;
			}
			
			if (out == check.length) {
				System.out.println("실패했습니다. 현재 점수는 " + score + "입니다.");
				break;
			}
		}
		sc.close();
	}
}