package anakin.ecommerce.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import anakin.ecommerce.demo.retailer.entity.Retailer;
import anakin.ecommerce.demo.retailer.repository.RetailerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {
	
	@Autowired
	private RetailerRepository retailerRepository;
	
	@Test
	void testGetRetailerById() {
		
		Long retailerID = 1L;
		Retailer retailer = retailerRepository.getById(retailerID);
		System.out.println("I am here!!"+retailer.getName());
	}
	
}
