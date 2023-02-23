package step9_02.bank_v2_ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BankDB {
	
	ClientManager clientMngr = ClientManager.getInstance();

	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	File bankDB = new File("BankDB.txt");
	
	public void save() throws IOException {
		fw = new FileWriter(bankDB);
		
		for (int i = 0; i < clientMngr.clients.size(); i++) {
			String data = clientMngr.clients.get(i).getClientId() + "\t";
			data += clientMngr.clients.get(i).getClientPw() + "\t";
			for (int j = 0; j < clientMngr.clients.get(i).getBookList().size(); j++) {
				data += clientMngr.clients.get(i).getBookList().get(j).getBookNum() + "\t";
				data += clientMngr.clients.get(i).getBookList().get(j).getMoney() + "\t";
			}
			data += "\n";
			fw.write(data);
		}
		fw.close();
	}
	
	public void load() throws IOException {
		fr = new FileReader(bankDB);
		br = new BufferedReader(fr);
		
		if (clientMngr.clients == null) clientMngr.clients = new ArrayList<>();
		
		while (true) {
			String read = br.readLine();
			if (read == null) break;
			
			String[] userSplit = read.split("\n");
			
			for (int i = 0; i < userSplit.length; i++) {
				String[] userData = userSplit[i].split("\t");
				int bookCnt = (userData.length-1)/2;
				
				Client newMan = new Client(userData[0], userData[1]);
				ArrayList<PassBook> bookList = new ArrayList<>();
				
				for (int j = 0; j < bookCnt; j++) {
//					bookList.add(new PassBook(j))
				}
			}
		}
		
		br.close();
		fr.close();
	}
}