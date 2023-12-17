package LabClasses;

public class People {

	private String firstName;
	private String lastName;
	private int age;
	
	public People(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}
	
	public void describe() {
		System.out.println("Name: " + firstName + " " + lastName + "\tAge: " + age);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Invalid age. Should be from 1-119");
		}
	}
	
	
	
}
