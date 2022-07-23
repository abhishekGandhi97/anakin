package anakin.ecommerce.demo.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anakin.ecommerce.demo.retailer.entity.Retailer;
import anakin.ecommerce.demo.retailer.repository.RetailerRepository;
import anakin.ecommerce.demo.store.entity.Store;
import anakin.ecommerce.demo.store.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private RetailerRepository retailerRepository;
	
	@Override
	public void addStore(Long retailerId, String name) {
		Store store = new Store(name);
		Retailer retailer = retailerRepository.getById(retailerId);
		store.setRetailer(retailer);
		storeRepository.save(store);
	}

}
