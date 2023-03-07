package step9_04.customer_ex1;

import java.sql.SQLException;

public class CSModify {
	
	private CSDAO csDao;

	public CSModify(CSDAO csDao) {
		this.csDao = csDao;
	}
	
	public void modify(String id, String pw, String email) throws ClassNotFoundException, SQLException {
		CSDTO selCS = csDao.select(id);
		selCS.setPw(pw);
		selCS.setEmail(email);
		csDao.modify(selCS);
		System.out.println(id + ", modified");
	}
	
	public boolean checkId(String id) throws ClassNotFoundException, SQLException {
		return csDao.duplIdCheck(id);
	}
	
	public boolean checkPw(String id, String pw) throws ClassNotFoundException, SQLException {
		CSDTO selCS = csDao.select(id);
		return (selCS.getPw().equals(pw))? true:false;
	}
}