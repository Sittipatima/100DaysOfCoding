import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Angka 1 = ");
		int a,b,c,d;
		a = input.nextInt();
		System.out.print("Masukkan Angka 2 = ");
		b = input.nextInt();
		a*=b;
		System.out.println("Hasil = " + a);
		System.out.println("~~~~~~~~~~~~~~~~~~~");
	    System.out.print("Masukkan Angka 1 = ");
		c = input.nextInt();
		System.out.print("Masukkan Angka 2 = ");
		d = input.nextInt();
		c/=d;
		System.out.println("Hasil = " + c);
	}
}
