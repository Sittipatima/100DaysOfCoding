import java.util.Scanner;
public class Day66{
	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.print("Masukkan Lebar : ");
	int lebar = ss.nextInt();
	System.out.print("Masukkan Panjang : ");
	int panjang= ss.nextInt();
	System.out.println("");
	if (lebar == panjang){
		System.out.println("Pola Persegi");
	}else {
		System.out.println("Pola Persegi Panjang");
	}
	for (int d = 1; d <= lebar; d++){
		for (int i = 1; i <= tinggi; i++){
			System.out.print("o  ");
		}
		System.out.println("o ");
	}
	System.out.println("");
	}
}
