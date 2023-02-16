package step7_01.objectArray;

import java.util.Random;

class Subject{
	String name;
	int score;
}

class Student{
	Subject[] subjects;
	String name;
	
	double getAvg() {
		int sum = 0;
		for (int i = 0; i < subjects.length; i++) sum += subjects[i].score;
		
		return (double) sum/subjects.length;
	}
}

public class ObjectArrayEx07_풀이1 {

	public static void main(String[] args) {
		
		Random rm = new Random();
		
		Student[] studentList = new Student[3];
		
		for (int i = 0; i < studentList.length; i++) {
			studentList[i] = new Student();
			studentList[i].name = "학생 " + (i+1);
			studentList[i].subjects = new Subject[i+1];
			for (int j = 0; j < studentList[i].subjects.length; j++) {
				studentList[i].subjects[j] = new Subject();
				studentList[i].subjects[j].name = "과목" + (j+1);
				studentList[i].subjects[j].score = rm.nextInt(100) + 1;
			}
		}
		
		for (int i = 0; i < studentList.length; i++) {
			System.out.println();
			System.out.println("student name : " + studentList[i].name);
			System.out.println("subject list");
			System.out.println("================");
			for (int j = 0; j < studentList[i].subjects.length; j++) {
				System.out.println(studentList[i].subjects[j].name + "\t: " + studentList[i].subjects[j].score + "점");
			}
			System.out.println("================");
			System.out.println("평균\t: " + studentList[i].getAvg());
			System.out.println("================");
		}
	}
}