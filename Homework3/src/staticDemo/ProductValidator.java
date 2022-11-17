package staticDemo;

public class ProductValidator {
	static {
<<<<<<< HEAD
		System.out.println("Static Yapıcı blok çalıştı");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void bisey() {

	}

=======
		System.out.println("Statik yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
>>>>>>> refs/heads/master
}
