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
		return num=100;
	}
	int testReturn() {
		System.out.println("리전 전 명령어 1");
		System.out.println("리전 전 명령어 2");
		System.out.println("리전 전 명령어 3");
//		return 1,2,3,4,5;	return 으로 넘어가는 데이터는 1개, 복수의 return data는 불가능
		return 0;
//		return 의 중요한 기능 중 하나인 method 종료, break 와 비슷하게 생각
//		return 을 만나는 순간 method 종료, return 아래의 기능은 실행되지 않는다
//		System.out.println("리전 후 명령어 1");
//		System.out.println("리전 후 명령어 2");
//		System.out.println("리전 후 명령어 3");
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx re = new ReturnEx();
		
		int score1 = 87;
		
		System.out.println("메서드 호출 전 : " + score1);
		re.setScore1(score1);
		System.out.println("메서드 호출 후 : " + score1);
		System.out.println();
		
		int score2 = 92;
		
		System.out.println("메서드 호출 전 : " + score2);
		score2 = re.setScore2(score2);
		System.out.println("메서드 호출 후 : " + score2);
	}
}