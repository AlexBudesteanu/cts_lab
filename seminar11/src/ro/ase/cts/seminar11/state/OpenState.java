package ro.ase.cts.seminar11.state;

public class OpenState implements GateStateInterface{

	@Override
	public void enter(Gate gate) {
		System.out.println("Entered successfully.");
		gate.setState(new LockedState());
	}

	@Override
	public void authorize(Gate gate) {
		System.out.println("Already authorized user to pass");
	}

}
