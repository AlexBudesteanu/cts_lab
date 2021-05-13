package ro.ase.cts.seminar10.command;

public class LightBulb {

	int lightIntensity = 0;
	
	public void turnOnLight() {
		System.out.println("Light is ON");
		lightIntensity = 1;
	}
	
	public void turnOffLight() {
		System.out.println("Light is OFF");
		lightIntensity = 0;
	}
	
	public void dimLight() {
		System.out.println("Dimming Light");
		if(lightIntensity > 0) {
			lightIntensity -- ;
		}
		System.out.println("Light is at " + lightIntensity + " intensity level");
	}
	
	public void increaseLightIntensity() {
		System.out.println("Increasing intensity");
		lightIntensity ++ ;
		System.out.println("Light is at " + lightIntensity + " intensity level");
	}
}
