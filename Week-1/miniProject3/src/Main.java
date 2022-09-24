import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;

			}

		}if (total == number) {
			System.out.println(number + " Mükemmel sayıdır");
	}else {
		System.out.println(number + " Mükemmel sayı değildir");
	
	} 

	}

}
