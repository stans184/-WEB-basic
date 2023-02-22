package step8_01.technique;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

// # 생성자를 이용한 멤버변수 초기화

class GoodsDTO{
	
	String goodsCd;
	String goodsNm;
	int price;
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	// class 자체가 default (package) 접근제어자 라면
	// method 등에서 public 을 써도 의미가 없음
	GoodsDTO(String goodsCd, String goodsNm, int price) {
		super();
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.price = price;
	}
	
	// override 한 method 는 class 여부와 상관 없이 public 붙여줘야 함, Object class 의 method 와 겹치니까
	@Override
	public String toString() {
		return "GoodsDTO [goodsCd=" + goodsCd + ", goodsNm=" + goodsNm + ", price=" + price + "]";
	}
}

public class TechniqueEx04_02 {

	public static void main(String[] args) {

		// 생성자를 이용한 멤버변수 초기화
		var goods1 = new GoodsDTO("0x0023", "Pants", 59000);
		System.out.println(goods1.toString());
		
		// 생성자를 만들어놓았다면 compiler에서 자동으로 만들어주던 default 생성자는 안만들어짐
		// 그걸 원한다면 class에 default constructor 모습으로 추가해줘야 함
		var goods2 = new GoodsDTO("0x4522", "shoes", 79000);
		System.out.println(goods2);
		
		var rm = new Random();
		var sc = new Scanner(System.in);
		var sdf1 = new SimpleDateFormat();
		var sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		var file = new File("");
	}
}