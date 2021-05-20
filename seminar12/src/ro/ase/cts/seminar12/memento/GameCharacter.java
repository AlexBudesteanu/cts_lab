package ro.ase.cts.seminar12.memento;

public class GameCharacter {

	String name;
	int hitpoints;
	
	public GameCharacter(String name, int hitpoints) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
	}
	
	public void bleed() {
		this.hitpoints -= 10;
	}
	
	public CharacterMemento generateMemento() {
		return new CharacterMemento(this.name, this.hitpoints);
	}
	
	public void setMemento(CharacterMemento memento) {
		this.name = memento.name;
		this.hitpoints = memento.hitpoints;
	}

	public String getName() {
		return name;
	}

	public int getHitpoints() {
		return hitpoints;
	}
	
}
