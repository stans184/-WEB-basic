package step8_01.technique;

/*  > 인터페이스를 구현하는 클래스는 인터페이스 이름 + Impl(implements)를 추가하여 클래스명을 작성한다.
 *  
 *  ex) AdminOrderDAO     > AdminOrderDAOImpl
 *  	AdminGoodsService > AdminGoodsServiceImpl
 *  
 *  > 클래스 생성시 [interface]에서 Add클릭
 *  > 구현할 인터페이스를 검색하여 선택 후 클래스 생성
 */

import java.util.ArrayList;

public class TechniqueEx10_02Impl implements TechniqueEx10_02{

	@Override
	public void addProduct(ProductDTO productDTO) {
		
	}

	@Override
	public ArrayList<ProductDTO> getProductList() {
		return null;
	}

	@Override
	public ProductDTO getProductDetail(int productCd) {
		return null;
	}

	@Override
	public void setProduct(ProductDTO productDTO) {
		
	}

	@Override
	public void removeProductList(int[] productCdList) {
		
	}

	@Override
	public void removeProduct(int productcd) {
		
	}
}