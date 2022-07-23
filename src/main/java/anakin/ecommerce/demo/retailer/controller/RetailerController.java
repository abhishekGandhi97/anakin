package anakin.ecommerce.demo.retailer.controller;

import java.net.Authenticator.RequestorType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import anakin.ecommerce.demo.retailer.service.RetailerService;

@RestController
@RequestMapping(value = "/retailer")
public class RetailerController {
	
	@Autowired
	private RetailerService retailerService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addRetailer(@RequestParam String name) {
		retailerService.addRetailer(name);
	}
	
}
