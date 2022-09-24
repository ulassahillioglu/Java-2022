
public class Main {

	public static void main(String[] args) {
		
		  String mesaj = "    Bugün hava çok güzel.     "; 
		  System.out.println(mesaj);
		  
//		  System.out.println("Elemen sayısı : " + mesaj.length());
//		  
//		  System.out.println("5. Eleman : " + mesaj.charAt(4));
//		  
//		  System.out.println(mesaj.concat(" Yaşasın!"));
//		  
//		  System.out.println(mesaj.startsWith("b")); //False
//		  System.out.println(mesaj.startsWith("b".toUpperCase())); //True
//		  System.out.println(mesaj.endsWith(".")); //True
//		  System.out.println(mesaj.endsWith("l.")); //True
//		  
//		  char[] karakterler = new char[5]; mesaj.getChars(0,5,karakterler, 0);
//		  System.out.println(karakterler);
//		  
//		  System.out.println(mesaj.indexOf("av"));
//		  System.out.println(mesaj.lastIndexOf("ç"));
		 
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.replace("ü", "u"));
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		System.out.println(mesaj.replace(mesaj.substring(0, 5), "Yarın"));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.strip());
		
	}

}
