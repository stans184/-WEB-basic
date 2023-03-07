package step9_04.customer_ex1;

import java.sql.SQLException;

public class CSDelete {
	
	private CSDAO csDao;

	public CSDelete(CSDAO csDao) {
		this.csDao = csDao;
	}
	
	public void delete(String id) throws ClassNotFoundException, SQLException {
		if (checkId(id)) {
			CSDTO selCS = csDao.select(id);
			csDao.delete(selCS);
			System.out.println(id + ", deleted");
		}
		else System.out.println("Cannot found " + id);
	}
	
	public boolean checkId(String id) throws ClassNotFoundException, SQLException {
		return csDao.duplIdCheck(id);
	}
}