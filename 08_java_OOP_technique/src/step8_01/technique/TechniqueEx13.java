package step8_01.technique;
/*
 *  toString : 객체에 대한 정보를 문자열로 반환한다.
 */

class OrderDTO{
	
	private String orderId;
	private String goodsId;
	private String goodsNm;
	private String memberId;
	private String deliveryMethod;
	private String deliveryAddress;
	private String deliveryMessage;
	
	public String getOrderId() {return orderId;}
	public void setOrderId(String orderId) {this.orderId = orderId;}
	public String getGoodsId() {return goodsId;}
	public void setGoodsId(String goodsId) {this.goodsId = goodsId;}
	public String getGoodsNm() {return goodsNm;}
	public void setGoodsNm(String goodsNm) {this.goodsNm = goodsNm;}
	public String getMemberId() {return memberId;}
	public void setMemberId(String memberId) {this.memberId = memberId;}
	public String getDeliveryMethod() {return deliveryMethod;}
	public void setDeliveryMethod(String deliveryMethod) {this.deliveryMethod = deliveryMethod;}
	public String getDeliveryAddress() {return deliveryAddress;}
	public void setDeliveryAddress(String deliveryAddress) {this.deliveryAddress = deliveryAddress;}
	public String getDeliveryMessage() {return deliveryMessage;}
	public void setDeliveryMessage(String deliveryMessage) {this.deliveryMessage = deliveryMessage;}
	
	// toString 생성 단축키
	// 좌측 상단 Source > Generate toString > Generate
	
	@Override
	public String toString() {
		return "goodsName : " + goodsNm;
	}
	
}

public class TechniqueEx13 {

	public static void main(String[] args) {
		
		OrderDTO order1 = new OrderDTO();
		order1.setOrderId("order1");
		order1.setGoodsId("goods1");
		order1.setMemberId("member1");
		order1.setGoodsNm("스프링문법");
		order1.setDeliveryAddress("테헤란로");
		order1.setDeliveryMethod("택배수령");
		order1.setDeliveryMessage("경비실 앞에 맡겨주세요.");
	
		System.out.println(order1);
		
		OrderDTO order2 = new OrderDTO();
		order2.setOrderId("order2");
		order2.setGoodsId("goods2");
		order2.setMemberId("member2");
		order2.setGoodsNm("JSP문법");
		order2.setDeliveryAddress("삼성동");
		order2.setDeliveryMethod("편의점");
		order2.setDeliveryMessage("배송전 연락주세요.");
		
		System.out.println(order2);
	}
}