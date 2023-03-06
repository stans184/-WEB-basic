package step9_04.student;

public class StudentModify {

	private StudentDAO studentDAO;
	
	public StudentModify(StudentDAO studentDAO) {this.studentDAO = studentDAO;}
	
	public void modify(StudentVO studentVO) {
		studentDAO.modify(studentVO);
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false;
	}
}