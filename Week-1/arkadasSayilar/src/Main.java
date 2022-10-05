import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number2 = sc2.nextInt();

		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}

		}
		if (number1 == total2 && number2 == total1) {
			System.out.println("Arkadaş sayılar");

		}else {
			System.out.println("Arkadaş değiller");
		}
	}
}
