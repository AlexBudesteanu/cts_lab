package ro.ase.cts.seminar8.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {

	private ArrayList<CatalogComponent> products;
	private String name;
	
	public ProductCatalog(String name) {
		super();
		products = new ArrayList<CatalogComponent>();
		this.name = name;
	}

	@Override
	public void add(CatalogComponent component) {
		this.products.add(component);
	}

	@Override
	public void remove(CatalogComponent component) {
		for(int i = 0; i<products.size(); i++) {
			if(products.get(i).getName().equals(component.getName())) {
				products.remove(i);
			}
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		throw new UnsupportedOperationException("Can't get price");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.name).append(":\n");
		for(CatalogComponent comp : this.products) {
			builder.append(comp.toString());
		}
		return builder.toString();
	}

	
}
