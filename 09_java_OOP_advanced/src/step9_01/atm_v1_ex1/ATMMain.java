package step9_01.atm_v1_ex1;

public class ATMMain {

	public static void main(String[] args) {
		
		var itAtm = new ATM();
		itAtm.printATMMenu();
	}
}

/*
  1)
  UserManager userManager = new UserManager();
  여러 곳에서 써야하는 class 인데, 변수도 동일하게 가져가야 한다면 singleton 써야함
  UserManager class 를 AccountManager 랑 ATM 동시에 썼는데, identifier 가 초기화되버리는 이슈가 있음
  UserManager userManager = UserManager.getInstance();
  > userIdentifier 를 static variable 로 처리해도 먹힐 듯?
  > 다시 해봐야하,,,나?
  
  > static vs singleton 의 차이
  > [1] 다형성 사용 불가
  > [2] 싱글턴, 멀티턴 (여러개의 객체를 지정해서 반환 불가)
  > [3] 객체 생성 시점 제어 불가 (static 은 main method 실행 시점에 바로 실행됨)
  
  1-1) user LogOut 의 기능이 UserManager에 포함되어 있는데, 로그아웃할 때 AccountList 의 반환이 필요함
  	   이 상황을 해결하기 위해선 AccountManager 또한 SingleTon 으로 처리해야 할 필요가 있음

  2) 이거는 코드를 좀 길게 봐야
  유저를 여러개 만들고, 하나에서 계정 활동을 한 후, 다른 유저 조작하다가 다시 들어오면
  계좌가 초기화된다
  User [qq] accountList = null Account List
  [Account [104188] $0, Account [304589] $0, Account [839227] $0]
  >> Account List 반환해서 저장해버림

  3) 입력 오류인가? - 아님
  Select the menu : 1
  Enter User ID : ee
  Enter User PW : 33
  ID recheck
  ee, welcome!
  ID recheck
  ID recheck
  
  UserManager login method 에서 반복문 오류가 있었음
  반복하는 와중에 저걸 출력하도록 해서
  조건을 설정하고 그에따라 출력을 나눠서 해결
*/