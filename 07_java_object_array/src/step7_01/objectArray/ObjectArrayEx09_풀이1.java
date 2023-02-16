package step7_01.objectArray;

import java.io.*;
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
			tmpCrew[crewCnt] = new Crew(id, pw);
			crewCnt += 1;
			crewList = new Crew[crewCnt];
			crewList = tmpCrew;
		}
	}
	
	void withdraw(int num, String pw) {
		if (!pw.equals(crewList[num].getCrewPw())) System.out.println("Wrong PW");
		else {
			System.out.println(crewList[num].getCrewId() + ", withdraw proceed");
			
			Crew[] tmpCrew = new Crew[crewList.length-1];
			
			for (int i = 0; i < num; i++) tmpCrew[i] = crewList[i];
			for (int i = num; i < crewList.length-1; i++) tmpCrew[i] = crewList[i+1];
			
			crewList = new Crew[crewList.length-1];
			crewList = tmpCrew;
			crewCnt -= 1;
		}
	}
	
	void sortData() {
		for (int i = 0; i < crewList.length; i++) {
			for (int j = 0; j < crewList.length; j++) {
				if (crewList[i].getCrewId().compareTo(crewList[j].getCrewId()) < 0) {
					Crew tmp = crewList[i];
					crewList[i] = crewList[j];
					crewList[j] = tmp;
				}
			}
		}
		System.out.println("CREW LIST sorted");
	}
	
	void printList() {
		System.out.println("CREW ID LIST");
		for (int i = 0; i < crewCnt; i++) {
			System.out.println("[" + (i+1) + "] " + crewList[i].getCrewId());
		}
		System.out.println();
	}
	
	void saveData(String name) throws IOException {
		
		fileName = name + "DB.txt";
		
		FileWriter fw = new FileWriter(fileName);
		
		for (int i = 0; i < crewList.length; i++) {
			fw.write(crewList[i].getCrewId() + "\t" + crewList[i].getCrewPw() + "\n");
		}
		System.out.println("CREW DB saved");
		fw.close();
	}
	
	void loadData(String name) throws IOException {
		
		fileName = name + "DB.txt";
		File file = new File(fileName);
		
		if (!file.isFile()) System.out.println("no saved file");
		else {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			crewList = null;
			
			while (true) {
				String readData = br.readLine();
				if (readData == null) break;
				else {
					String[] splitData = readData.split("\t");
					addCrew(splitData[0], splitData[1]);
				}
			}
//			얘는 안되는데 둘간의 차이가 뭘까?
//			while (br.readLine() != null) {
//				System.out.println(br.readLine());
//			}
//			그리고 밑에처럼 닫아줘도 되나?
			br.close();
		}
	}
}

public class ObjectArrayEx09_풀이1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CrewSystem cs = new CrewSystem();
		
		while (true) {
			System.out.println();
			System.out.println("1) join 2) withdraw 3) sort 4) print 5) save 6) load 7) Quit");
			int selMenu = sc.nextInt();
			if (selMenu == 1) {
				System.out.print("Enter ID >> ");
				String newId = sc.next();
				System.out.print("Enter PW >> ");
				String newPw = sc.next();
				
				cs.addCrew(newId, newPw);
			}
			else if (selMenu == 2) {
				cs.printList();
				System.out.print("Enter Crew number >> ");
				int delNum = sc.nextInt()-1;
				System.out.print("Enter Crew Pw >> ");
				String delPw = sc.next();
				
				cs.withdraw(delNum, delPw);
			}
			else if (selMenu == 3) cs.sortData();
			else if (selMenu == 4) cs.printList();
			else if (selMenu == 5) {
				System.out.print("Enter DB name >> ");
				String dbName = sc.next();
				
				try {
					cs.saveData(dbName);
				} catch (IOException e) {System.out.println(e);}
			}
			else if (selMenu == 6) {
				System.out.print("Enter DB name >> ");
				String dbName = sc.next();
				
				try {
					cs.loadData(dbName);
					System.out.println("DB loaded");
				} catch (IOException e) {System.out.println(e);}
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