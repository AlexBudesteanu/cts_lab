package ro.ase.cts.seminar10.command;

public class IncreaseLightIntensityCommand implements CommandInterface{
	private LightBulb bulb;
	
	public IncreaseLightIntensityCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.increaseLightIntensity();
	}
}
