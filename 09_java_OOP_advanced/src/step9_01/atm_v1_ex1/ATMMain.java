package step9_01.atm_v1_ex1;

public class ATMMain {

	public static void main(String[] args) {
		
		ATM itAtm = new ATM();
		
			itAtm.printATMMenu();
	}
}
// 1)
// 여러 곳에서 써야하는 class 인데, 변수도 동일하게 가져가야 한다면 singleton 써야함
// UserManager class 를 AccountManager 랑 ATM 동시에 썼는데, identifier 가 초기화되버리는 이슈가 있음

// 2) 이거는 코드를 좀 길게 봐야
// 유저를 여러개 만들고, 하나에서 계정 활동을 한 후, 다른 유저 조작하다가 다시 들어오면
// 계좌가 초기화된다
//User [qq] accountList = null Account List
//[Account [104188] $0, Account [304589] $0, Account [839227] $0]
// >> Account List 반환해서 저장해버림

// 3) 입력 오류인가?
//Select the menu : 1
//Enter User ID : ee
//Enter User PW : 33
//ID recheck
//ID recheck
//ee, welcome!
//ID recheck
//ID recheck
//가끔 아래와 같이 ID recheck 가 뜸,, 입력이 남나?