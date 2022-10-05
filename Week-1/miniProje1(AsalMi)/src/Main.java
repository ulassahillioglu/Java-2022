import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		if (number < 2) {
			System.out.println("Can't be lower than number 2");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				

			}

		}
		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}
