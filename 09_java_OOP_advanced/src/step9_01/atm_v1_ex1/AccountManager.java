package step9_01.atm_v1_ex1;
//- 입금
//- 출금
//- 계좌 생성
//- 계좌 삭제
import java.util.Random;

public class AccountManager {

	UserManager usrMngr = new UserManager();
	Random rm = new Random();
	int usrIdx = usrMngr.getIdentifier();
	
	public void printAccountList() {
		
	}
	
	public void deposit(int money) {
		
	}
	
	public void withdraw(int money) {
		
	}
	
	public void makeAccount() {
		int newAccNum = rm.nextInt(899999)+100000;
		// 나중에 account num 중복 체크도 넣어보자
		var newAcc = new Account();
		newAcc.setAccountNum(newAccNum);
		
		usrMngr.userList.get(usrIdx).getAccountList().add(newAcc);
	}
	
	public void deleteAccount(int accNum) {
		int delAccIdx = -1;
	}
}
