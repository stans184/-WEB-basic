package step7_01.objectArray;

import java.util.Scanner;

class Subject_ex08{
	String name;
	int score;
}

class Student8_ex08{
	Subject_ex08[] subjects;
	String name;
}

// # 학생 추가 삭제 컨트롤러
//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//   김철수 : 과목3개 수학 50 국어50 영어 60 
//   이만수 : 과목2개 수학 20 국어 30 
//   이영희 : 과목1개 수학 100

public class ObjectArrayEx08_풀이1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반 학생 수를 입력하세요 : ");
		int clazCnt = sc.nextInt();
		Student8_ex08[] stdList = new Student8_ex08[clazCnt];
		int stdCnt = 0;
		
		while (true) {
			System.out.println();
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]출력하기");
			System.out.println("[5]종료하기");
			System.out.print("Select Menu : ");
			// int 로 인풋을 받으면 InputMismatchException 이 발생할 가능성이 있다
			// 이렇게 통으로 감싸버리면 한번에 예외가 발생되어 빠져나오게 된다
			// 예외처리를 어느 시점에 하고 싶은지는, 프로그램의 작성 방향에 따라 다르다
			// 에러 발생 시점에 다시 인풋을 받도록 의도 할건지 등
			try {
				int sel = sc.nextInt();
				
				if (sel == 1) {
					if (stdCnt == 3) System.out.println("리스트가 다 찼습니다.");
					else {
						System.out.print("Enter student Name : ");
						String inName = sc.next();
						stdList[stdCnt] = new Student8_ex08();
						stdList[stdCnt].name = inName;
						stdCnt += 1;
					}
				}
				else if (sel == 2) {
					// 학생 명단 출력
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("[" + (i+1) + "] " + stdList[i].name);
					}
					
					System.out.print("\nSelect student : ");
					int selStd = sc.nextInt()-1;
					System.out.print("Enter subject name : ");
					String subName = sc.next();
					// 해당 학생의 과목이 비어있다면 배열을 1개만 생성해서 넣어줌
					if (stdList[selStd].subjects == null) {
						stdList[selStd].subjects = new Subject_ex08[1];
						stdList[selStd].subjects[0] = new Subject_ex08();
						stdList[selStd].subjects[0].name = subName;
					}
					// 해당 학생의 과목 배열이 비어있지 않다면
					// 현재 개수에다가 하나를 더한 임시배열을 생성하고
					// 그곳의 마지막 칸에 원하는 과목을 입력 받은 후 다시 임시배열을 학생의 과목 배열로 옮김
					else {
						int subCnt = stdList[selStd].subjects.length + 1;
						
						Subject_ex08[] tmpSub = new Subject_ex08[subCnt];
						for (int i = 0; i < stdList[selStd].subjects.length; i++) {
							tmpSub[i] = stdList[selStd].subjects[i];
						}
						tmpSub[subCnt-1] = new Subject_ex08();
						tmpSub[subCnt-1].name = subName;
						
						stdList[selStd].subjects = new Subject_ex08[subCnt];
						stdList[selStd].subjects = tmpSub;
					}
				}
				else if (sel == 3) {
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("[" + (i+1) + "] " + stdList[i].name);
					}
					
					System.out.print("\nSelect student : ");
					int selStd = sc.nextInt()-1;
					System.out.println();
					
					for (int i = 0; i < stdList[selStd].subjects.length; i++) {
						System.out.println("[" + (i+1) + "] " + stdList[selStd].subjects[i].name + " : " + stdList[selStd].subjects[i].score);
					}
					
					System.out.print("Select subject : ");
					int selSub = sc.nextInt()-1;
					System.out.print("Enter subject score : ");
					int subScore = sc.nextInt();
					
					stdList[selStd].subjects[selSub].score = subScore;
					
				}
				else if (sel == 4) {
					for (int i = 0; i < stdCnt; i++) {
						System.out.println("=======================");
						System.out.println(stdList[i].name + " 성적");
						System.out.println("=======================");
						for (int j = 0; j < stdList[i].subjects.length; j++) {
							System.out.println(stdList[i].subjects[j].name + " : " + stdList[i].subjects[j].score);
						}
						System.out.println("=======================");
					}
				}
				else if (sel == 5) {
					System.out.println("System Exit");
					break;
				}
				else System.out.println("Wrong number");
			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();							// nextInt 에서 다른 인풋이 들어와서 오류가 났을 때, 바로 에러로 넘어가서 지속적으로 발생된다
			}											// nextLine 으로 enter 의 인풋을 제거해줘야 함
			
		}
		sc.close();
	}
}