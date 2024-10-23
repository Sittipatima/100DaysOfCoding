import java.util.Scanner;
public class Day52 {
	public static void main(String[] args) {
	
	 Scanner input = new Scanner (System.in); 
   System.out.print("Masukkan Angka = ");
	 int angka = input.nextInt();
	 String kondisi =(angka % 2 == 0)?"Genap":"Ganjil";       
   System.out.println(kondisi);
	}
}
