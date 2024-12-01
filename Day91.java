import java.util.Scanner;
public class day91{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		while (true){
			int angka = in.nextInt();
			if (angka >= 0){
				System.out.println("Bilangan Bulat");
			}else {
				System.out.println("You And I End");
				break;
			}
		}
	}
}
