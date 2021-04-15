package ro.ase.cts.seminar8.decorator;

public abstract class AbstractBackpackDecorator extends AbstractBackpack{
	protected AbstractBackpack basicBackpack;

	public AbstractBackpackDecorator(AbstractBackpack basicBackpack) {
		super();
		this.basicBackpack = basicBackpack;
	}
	
}
