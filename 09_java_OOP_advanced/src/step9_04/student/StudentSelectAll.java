package step9_04.student;

import java.util.Map;

public class StudentSelectAll {
	
	// DB 와 소통할 수 있는 DAO
	private StudentDAO studentDAO;
	
	// DB 와 소통해서 select service가 진행되어야 하므로 select service 가 생성될 때 DAO 가 불려와야 한다
	public StudentSelectAll(StudentDAO studentDAO) {this.studentDAO = studentDAO;}
	
	// DB 에 들어있는 모든 정보를 가져온다
	public Map<String , StudentVO> allSelect() {return studentDAO.getStudentDB();}
	
	// 가져온 모든 정보를 map 변수로 받아서, 전부 출력
	public void printAll() {
		
		Map<String , StudentVO> map = allSelect();
		// HashMap<String id, StudentVO> 이므로, key 를 기준으로 반복하며 전체 정보를 출력
		for (String key : map.keySet()) map.get(key).printOneInfo();
	}
}