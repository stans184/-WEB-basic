package step9_02.bank_v2_ex1;

public class PassBook {
	
	private int bookNum;
	private int money;
	
	public PassBook(int num) {
		this.bookNum = num;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	@Override
	public String toString() {
		return "PassBook [" + bookNum + "] money=" + money;
	}
}