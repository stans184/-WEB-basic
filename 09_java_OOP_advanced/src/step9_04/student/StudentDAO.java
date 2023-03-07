package step9_04.student;

import java.util.Map;

public class StudentDAO {
	
	// VO 타입으로 받아서 DB에 넣기
	public void insert(StudentVO st) {StudentRepository.getStDB().put(st.getId(), st);}
	
	// DB에서 id 를 기준으로 원하는 값을 찾아서 VO 타입으로 반환
	// HashMap<String id, StudentVO>.get(id) = StudentVO
	public StudentVO select(String id) {return StudentRepository.getStDB().get(id);}
	
	public void modify(StudentVO st) {StudentRepository.getStDB().replace(st.getId(), st);}
	
	public void remove(StudentVO st) {StudentRepository.getStDB().remove(st.getId());}
	
	// select all 을 위한 method
	public Map<String , StudentVO> getStudentDB(){return StudentRepository.getStDB();}
}