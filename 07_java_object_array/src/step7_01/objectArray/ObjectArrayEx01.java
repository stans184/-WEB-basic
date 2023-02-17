package step7_01.objectArray;

class Product{
	String name;
	int price;
	
	// default constructor, 코드에 생성자가 아무것도 없으면 컴파일러가 알아서 만들어줌
	// 그런데 임의의 생성자를 설정해놓으면, 그렇게만 생성되기 때문에
	// default constructor 로 class 를 생성하고 싶으면 하나 다시 만들어줘야 함
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class ObjectArrayEx01 {

	public static void main(String[] args) {
		
		int[]            test = new int[2];
		test[0] = 10;
		test[1] = 20;
		
		// class 배열 생성 방법 = 기존배열 생성 방법과 같음
		Product[] productList = new Product[3];
		
		productList[0] = new Product();
		productList[0].name = "기계식 키보드";
		productList[0].price = 45000;
		
		productList[1] = new Product();
		productList[1].name = "저소음 마우스";
		productList[1].price = 27000;
		
		productList[2] = new Product();
		productList[2].name = "마우스 패드";
		productList[2].price = 10000;
		
		int totalPrice = 0;
		
		for (int i = 0; i < productList.length; i++) {
			System.out.println("name\t: " + productList[i].name);
			System.out.println("price\t: " + productList[i].price);
			totalPrice += productList[i].price;
			System.out.println();
		}
		System.out.println("total\t: " + totalPrice);
		System.out.println();
		
		// 생각해보기
		Product[] temp1 = productList;											// 주소		> C-lang 의 pointer
		Product temp2 = productList[0];											// 주소
		String temp3 = productList[0].name;										// 데이터
		int temp4 = productList[0].price;										// 데이터
		
		Product temp = productList[2];
		System.out.println("temp : " + temp);									// 주소
		System.out.println("productList[2] : " + productList[2]);				// 주소
		
		System.out.println("temp.name : " + temp.name);							// 마우스 패드
		System.out.println("productList[2].name : " + productList[2].name);		// 마우스 패드
		
		temp.name = "장패드1";
		System.out.println("temp.name : " + temp.name);							// 장패드1
		System.out.println("productList[2].name : " + productList[2].name);		// 장패드1
		
		productList[2].name = "장패드2";
		System.out.println("temp.name : " + temp.name);							// 장패드2
		System.out.println("productList[2].name : " + productList[2].name);		// 장패드2
	}
}