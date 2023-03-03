package step9_03.atm_v3_ex1;

import java.io.IOException;

public class BankDB {

	private BankDB() {}
	private static BankDB bankDB = new BankDB();
	public static BankDB getInstance() {return bankDB;}
	
	
	public void save() throws IOException {
	}
	
	public void load() throws IOException {
	}
}