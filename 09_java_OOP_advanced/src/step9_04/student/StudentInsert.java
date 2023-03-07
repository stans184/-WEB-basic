package step9_04.student;
public class StudentInsert {
	
	// DB 에 접근해서 기능을 수행하는 DAO, private 으로 가려두는 이유는?
	private StudentDAO studentDAO;
	
	// StudentInsert 가 생성될 때, StudentDAO 를 받아야하는 이유는?
	// 그냥 열어둬버리면 안되나?
	public StudentInsert(StudentDAO stDAO) {this.studentDAO = stDAO;}
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) studentDAO.insert(studentVO);
		else System.out.println("중복아이디 입니다");
	}
	
	// 중복검사를 위한 check, 따라서 null 이면 true
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? true:false;
	}
}