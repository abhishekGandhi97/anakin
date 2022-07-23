package anakin.ecommerce.demo.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import anakin.ecommerce.demo.store.service.StoreService;

@RestController
@RequestMapping(value = "/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addStore(@RequestParam Long retailerID,
			@RequestParam String name) {
		storeService.addStore(retailerID, name);
	}
	
}
