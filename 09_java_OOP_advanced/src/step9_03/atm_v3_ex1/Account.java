package step9_03.atm_v3_ex1;

public class Account {
	private int num;
	private int money;
	
	public Account(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}

	@Override
	public String toString() {
		return "Account [" + num + "] / $" + money + "/";
	}
}