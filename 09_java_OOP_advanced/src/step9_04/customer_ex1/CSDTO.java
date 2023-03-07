package step9_04.customer_ex1;

public class CSDTO {

	private int csNum;
	private String id;
	private String pw;
	private String email;
	
	public CSDTO() {}
	public CSDTO(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	public int getCsNum() {
		return csNum;
	}
	public void setCsNum(int csNum) {
		this.csNum = csNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void print() {
		System.out.println(csNum + " [ id : " + id + ", email : " + email + "]");
	}
}