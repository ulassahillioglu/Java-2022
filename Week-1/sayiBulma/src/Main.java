
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		boolean varMi = false;

		for (int i : sayilar) {
			if (number == i) {
				varMi = true;
			}

		}
		if (varMi) {
			System.out.println("Sayı mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
		// Bu da kendi yaptığım yöntem
		System.out.println("--------------------");
		Integer[] numbers = {1,2,5,9,11};
		if(Arrays.asList(numbers).contains(number)) {
			
			System.out.println("Mevcuttur");
		}else {
			System.out.println("Mevcut değildir");
		}
		

	}

}
