package ro.ase.cts.seminar10.command;

public class TurnOffLightCommand implements CommandInterface{

	private LightBulb lightBulb;
	
	public TurnOffLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		lightBulb.turnOffLight();
	}

}
