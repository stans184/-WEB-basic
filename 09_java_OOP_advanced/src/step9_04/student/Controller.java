package step9_04.student;

public class Controller {
	
	// controller는 데이터를 인풋 받은 이후부터 DB에 넣기 직전까지 상황을 관리해야함
	// 따라서 모든 service 를 객체로 열어두고 사용
	private StudentDAO stDAO;
	private StudentInsert insert;
	private StudentSelect select;	
	private StudentSelectAll selectAll;
	private StudentModify modify;
	
	public Controller() {
		stDAO = new StudentDAO();	
		insert = new StudentInsert(stDAO);
		select = new StudentSelect(stDAO);
		selectAll = new StudentSelectAll(stDAO);
		modify = new StudentModify(stDAO);
	}
	
	public StudentDAO getStDAO() {
		return stDAO;
	}
	
	public void setStDAO(StudentDAO stDAO) {
		this.stDAO = stDAO;
	}
	
	public StudentInsert getInsert() {
		return insert;
	}
	
	public void setInsert(StudentInsert insert) {
		this.insert = insert;
	}
	
	public StudentSelect getSelect() {
		return select;
	}
	
	public void setSelect(StudentSelect select) {
		this.select = select;
	}
	
	public StudentSelectAll getSelectAll() {
		return selectAll;
	}
	
	public void setSelectAll(StudentSelectAll selectAll) {
		this.selectAll = selectAll;
	}

	public StudentModify getModify() {
		return modify;
	}

	public void setModify(StudentModify modify) {
		this.modify = modify;
	}
	
}
