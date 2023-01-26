package step1_06.loop;


// # 삼각형 그리기

public class LoopEx28_문제 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3-i+1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 3-i; j++) {
				System.out.print("#");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		
		int k = 1;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j < 3-i; j++) {
				System.out.print(" ");
			}
			
		}

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
