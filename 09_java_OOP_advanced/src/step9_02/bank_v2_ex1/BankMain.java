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
 *  >> 변수가 잘못 들어가있었음, 해결
 * 
 * 그리고 로그아웃을 안하면 passbook 리스트를 안넘겨서 이체가 안됨
 *  > 매 순간 리스트를 넘겨야하나?
 *  > returnBookList method 를 수정함, CRUD 하는 모든 순간에 실행되어 booklist 정보를 넘기도록
 */