package step7_01.objectArray;

class AccountTest{
	String acount;
	int money;
}

public class ObjectArrayEx03_풀이1 {

	public static void main(String[] args) {
		
		AccountTest[] bank = new AccountTest[2];
		
		for (int i = 0; i < bank.length; i++) {
			bank[i] = new AccountTest();
		}
		
		bank[0].acount = "qwer";
		bank[0].money = 1000000;
		
		bank[1].acount = "asdf";
		bank[1].money = 22222222;
		
		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i].acount + " : " + bank[i].money);
		}
		
		System.out.println("\n=================\n");
		
		AccountTest tmp = bank[1];
		tmp.acount = "zxcv";
		tmp.money = 2342351;
		
		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i].acount + " : " + bank[i].money);
		}
	}
}
