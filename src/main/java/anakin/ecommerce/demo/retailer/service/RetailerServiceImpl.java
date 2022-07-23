package anakin.ecommerce.demo.retailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anakin.ecommerce.demo.retailer.entity.Retailer;
import anakin.ecommerce.demo.retailer.repository.RetailerRepository;

@Service
public class RetailerServiceImpl implements RetailerService {
	
	@Autowired
	private RetailerRepository retailerRepository;
	
	@Override
	public void addRetailer(String name) {
		// TODO Auto-generated method stub
		Retailer retailer = new Retailer(name);
		retailerRepository.save(retailer);
		
	}

}
