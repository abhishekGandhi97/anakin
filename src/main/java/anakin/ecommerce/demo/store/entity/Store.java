package anakin.ecommerce.demo.store.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import anakin.ecommerce.demo.product.entity.Product;
import anakin.ecommerce.demo.retailer.entity.Retailer;
import lombok.Data;

@Data
@Entity(name = "t_store")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "storeDataSeqGen")
	@SequenceGenerator(name =  "storeDataSeqGen", sequenceName = "storeDataSeq", initialValue = 1, allocationSize = 1)
	private Long id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "retailer_id", referencedColumnName = "id", nullable = false)
	private Retailer retailer;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "store", fetch = FetchType.LAZY)
	private List<Product> products;
	
	public Store(String name) {
		this.name = name;
	}
	
}
