package step9_03.atm_v3_ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import step9_00.myarraylist.MyArrayList;

// signleton type 으로 구현된 MySQL DB 접속 객체
public class BankDB {
	
	private BankDB() {}
	private static BankDB connectDB = new BankDB();
	public static BankDB getInstance() {return connectDB;}
	
	private static Connection dbCon;
	
	// make connection with specified database
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
	
	// make connection with random database
	public Connection getConnection(String url, String user, String pwd) throws ClassNotFoundException, SQLException {
		if (dbCon == null) {
			String className = "com.mysql.cj.jdbc.Driver";
			Class.forName(className);
			dbCon = DriverManager.getConnection(url, user, pwd);
		}
		return dbCon;
	}
	
	// close connection with database
	public void close() throws SQLException {
		if (dbCon != null && !dbCon.isClosed()) {
			dbCon.close();
		}
		dbCon = null;
	}
	
	// data save
	public void save() throws SQLException, ClassNotFoundException {
		var db = getConnection();
		var memberMngr = MemberManager.getInstance();
		
		Statement stmt = db.createStatement();
		
		for (int i = 0; i < memberMngr.memberList.size(); i++) {
			int idx = i+1; 
			String id = memberMngr.memberList.get(i).getId();
			String pw = memberMngr.memberList.get(i).getPw();
			String memberSql = "INSERT INTO member VALUES (" + idx + ",\'" + id + "\',\'" + pw + "\')";
			int memResult = stmt.executeUpdate(memberSql);
			if (memResult <= 0) System.out.println("Member data save fail");
			MyArrayList<Account> accList = memberMngr.memberList.get(i).getAccList();
			if (accList == null) continue;
			else {
				for (int j = 0; j < accList.size(); j++) {
					int accNum = accList.get(j).getNum();
					int money = accList.get(j).getMoney();
					String accSql = "INSERT INTO account VALUES (" + idx + "," + accNum + "," + money + ")";
					int accResult = stmt.executeUpdate(accSql);
					if (accResult <= 0) System.out.println("Account data save fail");
				}
			}
		}
		
		stmt.close();
		close();
		System.out.println("SAVED in DB");
	}
	
	// data load
	public void load() throws SQLException, ClassNotFoundException {
		var db = getConnection();
		var memberMngr = MemberManager.getInstance();
		memberMngr.memberList = new MyArrayList<>();
		
		Statement stmt = db.createStatement();
//		String outSql = "SELECT id, name, email FROM testDB ORDER BY id";
//		ResultSet rs = stmt.executeQuery(outSql);
//		
//		while (rs.next()) {
//			int id = Integer.parseInt(rs.getString("id"));
//			String name = rs.getString("name");
//			String email = rs.getString("email");
//			
//			System.out.println(id + " / " + name + " / " + email);
//		}
//		rs.close();
		
		/*
		 * load 구현중
		 * id 에 따라서 멤버는 받고 안받고를 정해야 하는데 do while?
		 * 어케할지 고민중
		 */
		
		String outSql = "SELECT m.id, m.name, m.password, a.acc_number, a.money "
				+ "FROM member m INNER JOIN account a ON m.id = a.member_id";
		ResultSet rs = stmt.executeQuery(outSql);
		
		while (rs.next()) {
			int idx = Integer.parseInt(rs.getString("id"))-1;
			
			if (memberMngr.memberList.size() == idx) continue;
			else {
				String id = rs.getString("name");
				String pw = rs.getString("password");
				int accNum = Integer.parseInt(rs.getString("acc_number"));
				int money = Integer.parseInt(rs.getString("money"));
				
				Member newMem = new Member(id, pw);
				memberMngr.memberList.add(newMem);
			}
		}
		rs.close();
		stmt.close();
		close();
		System.out.println("LOADED from DB");
	}
	
	// data delete > 일단 나중에, save, load 부터
	public void delete() throws ClassNotFoundException, SQLException {
		var db = getConnection();
		
		String deleteSql = "DELETE FROM testDB";
	}
}