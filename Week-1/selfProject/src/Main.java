import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//0'dan verilen sayıya kadar olan tamsayıların toplamı
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int total = 0;
		
		for(int i=0;i<number;i++) {
			total = total + i;
		}System.out.println("Toplam : " + total);

	}

}
