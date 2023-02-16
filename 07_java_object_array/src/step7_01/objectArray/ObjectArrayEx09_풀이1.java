package step7_01.objectArray;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Crew{
	private String crewId;
	private String crewPw;
	
	public Crew(String id, String pw) {
		this.crewId = id;
		this.crewPw = pw;
	}
	
	void print() {
		System.out.println(crewId + "님, 비밀번호 : " + crewPw.charAt(0));
	}

	public String getCrewId() {
		return crewId;
	}

	public String getCrewPw() {
		return crewPw;
	}
}

class CrewSystem{
	
	Crew[] crewList;
	int crewCnt;
	String fileName;
	
	void addCrew(String id, String pw) {
		if (crewCnt == 0) {
			crewList = new Crew[1];
			crewList[0] = new Crew(id, pw);
			crewCnt += 1;
		}
		else {
			Crew[] tmpCrew = new Crew[crewCnt + 1];
			
			for (int i = 0; i < crewCnt; i++) tmpCrew[i] = crewList[i];
			crewList[crewCnt] = new Crew(id, pw);
			crewCnt += 1;
			crewList = new Crew[crewCnt];
			crewList = tmpCrew;
		}
	}
	
	void withdraw(int num) {
		
		
	}
	
	void sortData() {
		
	}
	
	void printList() {
		System.out.println("CREW ID LIST");
		for (int i = 0; i < crewCnt; i++) {
			System.out.print("[" + (i+1) + "] " + crewList[i].getCrewId());
		}
	}
	
	void saveData(String name) throws IOException {
		
		fileName = "/DB" + name + ".txt";
		
		FileWriter fw = new FileWriter(fileName);
	}
	
	void loadData() throws FileNotFoundException {
		
		if (fileName == null) System.out.println("no saved file");
		else {
			FileReader fr = new FileReader(fileName);
		}
	}
}

public class ObjectArrayEx09_풀이1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.println("1) join 2) withdraw 3) sort 4) print 5) save 6) load 7) Quit");
			int selMenu = sc.nextInt();
			if (selMenu == 1) {
				
			}
			else if (selMenu == 2) {
				
			}
			else if (selMenu == 3) {
				
			}
			else if (selMenu == 4) {
				
			}
			else if (selMenu == 5) {
				
			}
			else if (selMenu == 6) {
				
			}
			else if (selMenu == 7) {
				System.out.println("System Terminating");
				break;
			}
			else System.out.println("Wrong Menu Number\n");
		}
		sc.close();
	}
}