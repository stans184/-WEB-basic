package step9_02.bank_v2_ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BankDB {
	
	ClientManager clientMngr = ClientManager.getInstance();

	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	File bankDB = new File("BankDB.txt");
	
	public void save() throws IOException {
		fw = new FileWriter(bankDB);
		
		fw.close();
	}
	
	public void load() throws IOException {
		fr = new FileReader(bankDB);
		br = new BufferedReader(fr);
		
		br.close();
		fr.close();
	}
}