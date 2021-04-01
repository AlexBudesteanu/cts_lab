package ro.ase.cts.seminar6.builder;

public abstract class AbstractProductFactory {
	public abstract Product makeProduct() throws UnsupportedOperationException;
	public abstract String getCatalog();
}
