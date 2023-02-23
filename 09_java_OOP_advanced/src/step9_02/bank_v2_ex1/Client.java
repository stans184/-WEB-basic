package step9_02.bank_v2_ex1;

import java.util.ArrayList;

public class Client {
	
	private String clientId;
	private String clientPw;
	private ArrayList<PassBook> bookList;
	private int bookCnt;
	
	public Client(String id, String pw) {
		this.clientId = id;
		this.clientPw = pw;
	}
	
	public String getClientId() {
		return clientId;
	}
	public String getClientPw() {
		return clientPw;
	}
	public ArrayList<PassBook> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<PassBook> bookList) {
		this.bookList = bookList;
	}
	public int getBookCnt() {
		return bookCnt;
	}
	public void setBookCnt(int bookCnt) {
		this.bookCnt = bookCnt;
	}
	@Override
	public String toString() {
		return "Client [" + clientId + "] [clientPw=" + clientPw + ", bookList=" + bookList + ", bookCnt="
				+ bookCnt + "]";
	}
}