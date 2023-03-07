package step9_04.customer_ex1;

import java.sql.SQLException;
import java.util.Map;

public class CSSelectAll {
	
	private CSDAO csDao;

	public CSSelectAll(CSDAO csDao) {
		this.csDao = csDao;
	}
	
	public Map<Integer, CSDTO> select() throws ClassNotFoundException, SQLException {
		return csDao.selectAll();
	}
}