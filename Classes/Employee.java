package Classes;

//This is a Super Class meaning it has the keyword abstract in its "public class Employee"
////It also means that classes can inherit from this class with the same properties and methods
//This class can not be instanstiated as an object

public abstract class Employee {
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	//Constructors
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
	}
	
	//abstract methods do not need a body
	////abstract methods has to be implemented by classes inheriting from this class
	//this is what's called a polymorphic method meaning that classes inheriting this class can choose the code that will be in this method and it will be unique to that inherited class
	public abstract double calculatePay();
	
	public String getInformation() {
		return "Name : " + firstName + " " + lastName
				+ "\nReports to: " + reportsTo
				+ "\nAddress: " + address;
	}
	
	//Getter and Setter Methods
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

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

}
