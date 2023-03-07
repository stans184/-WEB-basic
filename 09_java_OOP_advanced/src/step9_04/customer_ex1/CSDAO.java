package step9_04.customer_ex1;

import java.sql.Connection;
import java.sql.SQLException;

/*
 * - insert
 * - modify
 * - select
 * - selectAll
 * - delete
 */

public class CSDAO {
	
	CSDB csdb = CSDB.getInstance();
	
	public boolean duplNumCheck(int num) throws ClassNotFoundException, SQLException {
		boolean dupl = false;
		Connection db = csdb.getConnection();
		
		String searchSql = "SELECT * FROM customer";
		
		return dupl;
	}
	
	public boolean duplIdCheck(String id) throws ClassNotFoundException, SQLException {
		boolean dupl = false;
		Connection db = csdb.getConnection();
		
		String searchSql = "SELECT * FROM customer";
		
		return dupl;
	}
	
	public void insert(CSDTO csdto) {
		
	}
	
	public void modify(CSDTO csdto) {
		
	}
	
	public CSDTO select(String id) {
		
		return null;
	}
	
	public CSDTO select(int num) {
		
		return null;
	}
	
	public void delete(CSDTO csdto) {
		
	}
}