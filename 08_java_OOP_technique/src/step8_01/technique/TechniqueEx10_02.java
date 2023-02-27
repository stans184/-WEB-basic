package step8_01.technique;

import java.util.ArrayList;

public interface TechniqueEx10_02 {
	
	// interface 에서 abstract keyword 는 생략 가능
	
	public void addProduct(ProductDTO productDTO);
	
	public ArrayList<ProductDTO> getProductList();
	
	public ProductDTO getProductDetail(int productCd);
	
	public void setProduct(ProductDTO productDTO);
	
	public void removeProductList(int[] productCdList);
	
	public void removeProduct(int productcd);
	
}