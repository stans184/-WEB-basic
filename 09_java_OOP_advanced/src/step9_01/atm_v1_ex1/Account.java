package step9_01.atm_v1_ex1;

public class Account {

	private int accountNum;
	private int accountMoney;
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
	@Override
	public String toString() {
		return "Account [" + accountNum + ", Money =" + accountMoney + "]";
	}
}