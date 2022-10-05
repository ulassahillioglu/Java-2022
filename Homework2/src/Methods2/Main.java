package Methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(22, 6);
		System.out.println(sayi);
		
		int sayi2 = extract(22, 6);
		System.out.println(sayi2);
		
		int sayi3 = multiply(7, 9);
		System.out.println(sayi3);
		
		int sayi4 = divide(128, 4);
		System.out.println(sayi4);
		
		int toplam = topla2(2,3,4);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int extract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
