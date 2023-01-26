package step1_05.controlStatement;
//중첩 if 문
// - if 문 안의 명령어에 if문이 여러번 들어감
public class IfEx08 {

	public static void main(String[] args) {

		int grade = 100;
		
		if (grade >= 60) {
			if (grade == 100) {
				System.out.println("GREAT");
			}
			System.out.println("PASS");
		}
		if (grade < 60) {
			System.out.println("FAIL");
		}
		
		
	}

}
