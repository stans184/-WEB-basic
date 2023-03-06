package step9_04.student;
public class StudentInsert {
	
	private StudentDAO studentDAO;
	
	// 왜 생성자를 DAO 타입으로 받아야하나?
	// StudentInsert 가 생성될 때, StudentDAO 를 받아야하는 이유는?
	// insert 기능을 통해 DB에 VO 데이터를 넣어줘야 해서 객체와 소통할수 있게 하는 DAO 를 불러온다
	// insert service 가 실행되는 동안 DAO 가 지속적으로 필요해서 이렇게 소환하는건가?
	public StudentInsert(StudentDAO stDAO) {this.studentDAO = stDAO;}
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId();
		// 이미 있는지 중복검사 하고 insert
		if (checkId(id)) studentDAO.insert(studentVO);
		else System.out.println("중복아이디 입니다");
	}
	
	// 중복검사를 위한 check, 따라서 null 이면 true
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? true:false;
	}
}