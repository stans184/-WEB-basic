package step9_03.atm_v3_ex1;

import java.io.IOException;

public class SHmain {

	public static void main(String[] args) {
		try {
			new ShinHanAtm().showMainMenu();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

/*
 * ?? 여기서는 file 이지만, DB 와 어떤 방식으로 소통을 하는 코드를 짜야할까
 * 	> 객체에다가 저장하고, 최소한으로 통신하는게 나을라나?
 *	> 아님 모든 순간을 DB 와 연동하며 진행하는게 나을라나?
 *
 * ?? class 에서 다른 class 를 불러와야 할 때, member 변수 자리에서 불러오는 거랑, method 실행하
 * 	  불러오는 거랑 어느 면에서 더 좋은 코드인가?
 * 	> 모든 method 에서 사용하면?
 * 	> 소수의 method 에서만 사용한다면?
 * 
 * accountManager
 * - make 하면 바로 created 가 안넘어옴, 근데 3개 리미트는 제대로 동작함
 * 	> 구문상의 오류, 코멘트를 추가해줌
 * - DB 로 언제 어떻게 넘길지 고민을 해봐야함
 *  > deposit 하고 바로 withdraw 했을 땐, 잘 넘어옴
 *  > 근데 deposit 하고 transfer 하려고 하니, Lack of balance 가 뜸
 *  > transfer account 를 select 하는 input 의 문제였음...
 *  > 다른 member 의 계좌로 보내려고 하니, idx를 찾지를 못하네
 *  > 로그아웃하고, 로그인하면서 계좌 정보가 제대로 안넘어감
 * ?? 로그아웃 하고 다른걸로 들어올 때, accountList 초기화가 안됨
 *  > AccountManager 에서 memberManager 를 class 실행과 동시에 부르지 않고, 필요한 순간에 부르니까 해결됨?
 *  > member variable 자리에 memberIdx를 지정했었는데, 그걸 method 안으로 넣으니까 됨.. 이유는?
 * 
 * DB
 * - file write 로 그냥 할건지, 찾아보고 SQL 로 넣을건지 고민
 */
