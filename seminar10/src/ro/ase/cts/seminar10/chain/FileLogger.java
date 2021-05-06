package ro.ase.cts.seminar10.chain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends AbstractLogger{

	public FileLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
	}

	@Override
	void write(String message) {
		System.out.println("Writing log message to file - " + message);
		File file = new File("log.txt");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(message);
			writer.close();
		} catch (IOException e) {
			System.err.println("Could not write log to file");
		}
	}

}
