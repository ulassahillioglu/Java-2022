


public class CustomerManager {
	private Logger logger;
	private Customer customer;
	private CreditManagerIN creditManager;
	
	
	public CustomerManager() {
	
		
		
	}
	
	
	public CustomerManager(Logger logger,Customer customer,CreditManagerIN creditManager) {
	
		this.logger = logger;
		this.customer = customer;
		this.creditManager = creditManager;
	}

	





	public void sign() {
		System.out.println("Signed up succesfully");
		logger.log(customer.getId());
	}
	public void delete() {
		System.out.println("Deleted succesfully");
		logger.log2(customer.getId());
	}
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
		creditManager.save();
	}
}
