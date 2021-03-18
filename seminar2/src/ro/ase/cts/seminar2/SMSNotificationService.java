package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.interfaces.NotificationService;

public class SMSNotificationService implements NotificationService{
	
	public void sendNotification(String message) {
		System.out.println("Sent SMS notification with message: " + message );
	}
}
