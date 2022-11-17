package interfaces;

public class CustomerManager {
<<<<<<< HEAD
private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
=======
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
		
	}
	
>>>>>>> refs/heads/master
	public void add() {
		customerDal.add();
	}
}
