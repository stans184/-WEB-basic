package step9_04.student;

public class StudentModify {

	private StudentDAO studentDAO;
	
	public StudentModify(StudentDAO studentDAO) {this.studentDAO = studentDAO;}
	
	public void modify(String id) {
		if (!checkId(id)) System.out.println("동일한 아이디가 없습니다.");
		else {
			
		}
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false;
	}
}