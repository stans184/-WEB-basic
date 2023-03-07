package step9_04.customer_ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * customer list
 * csnum / id / pw / email
 */

public class CSDB {
	
	private static CSDB csDB = new CSDB();
	private CSDB() {}
	public static CSDB getInstance() {return csDB;}

	private static Connection dbCon;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if (dbCon == null) {
			String className = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/workspaceMEGA";
			String user = "root";
			String passwd = "xogus930!";
			Class.forName(className);
			
			dbCon = DriverManager.getConnection(url, user, passwd);
		}
		return dbCon;
	}
	
	public Connection getConnection(String url, String user, String pwd) throws ClassNotFoundException, SQLException {
		if (dbCon == null) {
			String className = "com.mysql.cj.jdbc.Driver";
			Class.forName(className);
			dbCon = DriverManager.getConnection(url, user, pwd);
		}
		return dbCon;
	}
	
	public void close() throws SQLException {
		if (dbCon != null && !dbCon.isClosed()) dbCon.close();
		dbCon = null;
	}
}