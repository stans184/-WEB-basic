package step9_04.customer_ex1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

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
		var db = csdb.getConnection();
		
		Statement stmt = db.createStatement();
		String searchSql = "SELECT number FROM customer";
		ResultSet rs = stmt.executeQuery(searchSql);
		
		while (rs.next()) {
			if (Integer.parseInt(rs.getString("number")) == num) dupl = true;
		}
		
		rs.close();
		stmt.close();
		csdb.close();
		return dupl;
	}
	
	public boolean duplIdCheck(String id) throws ClassNotFoundException, SQLException {
		boolean dupl = false;
		var db = csdb.getConnection();
		
		Statement stmt = db.createStatement();
		String searchSql = "SELECT id FROM customer";
		ResultSet rs = stmt.executeQuery(searchSql);
		
		while (rs.next()) {
			if (rs.getString("id").equals(id)) dupl = true;
		}
		
		rs.close();
		stmt.close();
		csdb.close();
		return dupl;
	}
	
	public void insert(CSDTO csdto) throws ClassNotFoundException, SQLException {
		var db = csdb.getConnection();
		
		Statement stmt = db.createStatement();
		String insertSql = "INSERT INTO customer VALUES (" + csdto.getCsNum() + ",\'" 
							+ csdto.getId() + "\',\'" + csdto.getPw() + "\',\'" + csdto.getEmail() + "\')";
		int csResult = stmt.executeUpdate(insertSql);
		if (csResult <= 0) System.out.println("insert fail");
		stmt.close();
		csdb.close();
	}
	
	public void modify(CSDTO csdto) throws ClassNotFoundException, SQLException {
		var db = csdb.getConnection();
		
		Statement stmt = db.createStatement();
		String modifySql = "update customer set pw=\'" + csdto.getPw() 
							+ "\', email=\'" + csdto.getEmail() + "\' where number=" + csdto.getCsNum();
		int csResult = stmt.executeUpdate(modifySql);
		if (csResult <= 0) System.out.println("modify fail");
		stmt.close();
		csdb.close();
	}
	
	public CSDTO select(String id) throws ClassNotFoundException, SQLException {
		var db = csdb.getConnection();
		int num = 0;
		String pw = null, email = null;
		
		Statement stmt = db.createStatement();
		String selectSql = "SELECT * FROM customer WHERE id = \'" + id + "\'";
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while (rs.next()) {
			num = Integer.parseInt(rs.getString("number"));
			pw = rs.getString("pw");
			email = rs.getString("email");
		}
		rs.close();
		stmt.close();
		csdb.close();
		var newCS = new CSDTO(id, pw, email);
		newCS.setCsNum(num);
		
		return newCS;
	}
	
	public Map<Integer, CSDTO> selectAll() throws ClassNotFoundException, SQLException {
		var db = csdb.getConnection();
		HashMap<Integer, CSDTO> csList = new HashMap<>();
		
		Statement stmt = db.createStatement();
		String getAllSql = "SELECT * FROM customer";
		ResultSet rs = stmt.executeQuery(getAllSql);
		
		while (rs.next()) {
			int num = Integer.parseInt(rs.getString("number"));
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String email = rs.getString("email");
			
			CSDTO newCS = new CSDTO(id, pw, email);
			newCS.setCsNum(num);
			
			csList.put(num, newCS);
		}
		
		return csList;
	}
	
	public void delete(CSDTO csdto) throws ClassNotFoundException, SQLException {
		var db = csdb.getConnection();
		
		Statement stmt = db.createStatement();
		String deleteSql = "delete from customer where number=" + csdto.getCsNum();
		int csResult = stmt.executeUpdate(deleteSql);
		if (csResult <= 0) System.out.println("delete fail");
		stmt.close();
		csdb.close();
	}
}