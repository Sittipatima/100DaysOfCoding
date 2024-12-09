import java.util.Scanner;
public class day99 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Angka 1 : ");
	int angka = in.nextInt();
	System.out.print("Angka 2 : ");
	int angka1 = in.nextInt();
	System.out.println("1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n5.SisaBagi");
	System.out.print("Pilihan: ");
	int pilihan = in.nextInt();
	if (pilihan == 1){
		angka+=angka1;
		System.out.println("Hasil Penjumlahan : "+angka);
	}else if (pilihan == 2 ){
		angka-=angka1;
		System.out.println(" Hasil Pengurangan : " +angka);
	}else if (pilihan == 3){
		angka*=angka1;
		System.out.println("Hasil Perkalian : "+angka);
	}else if (pilihan == 4){
		angka/=angka1;
		System.out.println("Hasil Pembagian : "+angka);
	}else if (pilihan == 5){
		angka%=angka1;
		System.out.println(" Hasil Sisabagi : "+angka);
	}
	}
}
