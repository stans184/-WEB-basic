package step8_01.technique;

/* # 캡슐화 (Capsulation)
 * 
 * - 접근제어자 : public , private  + getter/setter
 * 
 * [ 접근제어자(Access Modifier)의 종류 ]
 * 
 * public  			: 프로젝트 전체에서 접근 가능
 * private			: 클래스 내부에서만 접근 가능
 * default(package) : 패키지 내부에서만 접근가능
 * protected        : 상속관계에서 접근 가능
 * */

class ModifierTest{
	
	private int a;
	int b;
	public final int NUM = 100;
	
	// private 변수를 class 외부로 꺼내주는 getter
	public int getA() {return a;}
	
	// private 변수를 class 외부에서 수정하는 setter
	public void setA(int a) {this.a = a;}
}

// VO		: Value Object			> 값 객체
// DTO		: Data Transfer Object	> 데이터 전송 모델 객체
class ProductDTO{
	
	private String productCode;
	private String productName;
	private int price;
	private String brandCode;
	private String brandName;
	
	public String getProductCode() {return productCode;}
	public void setProductCode(String productCode) {this.productCode = productCode;}
	public String getProductName() {return productName;}
	public void setProductName(String productName) {this.productName = productName;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public String getBrandCode() {return brandCode;}
	public void setBrandCode(String brandCode) {this.brandCode = brandCode;}
	public String getBrandName() {return brandName;}
	public void setBrandName(String brandName) {this.brandName = brandName;}
}

public class TechniqueEx02 {

	public static void main(String[] args) {
		
		var mdt = new ModifierTest();
		
		// private 변수는 class 외부에서 접근 불가능
		// 접근을 허용하는 public 등의 method 가 있다면 제어 가능
		mdt.setA(1000);						// setter 를 이용한 private 변수 수정
		System.out.println(mdt.getA());		// getter 를 이용한 private 변수 출력
		
		mdt.b = 2000;
		System.out.println(mdt.b);
		System.out.println();
		
		var productDTO = new ProductDTO();
		
		productDTO.setProductCode("0x00246");
		productDTO.setProductName("기계식 키보드");
		productDTO.setPrice(45000);
		productDTO.setBrandCode("R1");
		productDTO.setBrandName("로지텍");
		
		System.out.println(productDTO.getProductCode());
		System.out.println(productDTO.getProductCode());
		System.out.println(productDTO.getPrice());
		System.out.println(productDTO.getBrandName());
		System.out.println(productDTO.getBrandCode());
		
	}
}