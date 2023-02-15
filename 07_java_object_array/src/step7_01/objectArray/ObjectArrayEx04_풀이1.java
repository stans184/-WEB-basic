package step7_01.objectArray;

import java.util.Scanner;

class BankUser{
	String name;
	int money;
	
	public BankUser(String name, int money) {
		this.name = name;
		this.money = money;
	}
}

public class ObjectArrayEx04_풀이1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankUser[] bank = new BankUser[5];
		int usrCnt = 0;
		
		while (true) {
			
			System.out.println("1. join");
			System.out.println("2. widthdrawl");
			System.out.println("3. print");
			System.out.println("4. exit");
			System.out.print("Select menu : ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				if (usrCnt == bank.length) System.out.println("Account List Full");
				else {
					System.out.print("Enter user name : ");
					String usrName = sc.next();
					System.out.print("Enter user money : ");
					int usrMoney = sc.nextInt();
					int duplCheck = -1;
					
					for (int i = 0; i < usrCnt; i++) {
						if (bank[i].name.equals(usrName)) duplCheck = 0;
					}
					
					if (duplCheck == 0) {
						System.out.println("duplicated name");
					}
					else bank[usrCnt++] = new BankUser(usrName, usrMoney);  // usrCnt += 1;
				}
				System.out.println();
			}
			else if (sel == 2) {
				System.out.print("Enter user name : ");
				String usrName = sc.next();
				int delIdx = -1;
				
				for (int i = 0; i < usrCnt; i++) {
					if (bank[i].name.equals(usrName)) delIdx = i;
				}
				
				BankUser[] tmp = new BankUser[5];
				
				for (int i = 0; i < delIdx; i++) tmp[i] = bank[i];
				for (int i = delIdx; i < usrCnt-1; i++) tmp[i] = bank[i + 1];
				
				bank = tmp;
				usrCnt -= 1;
				System.out.println();
			}
			else if (sel == 3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(bank[i].name + " " + bank[i].money);
				}
				System.out.println();
			}
			else if (sel == 4) {
				System.out.println("Exit");
				break;
			}
			else System.out.println("Wrong number");
		}
		sc.close();
	}
}