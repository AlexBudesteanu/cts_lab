package ro.ase.cts.seminar7.adapter;

public class AdapterMetric implements MovableImperial{
	
	private final double multiplier = 0.62137d;
	private EuropeanCar euroCar;
	
	public AdapterMetric(EuropeanCar euroCar) {
		super();
		this.euroCar = euroCar;
	}

	@Override
	public int getMaxSpeed() {
		return kmToMiles();
	}
	
	private int kmToMiles() {
		return (int) (euroCar.getMaxSpeed() * multiplier);
	}

}
