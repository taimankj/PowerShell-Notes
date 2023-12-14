package Classes;

//To inherit from the Super Class 'Employee', after the filename, type 'extends <Super Class Name>' 
public class SalariedEmployee extends Employee {
		
	public SalariedEmployee(String firstName, String lastName, double pay) {
		//Super means it's calling the constructor from the inherited Class, "Employee"
		super(firstName, lastName, pay);
	}

	//When automating abstract methods to be created in subclasses, the '@Override' will show so that it can be used as an identifier on what is a abstracted method
	@Override
	public double calculatePay() {
		return getPay() * 80;
	}

}