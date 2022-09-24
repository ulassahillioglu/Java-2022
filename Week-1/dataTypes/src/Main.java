
public class Main {

	public static void main(String[] args) {
		double sayi = 12.5;
		sayi = -129;
		byte sayi2 = 5;
		
		short sayi3 = 127;
		
		int sayi4 = 15677686;
		
		char karakter = 'A';

		boolean dogruMu = true;
		int sayi5 = sayi3;
		sayi2 = (byte) (sayi + sayi3);
		System.out.println(sayi2);
		System.out.println(sayi4 - sayi5);
	}

}