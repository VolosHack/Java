public class Employee{
	
	//instance variables
	private String firstName;
	private String lastName;
	private double salary;
	
	//constructor
	public Employee(String firstName, String lastName, double salary){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public void setFirstName(String firstName){
		
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		
		return firstName;
	}
	
	public void setLastName(String lastName){
		
		this.lastName = lastName;
	}
	
	public String getLastName(){
		
		return lastName;
	}
	
	//sets salary if salary is positive
	public void setSalary(double salary){
		
		if(salary > 0){
			this.salary = salary;
		}
	}
	
	public double getSalary(){
		
		return salary;
	}
	
}