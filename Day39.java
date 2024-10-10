import java.util.Scanner;
public class day39 {
	public static void main(String[] args) {	       
	Scanner input = new Scanner (System.in);	
     int a,b,c;
     System.out.print("Masukkan Angka 1 = ");
     a = input.nextInt();
     System.out.print("Masukkan Angka 2 = ");
 	b = input.nextInt();
 	a%=b;
 	System.out.println("Sisa Baginya adalah "+ a);
			}
}
