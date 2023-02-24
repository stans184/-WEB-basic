package step8_01.technique;

/*	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용
	- 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다름
	- 객체지향 기법의 다형성(Polymorphism)을 구현하는 핵심기능
	- 메서드 오버로딩과 혼용되기 쉽다.
	     method overriding  : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재 정의)
	     method overloading : 같은 클래스 안에서 메서드이름이 같음(중복 정의)
*/

class Warrior2 extends Beginner{
	
	@Override
	void lvlUp() {
		this.level += 1;
		this.power += 13;
		this.dex += 7;
		this.life += 15;
		this.mana += 5;
	}
	
	// Warrior2 만의 method 추가
	void dash() {System.out.println("\n DASH! \n");}
}

class Wizard2 extends Beginner{

	@Override
	void lvlUp() {
		this.level += 1;
		this.power += 5;
		this.dex += 8;
		this.life += 7;
		this.mana += 20;
	}
	
	// Wizard2 만의 method 추가
	void fireBall() {System.out.println("\n FireBall! \n");}
}

public class TechniqueEx07 {

	public static void main(String[] args) {
		
		var war2 = new Warrior2();
		var wiz2 = new Wizard2();
		
		war2.showStatus();
		war2.lvlUp();
		war2.showStatus();
		war2.dash();
		
		System.out.println("\n===========\n");
		
		wiz2.showStatus();
		wiz2.lvlUp();
		wiz2.lvlUp();
		wiz2.lvlUp();
		wiz2.showStatus();
		wiz2.fireBall();
	}
}