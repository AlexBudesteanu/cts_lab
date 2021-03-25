package ro.ase.cts.seminar5.factory;

public abstract class AbstractProductFactory {
	public abstract Product makeProduct(String productName) throws UnsupportedOperationException;
	public abstract String getCatalog();
}
