package step7_01.objectArray;
//DTO (DataTransferObject) : 데이터 전송 모델 객체
//student data를 저장하는 class
//para >> id, pw, 기능 >> print

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class CrewDTO{
	private String crewId;
	private String crewPw;
	
	public CrewDTO(String id, String pw) {
		this.crewId = id;
		this.crewPw = pw;
	}

	public String getCrewId() {
		return crewId;
	}

	public void setCrewId(String crewId) {
		this.crewId = crewId;
	}

	public String getCrewPw() {
		return crewPw;
	}

	public void setCrewPw(String crewPw) {
		this.crewPw = crewPw;
	}

	@Override
	public String toString() {
		return "CrewDTO [crewId=" + crewId + ", crewPw=" + crewPw + "]";
	}
}

//student list를 관리하는 class
//studentlist는 arraylist로 생성
//add
//remove
//check
//print
//outdata >> save
//sort
//load
//getsize

class CrewController{

	ArrayList<CrewDTO> crewList = new ArrayList<CrewDTO>();
	
	void add(String id, String pw) {crewList.add(new CrewDTO(id, pw));}
	
	void delete(String id, String pw) {
		
		int delIdx = check(id, pw);
		
		if (delIdx == -1) System.out.println("no same crew id");
		else if (delIdx == -2) System.out.println("Password Wrong");
		else {
			System.out.println(crewList.get(delIdx).getCrewId() + " deleted");
			crewList.remove(delIdx);
		}
	}
	
	int check(String id, String pw) {
		CrewDTO checkCrew = new CrewDTO(id, pw);
		int checkIdx = -1;								// id 없으면 -1, pw 다르면 -2
		
		for (int i = 0; i < crewList.size(); i++) {
			if (crewList.get(i).getCrewId().equals(checkCrew.getCrewId())) {
				if (crewList.get(i).getCrewPw().equals(checkCrew.getCrewPw())) checkIdx = i;
				else checkIdx = -2;		
			}
		}
		return checkIdx;
	}
	
	void print() {
		if (crewList.size() == 0) System.out.println("No Crew in List");
		else if (crewList.size() > 0) {
			for (CrewDTO crew : crewList) System.out.println(crew.toString());
		}
	}
	
	void sort() {
		if (crewList.size() == 0) System.out.println("No Crew in List");
		else {
			for (int i = 0; i < crewList.size()-1; i++) {
				for (int j = i; j < crewList.size(); j++) {
					if (crewList.get(i).getCrewId().compareTo(crewList.get(j).getCrewId()) > 0) {
						CrewDTO tmpCrew = crewList.get(i);
						crewList.set(i, crewList.get(j));
						crewList.set(j, tmpCrew);
					}
				}
			}
		}
	}
	
	int getSize() {return crewList.size();}
	
	void save(File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		
		for (CrewDTO crew : crewList) {
			String data = crew.getCrewId() + "\t" + crew.getCrewPw() + "\n";
			fw.write(data);
		}
		fw.close();
	}
	
	void load(File file) throws IOException {
		
		if (!file.exists()) System.out.println("No Saved File");
		else {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			crewList = new ArrayList<CrewDTO>();
			
			while (true) {
				String data = br.readLine();
				if (data == null) break;
				String[] dataSplit = data.split("\t");
				add(dataSplit[0], dataSplit[1]);
			}
			
			br.close();
			fr.close();
		}
	}
}

public class ObjectArrayEx14_풀이1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CrewController crossFitCrew = new CrewController();
		
		File file = new File("crossFistCrew.txt");
		
		while (true) {
			System.out.println("\n1) join 2) withdraw 3) sort 4) print 5) save 6) load 7) Quit");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				System.out.print("Enter Crew Id >> ");
				String inId = sc.next();
				System.out.print("Enter Crew Pw >> ");
				String inPw = sc.next();
				
				crossFitCrew.add(inId, inPw);
			}
			else if (sel == 2) {
				System.out.print("Enter Crew Id >> ");
				String inId = sc.next();
				System.out.print("Enter Crew Pw >> ");
				String inPw = sc.next();
				
				crossFitCrew.delete(inId, inPw);
			}
			else if (sel == 3) crossFitCrew.sort();
			else if (sel == 4) crossFitCrew.print();
			else if (sel == 5) {
				try {
					crossFitCrew.save(file);
				} catch (Exception e) {System.out.println(e);}
			}
			else if (sel == 6) {
				try {
					crossFitCrew.load(file);
				} catch (Exception e) {System.out.println(e);}
			}
			else if (sel == 7) break;
		}
		sc.close();
	}
}