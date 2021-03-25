package ro.ase.cts.seminar5.factory;

public class OfficeProduct implements Product{
	String productName;
	
	public OfficeProduct(String productName) {
		super();
		this.productName = productName;
	}

	@Override
	public String getDescription() {
		return "this is an office product";
	}

}
