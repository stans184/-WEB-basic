package step9_04.student;
import java.util.Scanner;

/* 
 * 이 예시를 하는 취지를 생각해보면서 진행해보기
 * 
 * web  [view <> controller <> service 		  <> DAO 		<> DB]
 * 예제 [Main <> Controller <> insert, select <> StudentDAO <> StudentRepository]
 * 
 * - main 에서 입력을 받고
 * - controller에서 흐름을 제어하고
 * - DAO 에서 DB와 소통할 수 있는 양식으로 수정
 * 
 *  [분석]
 *  - VO 는 클래스간 정보를 주고받는 객체
 *  - DAO 는 DB 와 소통하는 객체
 *  - 모든 service 동작은 controller 객체를 통해서 접속되어야 함
 */

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		var controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				stInsert.insert(new StudentVO(id , num , name));
				
			}
			else if (selectMenu == 2) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면
				 *    이름과 번호를 변경할 수 있는 기능
				 * 
				 * */
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
					
				var stModify = controller.getModify();
				
			}
			else if (selectMenu == 3) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면 삭제
				 * 
				 * */
			}
			else if (selectMenu == 4) {
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				StudentVO st = stSelect.select(id);
				
				if (st != null) st.printOneInfo();
			
			}
			else if (selectMenu == 5) {
				
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			
			}
			else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			
			}
			
		}
		
	}

}
