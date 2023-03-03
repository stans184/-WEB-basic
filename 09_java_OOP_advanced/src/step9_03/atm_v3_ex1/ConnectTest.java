package step9_03.atm_v3_ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectTest {

	public static void main(String[] args) {
		
		Connection con = null;
		
		String className = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/workspaceMEGA";
		String user = "root";
		String passwd = "xogus930!";
		
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connection Sucess");
		} catch (Exception e) {System.out.println(e);
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {System.out.println(e);}
		}
	}
}