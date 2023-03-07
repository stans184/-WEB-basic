package step9_04.customer_ex1;

import java.sql.SQLException;

public class CSSelect {
	
	private CSDAO csDao;

	public CSSelect(CSDAO csDao) {
		this.csDao = csDao;
	}
	
	public CSDTO select(String id) throws ClassNotFoundException, SQLException {
		CSDTO selCs = null;
		
		if (checkId(id)) return csDao.select(id);
		else {
			System.out.println("NOT found");
			return null;
		}
	}
	
	public boolean checkId(String id) throws ClassNotFoundException, SQLException {
		return csDao.duplIdCheck(id);
	}
}