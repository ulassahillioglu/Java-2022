package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 244;
		
		int sayi2 = 25;
		
		int sayi3 = 28;
		
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " + enBuyuk);
		if (sayi1>sayi2 & sayi1>sayi3) {
			System.out.println(sayi1 +" en büyüktür");
			
		}else if(sayi2>sayi1 & sayi2>sayi3) {
			System.out.println(sayi2 + " en büyüktür");
		}else {
			System.out.println(sayi3 + " en büyüktür");
		}
	}

}
