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
			for (int b = 1; b <= a ; b++){
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


//soal 4
public class Main {
    public static void calonprogrammer(String nama) {
        System.out.println("Halo,"+nama+"!");
    }
   public static void main(String[] args) {
        calonprogrammer("Andri");
        calonprogrammer("Adam");
        calonprogrammer("Patima");
        calonprogrammer("Rusna");
    }
}

		
//Soal 5
public class Main {
	public int perkalian (int a, int b){
		a = 2;
		b = 5;
		int hasil = a*b;
		return hasil;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		int hasil = obj.perkalian(2,5);
		System.out.println("hasil perkalian = "+ hasil);
	}
}

//soal 6
public class Main {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");  
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
