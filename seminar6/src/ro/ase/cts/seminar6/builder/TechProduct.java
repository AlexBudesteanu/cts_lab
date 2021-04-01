package ro.ase.cts.seminar6.builder;

public class TechProduct implements Product{

	int	id;
	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	
	private TechProduct() {
	}
	
	public TechProduct(String productName) {
		super();
		this.productName = productName;
	}
	@Override
	public String getDescription() {
		return "this is a tech product";
	}

}
