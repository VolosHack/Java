public class EmployeeTest{
	
	public static void main(String[] args){
		
		Employee employee1;
		employee1 = new Employee("John", "Green", 500);//create employee object
		
		Employee employee2 = new Employee("Mark", "Grey", 459);//create employee object
		
		System.out.printf("employee1: %s %s. Salary: %.2f\n", employee1.getFirstName(),
						employee1.getLastName(), employee1.getSalary() * 12);
		System.out.printf("employee2: %s %s. Salary: %.2f\n\n", employee2.getFirstName(),
						employee2.getLastName(), employee2.getSalary() * 12);
						
						
		//raise salary by 10%
		employee1.setSalary(employee1.getSalary() * 1.1);
		employee2.setSalary(employee2.getSalary() * 1.1);				
		
		System.out.printf("employee1: %s %s. Salary: %.2f\n", employee1.getFirstName(),
						employee1.getLastName(), employee1.getSalary() * 12);
		System.out.printf("employee2: %s %s. Salary: %.2f\n", employee2.getFirstName(),
						employee2.getLastName(), employee2.getSalary() * 12);
		
	}
}