package ro.ase.cts.seminar7.adapter;

public abstract class EuropeanCar {
private String model;

public EuropeanCar(String model) {
	super();
	this.model = model;
}

public abstract int getMaxSpeed();
}
