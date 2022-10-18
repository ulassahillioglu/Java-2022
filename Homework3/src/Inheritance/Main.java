package Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Employee employee = new Employee();
		employee.firstName = "Ulas";
		customer1.firstName = "Engin";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		System.out.println(employee.firstName);
		System.out.println(customer1.firstName);
		employeeManager.add();
		customerManager.add();
	}

}
