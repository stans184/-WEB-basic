package step9_02.bank_v2_ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
			if (clientMngr.clients.get(i).getBookList() != null) {
				for (int j = 0; j < clientMngr.clients.get(i).getBookList().size(); j++) {
					data += clientMngr.clients.get(i).getBookList().get(j).getBookNum() + "\t";
					data += clientMngr.clients.get(i).getBookList().get(j).getMoney() + "\t";
				}
			}
			data += "\n";
			fw.write(data);
		}
		fw.close();
		System.out.println("Client data saved in DB");
	}
	
	public void load() throws IOException {
		fr = new FileReader(bankDB);
		br = new BufferedReader(fr);
		
		clientMngr.clients = new ArrayList<>();
		
		while (true) {
			String read = br.readLine();
			if (read == null) break;
			
			String[] userSplit = read.split("\t");
			int bookCnt = userSplit.length;
			var addClient = new Client(userSplit[0], userSplit[1]);
			addClient.setBookList(new ArrayList<PassBook>());
			
			if (bookCnt > 2) {
				for (int i = 2; i < bookCnt; i+=2) {
					PassBook newPB = new PassBook(Integer.parseInt(userSplit[i]));
					newPB.setMoney(Integer.parseInt(userSplit[i+1]));
					addClient.getBookList().add(newPB);
				}
			}
			clientMngr.clients.add(addClient);
		}
		br.close();
		fr.close();
		System.out.println("Client data loaded from DB");
	}
}