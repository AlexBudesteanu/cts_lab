package ro.ase.cts.seminar10.command;

public class TurnLightOnCommand implements CommandInterface{

	private LightBulb bulb;
	
	public TurnLightOnCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.turnOnLight();
	}

}
