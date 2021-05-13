package ro.ase.cts.seminar11.state;

public class Gate {

	private GateStateInterface state;

	public Gate() {
		state = new LockedState();
	}
	
	public void setState(GateStateInterface state) {
		this.state = state;
	}
	
	public void enter() {
		System.out.println("Trying to enter the gate");
		state.enter(this);
	}
	
	public void authorize() {
		System.out.println("Trying to authenticate at the gate");
		state.authorize(this);
	}
}
