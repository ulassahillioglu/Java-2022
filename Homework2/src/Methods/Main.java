package Methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
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
			mesajVer("Sayı mevcuttur : " +  number);
		} else {
			mesajVer("Sayı mevcut değildir : " + number);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
