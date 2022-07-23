package anakin.ecommerce.demo.product.service;

import java.math.BigDecimal;

public interface ProductService {
	
	public void addProduct(Long storeID, String name, BigDecimal price);

}
