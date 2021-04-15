package ro.ase.cts.seminar8.decorator;

public class WithFoodDecorator extends AbstractBackpackDecorator{

	String food;
	
	public WithFoodDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
	}
	
	public WithFoodDecorator(AbstractBackpack basicBackpack, String food) {
		super(basicBackpack);
		this.food = food;
	}

	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.print(" + " + getFood());
	}
	
	public String getFood() {
		return this.food;
	}

}
