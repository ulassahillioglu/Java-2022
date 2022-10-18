package Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Employee employee = new Employee();
		employee.firstName = "Ulas";
		customer1.firstName = "Ulas";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.add();
		customerManager.add();
	}

}
