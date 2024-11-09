import java.util.Scanner;
public class evaluasi {
	public static void main(String[] args) {
		Scanner ss = new Scanner (System.in);
	   // soal 1
        System.out.print("Masukkan angka: ");
        int angka = ss.nextInt();
         int faktorial =1;
        System.out.print(angka + "! = ");
        for (int d = angka; d >= 1; d--) {
            faktorial *= d;
        System.out.print(d+"x");
            }
            System.out.println("= " + faktorial);}
            System.out.println("");
		
   	//soal 2
		int aa = 1;
		for (int a = 1; a a<= 4 ; a++){
			for (int b = 1; b >= a ; b++){
				System.out.print(aa);
				aa++;
			}
			System.out.println("");
		}
		
		//soal 3
		do{
		      System.out.println("Masukkan angka : ");
		      int angkalagi = ss.nextInt();
		      
		      if (angkalagi % 2 == 0 && angkalagi % 3 == 0){
		      	System.out.println("Angka adalah kelipatan 2 dan kelipatan 3. Masukkan Angka lagi.");
		      } else if (angkalagi % 3 == 0){
		      	System.out.println("Angka adalah kelipatan 3");
		      }else if (angkalagi % 2 == 0 ){
		      	System.out.println("Angka adalah kelipatan 2");
		      }else {
		      	System.out.println("Angka bukan kelipatan 2 dan kelipatan 3");
		      }
		      angkalagi++;
		}while(angkalagi % 2 == 0 && angkalagi % 3 == 0);
		
