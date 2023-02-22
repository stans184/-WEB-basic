package step8_01.technique;
// static 변수가 담긴 class가 여러 군데서 불려와도
// 그 변수에 대한 변동량이 먹히는지 검증하는 예시
public class test {

	Character testCharacter = new Character();
	
	int moveTest = Character.moveSpeed;
}
