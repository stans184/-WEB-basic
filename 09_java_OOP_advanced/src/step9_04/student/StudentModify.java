package step9_04.student;

public class StudentModify {

	private StudentDAO studentDAO;
	
	public StudentModify(StudentDAO studentDAO) {this.studentDAO = studentDAO;}
	
	public void modify(StudentVO studentVO) {
		studentDAO.modify(studentVO);
		System.out.println(studentVO.getId() + " 수정되었습니다.");
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO != null? true:false;
	}
}