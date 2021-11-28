package Payroll_System_Modification;

public class HourlyEmplyee extends Employee{
	private double wage;	// wage per hour
	private double hours;	// hours worked for week
	
	public HourlyEmplyee(String firstName, String lastName, String socialSecurityNumber,
			Date birthDate, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		if(wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		
		if((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	}
	
	public double getWage() {return wage;}
		

	public void setWage(double wage) {
		if(wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		
		this.wage = wage;
	}


	public double getHours() {return hours;}


	public void setHours(double hours) {
		if((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.hours = hours;
	}
	
	@Override
	public double earnings() {
		if (getHours() <= 40) {
			return getWage() * getHours();
		}
		else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(), "hours worked", getHours());
	}
}
