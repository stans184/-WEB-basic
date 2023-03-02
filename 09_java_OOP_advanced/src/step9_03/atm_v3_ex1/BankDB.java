package step9_03.atm_v3_ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BankDB {

	private BankDB() {}
	private static BankDB bankDB = new BankDB();
	public static BankDB getInstance() {return bankDB;}
	
	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	
	File file;
	
	public void save() throws IOException {
		file = new File("ShinHanDB.txt");
		if (fw == null) fw = new FileWriter(file);
		
		var memberMngr = MemberManager.getInstance();
		
		System.out.println("saved!");
	}
	
	public void load() throws IOException {
		if (fr == null) fr = new FileReader(file);
		br = new BufferedReader(fr);
		
		var memberMngr = MemberManager.getInstance();
		
		System.out.println("loaded!");
	}
}