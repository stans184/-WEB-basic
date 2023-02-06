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

public class StringEx18_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; 
		
		while (true) {
			
			int cnt = 0;
			
			for (int i = 0; i < size; i++) {
				if (check[i] == 0) {
					cnt++;
					break;
				}
			}
			if (cnt == 0) {
				break;
			}
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				if (check[i] == 1) {
					System.out.print(word.charAt(i));
				}
				else {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			if (!me.equals(word)) {
				score -= 5;
				while (true) {
					int r = ran.nextInt(size);
					if (check[r] == 0) { 
						check[r] = 1;
						for (int i = 0; i < size; i++) {
							if (word.charAt(i) == word.charAt(r)) { 
								check[i] = 1;
							}
						}
						break;
					}
				
				}
				
			}
			else {
				System.out.println("정답 : " + word);
				System.out.println("점수 : " + score);
				break;
			}
			
		}

		scan.close();
		
	}

}
