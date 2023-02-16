package step7_01.objectArray;
//# 학생 추가 삭제 컨트롤러
//=> 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//김철수 : 과목3개 수학 50 국어50 영어 60 
//이만수 : 과목2개 수학 20 국어 30 
//이영희 : 과목1개 수학 100

import java.util.Scanner;

class Subject8_2{
	private String name;
	private int score;
	
	public Subject8_2(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

class Student8_2{
	Subject8_2[] subjectList;
	private String name;
	
	public Student8_2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Controller8_2{
	
	Student8_2[] studentList;
	int stdCnt;
	
	void addStudent(String name) {
		if (stdCnt == 0) {
			studentList = new Student8_2[1];
			studentList[0] = new Student8_2(name);
			stdCnt += 1;
		}
		else {
			Student8_2[] tmp = new Student8_2[stdCnt + 1];
			
			for (int i = 0; i < stdCnt; i++) tmp[i] = studentList[i];
			tmp[stdCnt] = new Student8_2(name);
			
			studentList = new Student8_2[stdCnt + 1];
			studentList = tmp;
			stdCnt += 1;
		}
	}
	
	void addSubject(int num, String name, int score) {
		if (studentList[num].subjectList == null) {
			studentList[num].subjectList = new Subject8_2[1];
			studentList[num].subjectList[0] = new Subject8_2(name, score);
		}
		else {
			int subCnt = studentList[num].subjectList.length;
			Subject8_2[] tmp = new Subject8_2[subCnt + 1];
			for (int i = 0; i < subCnt; i++) tmp[i] = studentList[num].subjectList[i];
			tmp[subCnt] = new Subject8_2(name, score);
			
			studentList[num].subjectList = new Subject8_2[subCnt+1];
			studentList[num].subjectList = tmp;
		}
	}
	
	void printStudentList() {
		System.out.println();
		System.out.println("Student List");
		for (int i = 0; i < stdCnt; i++) {
			System.out.println("[" + (i+1) + "] " + studentList[i].getName());
		}
	}
	
	void printSubjectList(int num) {
		System.out.println(studentList[num].getName() + "'s report");
		System.out.println("================");
		System.out.println("subject\tscore");
		System.out.println("================");
		for (int i = 0; i < studentList[num].subjectList.length; i++) {
			System.out.println(studentList[num].subjectList[i].getName() + "\t" + studentList[num].subjectList[i].getScore());
		}
		System.out.println("================");
	}
}

public class ObjectArrayEx08_풀이2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Controller8_2 control = new Controller8_2();
		
		while (true) {
			System.out.println();
			System.out.println("[1] Add Student");
			System.out.println("[2] Print Student List");
			System.out.println("[3] Add Subject");
			System.out.println("[0] Exit Controller");
			System.out.print("Select menu >> ");
			try {
				int sel = sc.nextInt();
				
				if (sel == 1) {
					System.out.print("Enter Student name >> ");
					String inName = sc.next();
					control.addStudent(inName);
					
					boolean subjectControl = true;
					while (subjectControl) {
						System.out.println();
						System.out.println("Do you want to add " + inName + "'s subject ?");
						System.out.print("(1) yes, (2) no  >> ");
						int addSel = sc.nextInt();
						if (addSel == 1) {
							System.out.print("Enter Subject Name >> ");
							String subName = sc.next();
							System.out.print("Enter Subject Score >> ");
							int subScore = sc.nextInt();
							
							control.addSubject(control.stdCnt-1, subName, subScore);
						}
						else if (addSel == 2) subjectControl = false;
					}
				}
				else if (sel == 2) {
					control.printStudentList();
					
					System.out.println();
					System.out.println("If you want to print someone's subject,");
					System.out.print("Please Enter the number >> ");
					int selStu = sc.nextInt()-1;
					control.printSubjectList(selStu);
				}
				else if (sel == 3) {
					control.printStudentList();
					System.out.println();
					System.out.print("Enter Student Number >> ");
					int selStd = sc.nextInt()-1;
					System.out.print("Enter Subject name >> ");
					String inName = sc.next();
					System.out.print("Enter Subject score >> ");
					int inScore = sc.nextInt();
					
					control.addSubject(selStd, inName, inScore);
				}
				else if (sel == 0) {
					System.out.println("Quit Student Controller Program");
					break;
				}
				else System.out.println("Wrong Menu number");
			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
		}
		sc.close();
	}
}