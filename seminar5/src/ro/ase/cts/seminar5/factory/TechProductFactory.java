package ro.ase.cts.seminar5.factory;

public class TechProductFactory extends AbstractProductFactory{

	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return new TechProduct("generic");
	}

	@Override
	public String getCatalog() {
		return "generic - Generic tech product";
	}

	
}
