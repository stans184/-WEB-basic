package step9_02.bank_v2_ex1;

public class BankMain {

	public static void main(String[] args) {
		
		Bank itBank = new Bank();
		itBank.run();
	}
}

/*
 * 저장, 로드 다 구현했는데
 * 이체하면 이체 금액이 제대로 안넘어감
 * 
 * 그리고 로그아웃을 안하면 passbook 리스트를 안넘겨서 이체가 안됨
 *  > 매 순간 리스트를 넘겨야하나?
 *  
 * Enter your passbook number want to withdraw : 3157
Enter money to transfer ? 5000
Enter passbook number to transfer : 6560
5000, transfer from [3157]
to [6560]

qq, using
[1. Make PassBook]
[2. Delete PassBook]
[3. Inquiry PassBook]
[4. Deposit Money]
[5. Withdraw]
[6. Transfer Money]
[0. Log-Out]
Select menu : 3
[PassBook [6560] money=1, PassBook [3157] money=50000]
 */