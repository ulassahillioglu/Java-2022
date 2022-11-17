package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
<<<<<<< HEAD
		product.name = "Mouse";
		
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
=======
		product.name = "";
		
		manager.add(product);
		
		

>>>>>>> refs/heads/master
	}

}
