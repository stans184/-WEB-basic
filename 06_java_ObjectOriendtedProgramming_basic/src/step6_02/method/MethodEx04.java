package step6_02.method;
// this : 객체(오브젝트, 인스턴스) 자신

class Zealot{
	// class property 에는 this가 붙어있고, 생략이 가능하다.
	int shield = 60;
	int hp = 100;
	
	void showStatus() {
		System.out.println("this\t: " + this);
		System.out.println("shield\t: " + this.shield);
		System.out.println("HP\t: " + this.hp);
		System.out.println();
	}
}

public class MethodEx04 {

	public static void main(String[] args) {
		
		Zealot zl1 = new Zealot();
		System.out.println(zl1);
		zl1.shield = 0;
		zl1.showStatus();
		
		Zealot zl2 = new Zealot();
		System.out.println(zl2);
		zl2.shield = 0;
		zl2.hp = 0;
		zl2.showStatus();

		Zealot zl3 = new Zealot();
		System.out.println(zl3);
		zl3.showStatus();
	}
}