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
 * 기능검증 하나씩 해야함
 * join, login, logout, withdraw 정상
 * 
 * accountManager
 * - DB 로 언제 어떻게 넘길지 고민을 해봐야함
 * - 로그아웃 하고 다른걸로 들어올 때, accountList 초기화가 안됨
 * - make 정상이나, 첫번째 계좌 생성시 log 제대로 안찍힘
 * - DB 로 넘기는게 잘 안되니, transfer 도 아직 제대로 구현이 안됨
 * 
 * DB
 * - file write 로 그냥 할건지, 찾아보고 SQL 로 넣을건지 고민
 */
