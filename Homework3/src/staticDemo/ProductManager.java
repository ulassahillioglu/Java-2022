package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
<<<<<<< HEAD
		if(ProductValidator.isValid(product)){
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}

=======
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		
>>>>>>> refs/heads/master
	}
}
