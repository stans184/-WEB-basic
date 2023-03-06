package step9_04.student;

public class StudentRemove {

	private StudentDAO studentDAO;
	
	public StudentRemove(StudentDAO studentDAO) {this.studentDAO = studentDAO;}
	
	public void remove(StudentVO studentVO) {
		studentDAO.remove(studentVO);
		System.out.println(studentVO.getId() + " 삭제되었습니다.");
	}
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? false:true;
	}
}