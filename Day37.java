import java.util.Scanner;
public class day37 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	     
	     System.out.print("Masukkan Angka 1 : ");
	     int B= input.nextInt();
	     System.out.print("Masukkan Angka 2 : ");
	     int T = input.nextInt();
	     B+=T;
	     System.out.println("Hasil = "+ B );
	     System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	     System.out.print("Masukkan Angka 1 : ");
	     int S= input.nextInt();
	     System.out.print("Masukkan Angka 2 : ");
	     int A = input.nextInt();
 	     S-=A;
	     System.out.println("Hasil = "+ S);
	     		
	}
}
