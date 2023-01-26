package step1_06.loop;

public class LoopEx02_연습 {
	public static void main(String[] args) {
		
		int i = 1;
		
		while (i<=10) {
			
			if (i % 2 == 1) {
				System.out.println(i);

			}
			i += 1;
			
		}
		
		System.out.println();
		
		int j = 10;
		
		while (j>0) {
			if (j >= 3 && j <= 7) {
				System.out.println(j);
			}
			
			j -= 1;
		}
		
		System.out.println();
		
		int k = 1;				// i,j,k,l,n,m
		int cnt = 0;
		while (k <= 10000) {
			if (k%741 == 0) {
				cnt += 1;
			}
			
			k += 1;
		}
		
		System.out.println(cnt);
	}
}
