package ro.ase.cts.seminar7.adapter;

public class Lamborghini extends EuropeanCar{

	public Lamborghini(String model) {
		super(model);
	}

	@Override
	public int getMaxSpeed() {
		// in metric system
		return 320;
	}

}
