package ro.ase.cts.seminar8.composite;

public class Product extends CatalogComponent{

	String name;
	double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void add(CatalogComponent component) {
		throw new UnsupportedOperationException("Can't add product");
	}

	@Override
	public void remove(CatalogComponent component) {
		throw new UnsupportedOperationException("Can't remove product");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return this.name + " with price tag: " + this.price + "\n"; 
	}
}
