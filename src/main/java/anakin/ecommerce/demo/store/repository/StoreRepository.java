package anakin.ecommerce.demo.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import anakin.ecommerce.demo.store.entity.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long>{
	
}
