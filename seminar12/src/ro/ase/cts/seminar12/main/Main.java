package ro.ase.cts.seminar12.main;

import java.util.ArrayList;

import ro.ase.cts.seminar12.memento.CharacterMemento;
import ro.ase.cts.seminar12.memento.GameCharacter;
import ro.ase.cts.seminar12.observer.CreditAccount;
import ro.ase.cts.seminar12.observer.InsufficientFundsException;
import ro.ase.cts.seminar12.observer.NotificationInterface;
import ro.ase.cts.seminar12.observer.SmsNotification;
import ro.ase.cts.seminar12.template.DecimalFormatter;
import ro.ase.cts.seminar12.template.HexFormatter;

public class Main {

	public static void main(String[] args) {
		CreditAccount account = new CreditAccount(1000, "IBAN00000");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double amount) {
				System.out.println("[Inline example]: "+ amount + " extracted.");
			}
		});
		NotificationInterface smsNotificationService = new SmsNotification();
		account.addObserver(smsNotificationService);
		try {
			account.withdraw(100);
			account.removeObserver(smsNotificationService);
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------------------------");
		ArrayList<CharacterMemento> saveList = new ArrayList<CharacterMemento>();
		GameCharacter myCharacter = new GameCharacter("Alex", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoints: " + myCharacter.getHitpoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoints: " + myCharacter.getHitpoints());
		
		System.out.println("---------------------------------------------------------");
		DecimalFormatter decimalFormatter = new DecimalFormatter();
		decimalFormatter.displayOutput(10);
		HexFormatter hexFormatter = new HexFormatter();
		hexFormatter.displayOutput(10);
	}

}
