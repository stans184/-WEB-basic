package step6_01.classObject;
/*   # 객체 지향 프로그래밍 ( Object Oriented Programming [OOP] )	>>	부품화, 모듈화
 *
 *	  - 코드의 재사용성이 높다.
 *	  - 코드의 확장성이 높다.
 *	  - 코드의 관리가 용이하다.
 *	  - 개발자간에 프로그램 방법에 통일과 일치성을 준다.
 *	  - 신뢰성이 높은 프로그래밍을 가능하게 한다.
 *
 *   # 클래스(class)
 * 
 *     - 클래스(class)는 객체 지향 프로그래밍(OOP)에서 특정 객체를 생성하기 위해 변수와 메소드를 정의하는 일종의 틀이다. 
 *     객체를 정의 하기 위한 상태(멤버변수)와 메서드(함수)로 구성된다. (위키백과)
 *
 *      [ 형태 ]
 * 		1) class   : 키워드
 * 		2) Product : 클래스명 ( 첫글자를 대문자로 작성한다. )
 * 		3) {}      : 클래스의 영역 
 *
 *   # 객체 (object)
 *
 * 	  - 컴퓨터 과학에서 객체 또는 오브젝트(object)는 클래스에서 정의한 것을 토대로 메모리(실제 저장공간)에 할당된 것으로 
 *      프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는 공간을 의미하며, 변수, 자료 구조, 함수 또는 메소드가 될 수 있다. 
 *      프로그래밍 언어는 변수를 이용해 객체에 접근하므로 객체와 변수라는 용어는 종종 함께 사용된다. 
 *      그러나 메모리가 할당되기 전까지 객체는 존재하지 않는다.(위키백과)
 *
 * 		[형태]
 * 	    클래스명 변수명 = new 클래스명();
 *   Ex)  Ex01     e    =  new Ex01();
 *    	  Random ran    =  new Random();
 * */

class Member{						// class 의 이름은 대문자로 시작
	
	private String memberId;				// member 변수, field, property
	private String memberPw;
	String name;
	String phone;
	String email;
	String address;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
}

public class ClassEx01 {

	public static void main(String[] args) {
		     // link, 출력해보면 주소가 나옴 step6_01.classObject.Member@5aaa6d82
		Member member1 = new Member();			// new Class_name();  >>  이 부분이 객체
												// member1 은 Member Object 의 instance (객체를 메모리에 할당)
		member1.setMemberId("qwer");
		member1.setMemberPw("1111");
		member1.name 	 = "paul";
		member1.phone 	 = "010-1234-5678";
		member1.email	 = "abc@gmail.com";
		member1.address	 = "seoul, gangnam";
		
		Member member2 = new Member();
		
		member2.setMemberId("abcd");
		member2.setMemberPw("2222");
		member2.name	= "Jenny";
		member2.phone	= "010-9876-5432";
		member2.email	= "xyz@gmail.com";
		member2.address	= "bundang";
		
		System.out.println("member1 instance");
		System.out.println("member1\t: " + member1);
		System.out.println("ID\t: " + member1.getMemberId());
		System.out.println("PW\t: " + member1.getMemberPw());
		System.out.println("name\t: " + member1.name);
		System.out.println("phone\t: " + member1.phone);
		System.out.println("address\t: " + member1.address);
		System.out.println();
		
		System.out.println("member2 instance");
		System.out.println("member2\t: " + member2);
		System.out.println("ID\t: " + member2.getMemberId());
		System.out.println("PW\t: " + member2.getMemberPw());
		System.out.println("name\t: " + member2.name);
		System.out.println("phone\t: " + member2.phone);
		System.out.println("address\t: " + member2.address);
		System.out.println();
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		
//		Product pdx = new Product();
	}
}