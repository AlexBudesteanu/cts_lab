package ro.ase.cts.seminar12.template;

public class HexFormatter extends AbstractFormatter{

	@Override
	public String formatInput(int input) {
		return String.format("%2X", input);
	}

}
