package anakin.ecommerce.demo.retailer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import anakin.ecommerce.demo.store.entity.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "t_retailer")
@NoArgsConstructor
@AllArgsConstructor
public class Retailer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "retailerDataSeqGen")
	@SequenceGenerator(name =  "retailerDataSeqGen", sequenceName = "retailerDataSeq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "retailer", cascade = CascadeType.ALL)
	private Store store;
	
	public Retailer(String name) {
		this.name = name;
	}
	
}
