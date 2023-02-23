package step8_01.technique;

/*	# static
 	
 	- 정적 필드 (static variable) 와 정적 메소드 (static method) 는 객체(instance)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
 	- Static 키워드를 통해 생성된 정적멤버들은 Heap 영역이 아닌 Static 영역에 할당
 	- Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
 	- Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
 */

class Character{
	
	int hp = 100;
	int mp = 30;
	static int moveSpeed = 1;
	
	void showStatus() {
		System.out.println("hp : " + hp);
		System.out.println("mp : " + mp);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();
	}
	
	static void speedUp() {
		
		// static method 는 main method가 run 들어가는 순간 생성되기 때문에
		// class 의 member variable은 여기서 참조할 수가 없다
		// new 하지 않으면 생성되지 않기 때문
		// hp -= 10;
		moveSpeed += 30;
	}
}

public class TechniqueEx03 {

	public static void main(String[] args) {
		
		// static member 는 main method 가 run 들어가는 순간 생성되어짐
		// instance 소속이 아니고, class 소속임
		System.out.println(Character.moveSpeed);
		
		var zealot = new Character();
		var dragoon = new Character();
		var prove = new Character();
		
		zealot.hp = 2;
		// zealot.moveSpeed = 5;
		// static 변수는 instance 로 참조하는게 아니라, 보통 class 이름 자체로 참조해서 들어간다 class.static변수
		Character.moveSpeed = 5;
		zealot.showStatus();
		
		// static method >> class.method();
		Character.speedUp();
		dragoon.showStatus();
		
		prove.showStatus();
		
		var test = new StaticVarTest();
		
		System.out.println("다른 클래스에서 instance로 생성한 값 : " + test.moveTest);
		System.out.println();
		
		// static example
		// Math class에서 바로 접근
		// static 이면서 final인 값들
		System.out.println(Math.PI);
		System.out.println(Math.E);
		// static method
		System.out.println(Math.abs(-6));
		System.out.println();
		
		// method 의 CPU control
		// Thread class 의 static method example
		try {
			Thread.sleep(3000);				// 1s = 1000
			System.out.println("END");
		} catch (InterruptedException e) {System.out.println(e);}
	}
}