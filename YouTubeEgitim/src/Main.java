import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = sc.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your last name : ");
		String lastName = sc.nextLine();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter your city : ");
		String city = sc.nextLine();

		Person person = new Person();
		person.setId(245);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setNationalIdentitiy("33442255");
		person.setCity(city);

		System.out.println(person.getId());
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getCity());

		Logger customerLogger = new CustomerLogger();

		CustomerManager customerManager = new CustomerManager(customerLogger, person, new MilitaryCreditManager());
		customerManager.sign();
		customerManager.giveCredit();

		System.out.println("--------------");

		Company company = new Company();
		company.setCompanyName("KodlamaIO");
		company.setTaxNumber("12345");
		company.setId(100);
		
		System.out.println(company.getCompanyName());

		CustomerManager customerManager2 = new CustomerManager(customerLogger, company, new TeacherCreditManager());
		customerManager2.sign();
		customerManager2.giveCredit();

		System.out.println("--------------");



		System.out.println("--------------");

		customerManager.delete();

	}

}
