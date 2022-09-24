import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		
		}
		//"a","e","ı","i","o","ö","u","ü"
		
		
		//Her yiğidin yoğurt yiyişi farklıdır diyerekten kendi
		//yaptığım yöntemi takdim ederim :)
		
		String[] myList1 = { "A", "I", "o", "u"};
		
		String[] myList3 = { "A", "E", "I", "İ", "O", "Ö", "U", "Ü"};

		for (String letter : myList3) {
			if (Arrays.asList(myList1).contains(letter) || 
					Arrays.asList(myList1).contains(letter.toLowerCase()) ) {
				System.out.println(letter + " Kalın seslidir");

			} else {
				System.out.println(letter + " İnce seslidir");

			}

		}
	}
}