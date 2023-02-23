package step9_01.atm_v1_ex1;
import java.util.ArrayList;
//- 입금
//- 출금
//- 계좌 생성
//- 계좌 삭제
import java.util.Random;

public class AccountManager {
	
	// UserManager class 에 log out 기능 생성을 위한 singleton
	private static AccountManager accountManager;
	
	private AccountManager() {}
	
	public static AccountManager getInstance() {
		if (accountManager == null) accountManager = new AccountManager();
		return accountManager;
	}

	Random rm = new Random();
//	UserManager usrMngr = new UserManager();
//	여기서 -1 이 가져와짐,, 이유는 위에서 UserManager class 를 다시 불러와서 그런가?
//	싱글톤 패턴으로 해결할 수 있을 듯, UserManager SingleTon 으로 구현함
	UserManager usrMngr = UserManager.getInstance();
	int usrIdx = usrMngr.getIdentifier();
	
//	지금 유저의 계좌에 접근을 못하고 있음,,, 한번 돌때만 저장되고 나가면 초기화되고
//	계좌 리스트를 반환해서 해결 - 방법 2가지
	ArrayList<Account> usrAccList = usrMngr.userList.get(usrIdx).getAccountList();

	// [1]
	public ArrayList<Account> getUsrAccList() {
		return usrAccList;
	}
	
	// [2]
	public void returnAccList() {
		usrMngr.userList.get(usrIdx).setAccountList(usrAccList);
	}

	public void printAccountList() {
		System.out.println(usrAccList);
	}
	
	public void deposit(int accNum, int money) {
		int accIdx = -1;
		for (int i = 0; i < usrAccList.size(); i++) {
			if (accNum == usrAccList.get(i).getAccountNum()) accIdx = i;
		}
		System.out.println(money + " has been deposited in " + accNum);
		usrAccList.get(accIdx).setAccountMoney(money);
	}
	
	public void withdraw(int accNum, int money) {
		int accIdx = -1;
		for (int i = 0; i < usrAccList.size(); i++) {
			if (accNum == usrAccList.get(i).getAccountNum()) accIdx = i;
		}
		System.out.println(money + " has been withdrawn from " + accNum);
		usrAccList.get(accIdx).setAccountMoney(-money);
	}
	
	public void makeAccount() {
		int newAccNum = 0;
		int accDuplCheck = -1;
		
		while (true) {
			newAccNum = rm.nextInt(899999)+100000;
			
			if (usrAccList == null) {
				usrAccList = new ArrayList<>();
				break;
			}
			else {
				for (int i = 0; i < usrAccList.size(); i++) {
					if (newAccNum == usrAccList.get(i).getAccountNum()) accDuplCheck = i;
				}
				if (accDuplCheck == -1) break;
			}
		}
		
		var newAcc = new Account();
		newAcc.setAccountNum(newAccNum);
		usrAccList.add(newAcc);
		System.out.println(newAccNum + " account created");
	}
	
	public void deleteAccount(int accNum) {
		int delAccIdx = -1;
		
		for (int i = 0; i < usrAccList.size(); i++) {
			if (usrAccList.get(i).getAccountNum() == accNum) delAccIdx = i;
		}
		System.out.println(usrAccList.get(delAccIdx) + " account deleted");
		usrAccList.remove(delAccIdx);
	}
}
