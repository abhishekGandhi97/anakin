package anakin.ecommerce.demo.product.repository;

import org.springframework.data.repository.CrudRepository;

import anakin.ecommerce.demo.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	
	
}
