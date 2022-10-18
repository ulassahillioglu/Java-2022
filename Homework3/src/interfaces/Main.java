package interfaces;


public class Main {

	public static void main(String[] args) {
		ICustomerDal iCustomerDal = new OracleCustomerDal();
		iCustomerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
	}

}
