package ro.ase.cts.seminar8.decorator;

public class WithLaptopDecorator extends AbstractBackpackDecorator{

	public WithLaptopDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
	}

	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.print(" + Laptop");
	}

}
