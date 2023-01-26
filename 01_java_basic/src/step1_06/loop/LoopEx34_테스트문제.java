package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기 (for문)
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx34_테스트문제 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= 9-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
