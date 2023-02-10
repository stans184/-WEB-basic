package step6_02.method;
/* # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 * */
class ReturnEx{
	void setScore1(int num) {
		num += 100;
	}
	int setScore2(int num) {
		num = 100;
		return num;
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx re = new ReturnEx();
		
		int score1 = 87;
		
		System.out.println("메서드 호출 전 : " + score1);
		re.setScore1(score1);
		System.out.println("메서드 호출 후 : " + score1);
		
		int score2 = 92;
		
		System.out.println("메서드 호출 전 : " + score2);
		score2 = re.setScore2(score2);
		System.out.println("메서드 호출 후 : " + score2);
	}
}