package step9_04.student;

public class StudentSelect {
	
	// DB 와 소통하기 위한 DAO
	private StudentDAO studentDAO;
	
	// select service 가 진행되는 동안 DAO 가 지속적으로 필요하기에, 생성자로 new StudentDAO() 를 받는다
	public StudentSelect(StudentDAO stDAO) {studentDAO = stDAO;}
	
	public StudentVO select(String id) {
		// DAO.select 는 id로 DB를 검색해서 VO 타입으로 반환해준다
		if (checkId(id)) return studentDAO.select(id);
		else System.out.println("정보가 없습니다.");
		return null;
	}
	
	// 내부 검사를 위한 check, null 이면(없으면) false
	public boolean checkId(String id) {
		
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false;
	}
}