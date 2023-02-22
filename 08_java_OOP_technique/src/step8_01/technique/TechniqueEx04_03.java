package step8_01.technique;

/* # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * */

class GoodsVO{
	
	String goodsCd;
	String goodsNm;
	int price;
	
	// method overloading
	GoodsVO() {
		this.goodsCd = "none";
		this.goodsNm = "none";
		this.price = -1;
		System.out.println("default constructor");
	}
	
	GoodsVO(String cd) {
		this.goodsCd = cd;
		System.out.println("# overloading constructor 1");
	}

	GoodsVO(String cd, String name) {
		this.goodsCd = cd;
		this.goodsNm = name;
		System.out.println("# overloading constructor 2");
	}

	GoodsVO(String cd, String name, int price) {
		this.goodsCd = cd;
		this.goodsNm = name;
		this.price = price;
		System.out.println("# overloading constructor 3");
	}

	@Override
	public String toString() {
		return "GoodsVO [goodsCd=" + goodsCd + ", goodsNm=" + goodsNm + ", price=" + price + "]";
	}
}

public class TechniqueEx04_03 {

	public static void main(String[] args) {
		
		var good1 = new GoodsVO();
		var good2 = new GoodsVO("0x00");
		var good3 = new GoodsVO("0x00", "keyboard");
		var good4 = new GoodsVO("0x00", "keyboard", 37000);
		
		System.out.println(good1);
		System.out.println(good2);
		System.out.println(good3);
		System.out.println(good4);
	}
}