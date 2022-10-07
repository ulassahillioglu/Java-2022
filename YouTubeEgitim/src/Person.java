
public class Person extends Customer{
	private String nationalIdentitiy;
	private String firstName;
	private String lastName;
	
	public Person() {
		
		
	}
	public Person(String nationalIdentitiy, String firstName, String lastName) {
		super();
		this.nationalIdentitiy = nationalIdentitiy;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public String getNationalIdentitiy() {
		return nationalIdentitiy;
	}

	public void setNationalIdentitiy(String nationalIdentitiy) {
		this.nationalIdentitiy = nationalIdentitiy;
		
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	
	}

	
}
