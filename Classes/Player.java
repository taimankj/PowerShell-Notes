package Classes;

public class Player {
	
	private String name;
	private String position;
	private String specialty;
	
	public Player(String name, String position, String specialty) {
		this.setName(name);
		this.setPosition(position);
		this.setSpecialty(specialty);
	}
	
	public void describe() {
		System.out.println("Player: " + name + "\tPosition: " + position + "\tSpecialty: " + specialty);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
}
