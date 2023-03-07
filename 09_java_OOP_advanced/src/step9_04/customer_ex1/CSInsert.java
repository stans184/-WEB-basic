package step9_04.customer_ex1;

import java.sql.SQLException;
import java.util.Random;

public class CSInsert {
	
	private CSDAO csDao;
	
	public CSInsert(CSDAO csDao) {
		this.csDao = csDao;
	}
	
	// DAO를 통해 DB에 넣는 작업
	public void insert(CSDTO csdto) throws ClassNotFoundException, SQLException {
		
		if (checkId(csdto.getId())) System.out.println("duplicated ID");
		else {
			csdto.setCsNum(makeRdNum());
			csDao.insert(csdto);
			System.out.println("Welcom, " + csdto.getId());
		}
	}
	
	// 랜덤 customer 넘버를 만들기 위해선 DB 에서 검사를 해야함
	public int makeRdNum() throws ClassNotFoundException, SQLException {
		Random rm = new Random();
		int csNum;
		
		while (true) {
			int num = rm.nextInt(8999) + 1000;
			
			if (!csDao.duplNumCheck(num)) {
				csNum = num;
				break;
			}
		}
		
		return csNum;
	}
	
	// 아이디는 중복되면 안됨 true 면 중복
	public boolean checkId(String id) throws ClassNotFoundException, SQLException {
		return csDao.duplIdCheck(id);
	}
}