package Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Employee employee = new Employee();
		employee.firstName = "Ulas";
<<<<<<< HEAD
		customer1.firstName = "Ulas";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
=======
		customer1.firstName = "Engin";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		System.out.println(employee.firstName);
		System.out.println(customer1.firstName);
>>>>>>> refs/heads/master
		employeeManager.add();
		customerManager.add();
	}

}
