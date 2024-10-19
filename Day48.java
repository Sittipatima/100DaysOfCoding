import java.util.Scanner;
public class Day48 {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
	    System.out.print("Masukkan angka = ");
		int A = aa.nextInt();
		if (A>=85){
			System.out.println("Nilai A");
		}else if (A<=84){
			System.out.println("Nilai B");
		}
	}
}
