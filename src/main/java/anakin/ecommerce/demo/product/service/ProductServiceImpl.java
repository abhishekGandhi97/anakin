package anakin.ecommerce.demo.product.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anakin.ecommerce.demo.product.entity.Product;
import anakin.ecommerce.demo.product.repository.ProductRepository;
import anakin.ecommerce.demo.store.entity.Store;
import anakin.ecommerce.demo.store.repository.StoreRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StoreRepository storeRepository;
	
	@Override
	public void addProduct(Long storeId, String name, BigDecimal price) {
		// TODO Auto-generated method stub
		Product product = new Product(name, price);
		Store store = storeRepository.getById(storeId);
		product.setStore(store);
		productRepository.save(product);
	}
	
	

}
