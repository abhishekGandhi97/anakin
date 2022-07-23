package anakin.ecommerce.demo.product.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import anakin.ecommerce.demo.product.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addProduct(@RequestParam Long storeID, 
						@RequestParam String name,
						@RequestParam String price) {
		productService.addProduct(storeID, name, new BigDecimal(price));
	}
	
}
