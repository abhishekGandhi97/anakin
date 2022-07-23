package anakin.ecommerce.demo.retailer.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import anakin.ecommerce.demo.retailer.entity.Retailer;

@Repository
public interface RetailerRepository extends CrudRepository<Retailer, Long>{
	
	@Query(value = "Select * from Retailer r where r.id = :id limit 1")
	public Retailer getById(Long id);
	
}
