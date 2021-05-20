package ro.ase.cts.seminar12.template;

public class DecimalFormatter extends AbstractFormatter{

	@Override
	public String formatInput(int input) {
		return String.format("%d", input);
	}

}
