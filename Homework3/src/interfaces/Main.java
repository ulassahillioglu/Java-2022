package interfaces;

<<<<<<< HEAD

public class Main {

	public static void main(String[] args) {
		ICustomerDal iCustomerDal = new OracleCustomerDal();
		iCustomerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
=======
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		
		customerManager.add();
		

>>>>>>> refs/heads/master
	}

}
